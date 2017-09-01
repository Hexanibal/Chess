package com.chess.chessBoard;

import java.awt.Graphics;

import com.chess.Main;
import com.chess.gui.Pan;
import com.chess.piece.Cavalier;
import com.chess.piece.Empty;
import com.chess.piece.Fou;
import com.chess.piece.Piece;
import com.chess.piece.PieceType;
import com.chess.piece.Pion;
import com.chess.piece.Reine;
import com.chess.piece.Roi;
import com.chess.piece.Tour;
import com.chess.utils.Vector;

public class ChessBoard {

	private Piece[][] pieces;
	private Square[][] board;

	private int selectState;
	private Vector savedPieceLoc;

	public ChessBoard() {
		pieces = new Piece[8][8];
		board = new Square[8][8];

		selectState = 0;
		savedPieceLoc = new Vector();

		initBoard();
		initPieces();

	}

	private void initBoard() {
		boolean b = true;
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				board[x][y] = new Square(new Vector(x, y), (b) ? SquareType.LIGHT : SquareType.DARK);
				b = (b) ? false : true;
			}
			b = (b) ? false : true;
		}
	}

	private void initPieces() {

		/* INIT PLAYER 1 */
		pieces[0][0] = new Tour(new Vector(0, 0), Main.game.getPlayer(1));
		pieces[1][0] = new Cavalier(new Vector(1, 0), Main.game.getPlayer(1));
		pieces[2][0] = new Fou(new Vector(2, 0), Main.game.getPlayer(1));
		pieces[3][0] = new Reine(new Vector(3, 0), Main.game.getPlayer(1));
		pieces[4][0] = new Roi(new Vector(4, 0), Main.game.getPlayer(1));
		pieces[5][0] = new Fou(new Vector(5, 0), Main.game.getPlayer(1));
		pieces[6][0] = new Cavalier(new Vector(6, 0), Main.game.getPlayer(1));
		pieces[7][0] = new Tour(new Vector(7, 0), Main.game.getPlayer(1));

		pieces[0][1] = new Pion(new Vector(0, 1), Main.game.getPlayer(1));
		pieces[1][1] = new Pion(new Vector(1, 1), Main.game.getPlayer(1));
		pieces[2][1] = new Pion(new Vector(2, 1), Main.game.getPlayer(1));
		pieces[3][1] = new Pion(new Vector(3, 1), Main.game.getPlayer(1));
		pieces[4][1] = new Pion(new Vector(4, 1), Main.game.getPlayer(1));
		pieces[5][1] = new Pion(new Vector(5, 1), Main.game.getPlayer(1));
		pieces[6][1] = new Pion(new Vector(6, 1), Main.game.getPlayer(1));
		pieces[7][1] = new Pion(new Vector(7, 1), Main.game.getPlayer(1));

		/* INIT EMPTY ZONE */
		for (int y = 2; y < 6; y++) {
			for (int x = 0; x < 8; x++) {
				pieces[x][y] = new Empty(new Vector(x, y), Main.game.getPlayer(2));
			}
		}

		/* INIT PLAYER 2 */
		pieces[0][6] = new Pion(new Vector(0, 6), Main.game.getPlayer(0));
		pieces[1][6] = new Pion(new Vector(1, 6), Main.game.getPlayer(0));
		pieces[2][6] = new Pion(new Vector(2, 6), Main.game.getPlayer(0));
		pieces[3][6] = new Pion(new Vector(3, 6), Main.game.getPlayer(0));
		pieces[4][6] = new Pion(new Vector(4, 6), Main.game.getPlayer(0));
		pieces[5][6] = new Pion(new Vector(5, 6), Main.game.getPlayer(0));
		pieces[6][6] = new Pion(new Vector(6, 6), Main.game.getPlayer(0));
		pieces[7][6] = new Pion(new Vector(7, 6), Main.game.getPlayer(0));

		pieces[0][7] = new Tour(new Vector(0, 7), Main.game.getPlayer(0));
		pieces[1][7] = new Cavalier(new Vector(1, 7), Main.game.getPlayer(0));
		pieces[2][7] = new Fou(new Vector(2, 7), Main.game.getPlayer(0));
		pieces[3][7] = new Reine(new Vector(3, 7), Main.game.getPlayer(0));
		pieces[4][7] = new Roi(new Vector(4, 7), Main.game.getPlayer(0));
		pieces[5][7] = new Fou(new Vector(5, 7), Main.game.getPlayer(0));
		pieces[6][7] = new Cavalier(new Vector(6, 7), Main.game.getPlayer(0));
		pieces[7][7] = new Tour(new Vector(7, 7), Main.game.getPlayer(0));
	}

	public void displayBoard(Graphics g, Pan pan) {
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				board[x][y].show(g, pan);
			}
		}
	}
	
	public void displayConsoleBoard() {
		System.out.println("\n\n\n\n\n");

		for (int y = 0; y < 8; y++) {
			System.out.println("=========================================");
			System.out.print("|");
			for (int x = 0; x < 8; x++) {
				System.out.print(" " + pieces[x][y].getType().getTag() + " |");
			}
			System.out.println("");
		}
		System.out.println("=========================================");
	}

	public void displayPieces(Graphics g, Pan pan) {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				pieces[x][y].show(g, pan);
			}
		}
	}

	// 4 output ->
	// tab[0] -> left top corner
	// tab[1] -> right top corner
	// tab[2] -> rigth bottom corner
	// tab[3] -> left bottom corner
	/* GET PX COORDS FROM SQUARE LOC */
	public Vector[] getPixCoords(Vector squareLoc) {
		int sx = (int) (Main.frame.getContentPane().getSize().getWidth()) / 8;
		int sy = (int) (Main.frame.getContentPane().getSize().getHeight()) / 8;

		Vector[] pixelsLocs = { new Vector(squareLoc.x * sx, squareLoc.y * sy),
				new Vector(squareLoc.x * sx + sx, squareLoc.y * sy),
				new Vector(squareLoc.x * sx + sx, squareLoc.y * sy + sy),
				new Vector(squareLoc.x * sx, squareLoc.y * sy + sy) };
		return pixelsLocs;
	}

	/* GET SQUARE LOC FROM PX INPUT LOC */
	public Vector getSquareCoord(Vector pxLoc) {
		int sx = (int) (Main.frame.getContentPane().getSize().getWidth()) / 8;
		int sy = (int) (Main.frame.getContentPane().getSize().getHeight()) / 8;
		return new Vector((pxLoc.x - pxLoc.x % sx) / sx, (pxLoc.y - pxLoc.y % sy) / sy);
	}

	public Vector getBoardLoc(Vector pxLoc) {
		return new Vector();
	}

	public void movePiece(Piece piece, Vector targetLoc) {
		Vector lastLoc = piece.getLocation();
		pieces[targetLoc.x][targetLoc.y] = piece;
		piece.setLocation(targetLoc);
		pieces[lastLoc.x][lastLoc.y] = new Empty(lastLoc, Main.game.getPlayer(2));
	}

	public void registerClick(Vector pxLoc) {
		Vector clickedSquare = getSquareCoord(pxLoc);

		/* ON SELECT PREMIERE CASE ET PATH*/
		if (selectState == 0) {
			if (!pieces[clickedSquare.x][clickedSquare.y].getType().equals(PieceType.EMPTY)) {
				showPath(pieces[clickedSquare.x][clickedSquare.y]);
				savedPieceLoc = clickedSquare;
				selectState = 1;
			}
		}
		/* ON MOVE SUR CLICKED SQUARE*/
		else if (selectState == 1) {
			Piece p = getPiece(savedPieceLoc);
			if (p.isValablePath(clickedSquare)) {
				movePiece(p, clickedSquare);
			} else {
				System.out.println("invalide path");
			}
			unSelectBoard();
			selectState = 0;
		}
	}
	
	private void showPath(Piece piece) {
		board[piece.getLocation().x][piece.getLocation().y].select(SelectType.FIRST);
		piece.refreshPath();
		for(Vector v : piece.getPath()){
			board[v.x][v.y].select(SelectType.PATH);
		}
	}

	private void unSelectBoard() {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				board[x][y].unSelect();
			}
		}
	}

	public Piece getPiece(Vector loc) {
		return pieces[loc.x][loc.y];
	}
	
}

// public void displayConsoleBoard() {
// for (int y = 0; y < 8; y++) {
// System.out.println("=========================================");
// System.out.print("|");
// for (int x = 0; x < 8; x++) {
// System.out.print(" " + pieces[x][y].getType().getTag() + " |");
//// System.out.print(" " + x + " " + y + " |");
// try {
// Thread.sleep(100);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// System.out.println("");
// }
// System.out.println("=========================================");
// }

/// * INIT PLAYER 1 */
// pieces[0][0] = new Tour(new Vector(0, 0), Main.game.getPlayer(0));
// pieces[1][0] = new Cavalier(new Vector(1, 0), Main.game.getPlayer(0));
// pieces[2][0] = new Fou(new Vector(2, 0), Main.game.getPlayer(0));
// pieces[3][0] = new Roi(new Vector(3, 0), Main.game.getPlayer(0));
// pieces[4][0] = new Reine(new Vector(4, 0), Main.game.getPlayer(0));
// pieces[5][0] = new Fou(new Vector(5, 0), Main.game.getPlayer(0));
// pieces[6][0] = new Cavalier(new Vector(6, 0), Main.game.getPlayer(0));
// pieces[7][0] = new Tour(new Vector(7, 0), Main.game.getPlayer(0));
//
// pieces[0][1] = new Pion(new Vector(0, 1), Main.game.getPlayer(0));
// pieces[1][1] = new Pion(new Vector(1, 1), Main.game.getPlayer(0));
// pieces[2][1] = new Pion(new Vector(2, 1), Main.game.getPlayer(0));
// pieces[3][1] = new Pion(new Vector(3, 1), Main.game.getPlayer(0));
// pieces[4][1] = new Pion(new Vector(4, 1), Main.game.getPlayer(0));
// pieces[5][1] = new Pion(new Vector(5, 1), Main.game.getPlayer(0));
// pieces[6][1] = new Pion(new Vector(6, 1), Main.game.getPlayer(0));
// pieces[7][1] = new Pion(new Vector(7, 1), Main.game.getPlayer(0));
//
/// * INIT EMPTY ZONE */
// for (int y = 2; y < 6; y++) {
// for (int x = 0; x < 8; x++) {
// pieces[x][y] = new Empty(new Vector(x, y), Main.game.getPlayer(2));
// }
// }
//
/// * INIT PLAYER 2 */
// pieces[0][6] = new Pion(new Vector(0, 6), Main.game.getPlayer(1));
// pieces[1][6] = new Pion(new Vector(1, 6), Main.game.getPlayer(1));
// pieces[2][6] = new Pion(new Vector(2, 6), Main.game.getPlayer(1));
// pieces[3][6] = new Pion(new Vector(3, 6), Main.game.getPlayer(1));
// pieces[4][6] = new Pion(new Vector(4, 6), Main.game.getPlayer(1));
// pieces[5][6] = new Pion(new Vector(5, 6), Main.game.getPlayer(1));
// pieces[6][6] = new Pion(new Vector(6, 6), Main.game.getPlayer(1));
// pieces[7][6] = new Pion(new Vector(7, 6), Main.game.getPlayer(1));
//
// pieces[0][7] = new Tour(new Vector(0, 7), Main.game.getPlayer(1));
// pieces[1][7] = new Cavalier(new Vector(1, 7), Main.game.getPlayer(1));
// pieces[2][7] = new Fou(new Vector(2, 7), Main.game.getPlayer(1));
// pieces[3][7] = new Roi(new Vector(3, 7), Main.game.getPlayer(1));
// pieces[4][7] = new Reine(new Vector(4, 7), Main.game.getPlayer(1));
// pieces[5][7] = new Fou(new Vector(5, 7), Main.game.getPlayer(1));
// pieces[6][7] = new Cavalier(new Vector(6, 7), Main.game.getPlayer(1));
// pieces[7][7] = new Tour(new Vector(7, 7), Main.game.getPlayer(1));

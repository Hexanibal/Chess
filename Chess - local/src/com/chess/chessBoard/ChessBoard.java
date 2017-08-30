package com.chess.chessBoard;

import java.awt.Graphics;

import com.chess.Main;
import com.chess.gui.Pan;
import com.chess.piece.*;
import com.chess.utils.Vector;

public class ChessBoard {

	private Piece[][] pieces;
	private Square[][] board;
	
	public ChessBoard() {
		pieces = new Piece[8][8];
		board = new Square[8][8];
		
		initBoard();
		initPieces();

	}

	private void initBoard() {
		boolean b = true;
		for(int y = 0; y < 8; y++){
			for(int x = 0; x < 8; x++){
				board[x][y] = new Square(new Vector(x, y), (b) ? SquareColor.LIGHT : SquareColor.DARK);
				b = (b) ? false : true;
			}
			b = (b) ? false : true;
		}
	}
	
	private void initPieces() {
		/* INIT PLAYER 1 */
		pieces[0][0] = new Tour(new Vector(0, 0), Main.game.getPlayer(0));
		pieces[1][0] = new Cavalier(new Vector(1, 0), Main.game.getPlayer(0));
		pieces[2][0] = new Fou(new Vector(2, 0), Main.game.getPlayer(0));
		pieces[3][0] = new Roi(new Vector(3, 0), Main.game.getPlayer(0));
		pieces[4][0] = new Reine(new Vector(4, 0), Main.game.getPlayer(0));
		pieces[5][0] = new Fou(new Vector(5, 0), Main.game.getPlayer(0));
		pieces[6][0] = new Cavalier(new Vector(6, 0), Main.game.getPlayer(0));
		pieces[7][0] = new Tour(new Vector(7, 0), Main.game.getPlayer(0));

		pieces[0][1] = new Pion(new Vector(0, 1), Main.game.getPlayer(0));
		pieces[1][1] = new Pion(new Vector(1, 1), Main.game.getPlayer(0));
		pieces[2][1] = new Pion(new Vector(2, 1), Main.game.getPlayer(0));
		pieces[3][1] = new Pion(new Vector(3, 1), Main.game.getPlayer(0));
		pieces[4][1] = new Pion(new Vector(4, 1), Main.game.getPlayer(0));
		pieces[5][1] = new Pion(new Vector(5, 1), Main.game.getPlayer(0));
		pieces[6][1] = new Pion(new Vector(6, 1), Main.game.getPlayer(0));
		pieces[7][1] = new Pion(new Vector(7, 1), Main.game.getPlayer(0));

		/* INIT EMPTY ZONE */
		for (int y = 2; y < 6; y++) {
			for (int x = 0; x < 8; x++) {
				pieces[x][y] = new Empty(new Vector(x, y), Main.game.getPlayer(2));
			}
		}

		/* INIT PLAYER 2 */
		pieces[0][6] = new Pion(new Vector(0, 6), Main.game.getPlayer(1));
		pieces[1][6] = new Pion(new Vector(1, 6), Main.game.getPlayer(1));
		pieces[2][6] = new Pion(new Vector(2, 6), Main.game.getPlayer(1));
		pieces[3][6] = new Pion(new Vector(3, 6), Main.game.getPlayer(1));
		pieces[4][6] = new Pion(new Vector(4, 6), Main.game.getPlayer(1));
		pieces[5][6] = new Pion(new Vector(5, 6), Main.game.getPlayer(1));
		pieces[6][6] = new Pion(new Vector(6, 6), Main.game.getPlayer(1));
		pieces[7][6] = new Pion(new Vector(7, 6), Main.game.getPlayer(1));

		pieces[0][7] = new Tour(new Vector(0, 7), Main.game.getPlayer(1));
		pieces[1][7] = new Cavalier(new Vector(1, 7), Main.game.getPlayer(1));
		pieces[2][7] = new Fou(new Vector(2, 7), Main.game.getPlayer(1));
		pieces[3][7] = new Roi(new Vector(3, 7), Main.game.getPlayer(1));
		pieces[4][7] = new Reine(new Vector(4, 7), Main.game.getPlayer(1));
		pieces[5][7] = new Fou(new Vector(5, 7), Main.game.getPlayer(1));
		pieces[6][7] = new Cavalier(new Vector(6, 7), Main.game.getPlayer(1));
		pieces[7][7] = new Tour(new Vector(7, 7), Main.game.getPlayer(1));
	}

	public void displayBoard(Graphics g, Pan pan) {
		for(int y = 0; y < 8; y++){
			for(int x = 0; x < 8; x++){
				board[x][y].show(g, pan);
			}
		}
	}
	
	public void displayPieces(Graphics g, Pan pan){
		for(int x = 0; x < 8; x++){
			for(int y = 0; y < 8; y++){
				pieces[x][y].show(g, pan);
			}
		}
	}

	// 4 output ->
	// tab[0] -> left top corner
	// tab[1] -> right top corner
	// tab[2] -> rigth bottom corner
	// tab[3] -> left bottom corner
	public Vector[] getPixCoord(Vector boardLocs) {
		int sx =  (int) (Main.frame.getContentPane().getSize().getWidth()) / 8;
		int sy = (int) (Main.frame.getContentPane().getSize().getHeight()) / 8;
		
 		Vector[] pixelsLocs = {new Vector(boardLocs.x * sx, boardLocs.y * sy),
				new Vector(boardLocs.x * sx + sx, boardLocs.y * sy),
				new Vector(boardLocs.x * sx + sx, boardLocs.y * sy + sy),
				new Vector(boardLocs.x * sx, boardLocs.y * sy + sy)};
		return pixelsLocs;
	}
	
	public Vector getBoardLoc(Vector pxLoc){
		return new Vector();
	}
	
	public void movePiece(Piece piece) {
		
	}
	
}





//public void displayConsoleBoard() {
//	for (int y = 0; y < 8; y++) {
//		System.out.println("=========================================");
//		System.out.print("|");
//		for (int x = 0; x < 8; x++) {
//			System.out.print(" " + pieces[x][y].getType().getTag() + " |");
////			System.out.print(" " + x + " " + y + " |");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("");
//	}
//	System.out.println("=========================================");
//}

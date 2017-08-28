package com.chess;

import com.chess.piece.*;
import com.chess.utils.Vector;

public class ChessBoard {

	private Piece[][] board;

	public ChessBoard() {
		board = new Piece[8][8];
		initBoard();

	}

	private void initBoard() {
		/* INIT PLAYER 1 */
		board[0][0] = new Tour(new Vector(0, 0), Main.game.getPlayer(0));
		board[1][0] = new Cavalier(new Vector(1, 0), Main.game.getPlayer(0));
		board[2][0] = new Fou(new Vector(2, 0), Main.game.getPlayer(0));
		board[3][0] = new Roi(new Vector(3, 0), Main.game.getPlayer(0));
		board[4][0] = new Reine(new Vector(4, 0), Main.game.getPlayer(0));
		board[5][0] = new Fou(new Vector(5, 0), Main.game.getPlayer(0));
		board[6][0] = new Cavalier(new Vector(6, 0), Main.game.getPlayer(0));
		board[7][0] = new Tour(new Vector(7, 0), Main.game.getPlayer(0));

		board[0][1] = new Pion(new Vector(0, 1), Main.game.getPlayer(0));
		board[1][1] = new Pion(new Vector(1, 1), Main.game.getPlayer(0));
		board[2][1] = new Pion(new Vector(2, 1), Main.game.getPlayer(0));
		board[3][1] = new Pion(new Vector(3, 1), Main.game.getPlayer(0));
		board[4][1] = new Pion(new Vector(4, 1), Main.game.getPlayer(0));
		board[5][1] = new Pion(new Vector(5, 1), Main.game.getPlayer(0));
		board[6][1] = new Pion(new Vector(6, 1), Main.game.getPlayer(0));
		board[7][1] = new Pion(new Vector(7, 1), Main.game.getPlayer(0));

		/* INIT EMPTY ZONE */
		for (int y = 2; y < 6; y++) {
			for (int x = 0; x < 8; x++) {
				board[x][y] = new Empty(new Vector(x, y));
			}
		}

		/* INIT PLAYER 2 */
		board[0][6] = new Pion(new Vector(0, 6), Main.game.getPlayer(1));
		board[1][6] = new Pion(new Vector(1, 6), Main.game.getPlayer(1));
		board[2][6] = new Pion(new Vector(2, 6), Main.game.getPlayer(1));
		board[3][6] = new Pion(new Vector(3, 6), Main.game.getPlayer(1));
		board[4][6] = new Pion(new Vector(4, 6), Main.game.getPlayer(1));
		board[5][6] = new Pion(new Vector(5, 6), Main.game.getPlayer(1));
		board[6][6] = new Pion(new Vector(6, 6), Main.game.getPlayer(1));
		board[7][6] = new Pion(new Vector(7, 6), Main.game.getPlayer(1));

		board[0][7] = new Tour(new Vector(0, 7), Main.game.getPlayer(1));
		board[1][7] = new Cavalier(new Vector(1, 7), Main.game.getPlayer(1));
		board[2][7] = new Fou(new Vector(2, 7), Main.game.getPlayer(1));
		board[3][7] = new Roi(new Vector(3, 7), Main.game.getPlayer(1));
		board[4][7] = new Reine(new Vector(4, 7), Main.game.getPlayer(1));
		board[5][7] = new Fou(new Vector(5, 7), Main.game.getPlayer(1));
		board[6][7] = new Cavalier(new Vector(6, 7), Main.game.getPlayer(1));
		board[7][7] = new Tour(new Vector(7, 7), Main.game.getPlayer(1));
	}

	public void displayBoard() {
		for (int y = 0; y < 8; y++) {
			System.out.println("=========================================");
			System.out.print("|");
			for (int x = 0; x < 8; x++) {
				System.out.print(" " + board[x][y].getType().getTag() + " |");
//				System.out.print(" " + x + " " + y + " |");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("");
		}
		System.out.println("=========================================");
	}

}

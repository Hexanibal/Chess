package com.chess;

import com.chess.chessBoard.ChessBoard;

public class Game {

	private ChessBoard board;
	private Player[] players;
	
	public Game() {
		players = new Player[3];
		players[0] = new Player(PlayerColor.WHITE);
		players[1] = new Player(PlayerColor.BLACK);
		players[2] = new Player(PlayerColor.NULL);
	}
	
	public ChessBoard getBoard(){
		return board;
	}
	
	public void setBoard(){
		board = new ChessBoard();
	}
	
	public Player getPlayer(int index) {
		return players[index];
	}
}

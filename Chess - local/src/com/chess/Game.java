package com.chess;

public class Game {

	private ChessBoard board;
	private Player[] players;
	
	public Game() {
		players = new Player[2];
		players[0] = new Player(PlayerColor.WHITE);
		players[1] = new Player(PlayerColor.BLACK);
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

package com.chess;

public class Main {

	public static Game game;
	
	public static void main(String[] args) {
		game = new Game();
		game.setBoard();
		game.getBoard().displayBoard();
	}

}

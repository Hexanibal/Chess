package com.chess;

import com.chess.gui.Window;

public class Main {

	public static int sx = 800, sy = 800;
	
	public static Game game;
	public static Window frame;
	
	public static void main(String[] args) {
		game = new Game();
		game.setBoard();
		
		frame = new Window();
				
//		game.getBoard().displayBoard();
	}

}

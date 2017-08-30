package com.chess;

import java.io.IOException;

import com.chess.gui.RefreshThread;
import com.chess.gui.Window;
import com.chess.gui.textures.TexturesManager;

public class Main {

	public static int sx = 800, sy = 800;
	
	public static Game game;
	public static TexturesManager texturesManager;
	public static Window frame;
	
	public static void main(String[] args) throws IOException {
		game = new Game();
		game.setBoard();
		
		texturesManager = new TexturesManager();
		
		frame = new Window();
				
		Thread t = new Thread(new RefreshThread());
		t.start();
	}

}

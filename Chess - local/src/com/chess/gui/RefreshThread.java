package com.chess.gui;

import com.chess.Main;

public class RefreshThread implements Runnable{

	static int framerate = 60;
	
	@Override
	public void run() {

		int i = 1000 / framerate;

		for(;;){
			Main.frame.repaint();
			//Main.game.getBoard().displayConsoleBoard();
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

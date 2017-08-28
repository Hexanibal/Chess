package com.chess.gui;

import com.chess.Main;

public class RefreshThread implements Runnable{

	static int framerate = 10;
	
	@Override
	public void run() {

		int i = 1000 / framerate;

		for(;;){
			Main.frame.repaint();
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

package com.chess.chessBoard;

import java.awt.Graphics;

import com.chess.Main;
import com.chess.gui.Pan;
import com.chess.utils.Vector;

public class Square {

	Vector loc;
	SquareColor color;
	
	public Square(Vector loc, SquareColor color) {
		this.loc = loc;
		this.color = color;
	}
	
	public void show(Graphics g, Pan pan) {
		int sx =  (int) (Main.frame.getContentPane().getSize().getWidth()) / 8;
		int sy = (int) (Main.frame.getContentPane().getSize().getHeight()) / 8;		
		
		g.setColor(color.getColor());
		g.fillRect(loc.x * sx, loc.y * sy, sx, sy);
	}
	
}

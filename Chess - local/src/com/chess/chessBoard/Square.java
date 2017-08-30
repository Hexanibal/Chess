package com.chess.chessBoard;

import java.awt.Color;
import java.awt.Graphics;

import com.chess.Main;
import com.chess.gui.Pan;
import com.chess.utils.Vector;

public class Square {

	private Vector loc;
	private SquareType sqType;
	private SelectType sType;
	private Color color;

	public Square(Vector loc, SquareType sqType) {
		this.loc = loc;
		this.sqType = sqType;
		this.color = sqType.getColor();
		this.sType = SelectType.NULL;
	}

	public void show(Graphics g, Pan pan) {
		int sx = (int) (Main.frame.getContentPane().getSize().getWidth()) / 8;
		int sy = (int) (Main.frame.getContentPane().getSize().getHeight()) / 8;

		g.setColor(color);
		g.fillRect(loc.x * sx, loc.y * sy, sx, sy);
	}

	public void select(SelectType sType) {
		this.sType = sType;
		color = sType.getColor();
	}

	public void unSelect() {
		sType = SelectType.NULL;
		color = sqType.getColor();
	}

	public SelectType getSelectType() {
		return sType;
	}

}

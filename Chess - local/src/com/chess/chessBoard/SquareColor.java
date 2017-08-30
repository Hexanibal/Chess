package com.chess.chessBoard;

import java.awt.Color;

public enum SquareColor {

	LIGHT(new Color(253, 252, 220)),
	DARK(new Color(64, 47, 13));
	
	Color color;
	private SquareColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
}

package com.chess.chessBoard;

import java.awt.Color;

public enum SquareType {

	LIGHT(new Color(253, 252, 220)),
	DARK(new Color(64, 47, 13));
	
	
	Color color;
	private SquareType(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
}

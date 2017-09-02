package com.chess.chessBoard;

import java.awt.Color;

public enum SelectType {
	
	NULL(new Color(0, 255, 0)),
	PATH(new Color(74, 213, 195)),
	INVALIDE(new Color(255, 0, 0)),
	FIRST(new Color(74, 148, 213));
	
	Color color;
	private SelectType(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
}

package com.chess.piece;

public enum PieceType {
	
	EMPTY("  "),
	PION("pi"),
	TOUR("to"),
	CAVALIER("ca"),
	FOU("fo"),
	REINE("re"),
	ROI("ro");

	String s;
	
	private PieceType(String s) {
		this.s = s;
	}
	
	public String getTag(){
		return s;
	}
	
}

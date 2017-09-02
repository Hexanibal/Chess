package com.chess.pieces;

import com.chess.gui.textures.TextureType;

public enum PieceType {
	
	EMPTY("  ", TextureType.EMPTY),
	PION("pi", TextureType.PION),
	TOUR("to", TextureType.TOUR),
	CAVALIER("ca", TextureType.CAVALIER),
	FOU("fo", TextureType.FOU),
	REINE("re", TextureType.REINE),
	ROI("ro", TextureType.ROI);

	String s;
	TextureType texture;
	
	private PieceType(String s, TextureType texture) {
		this.s = s;
		this.texture = texture;
	}
	
	public String getTag(){
		return s;
	}
	
	public TextureType getTextureType() {
		return texture;
	}
	
}

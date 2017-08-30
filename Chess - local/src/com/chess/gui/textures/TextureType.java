package com.chess.gui.textures;

import java.awt.Image;

import com.chess.Main;
import com.chess.PlayerColor;

public enum TextureType {

	EMPTY(0),
	PION(1),
	TOUR(3),
	CAVALIER(5),
	FOU(7),
	REINE(9),
	ROI(11);
	
	
	int index;
	private TextureType(int index) {
		this.index = index;
	}
	
	private int getIndexOfTexture(PlayerColor color){
		return (color.equals(PlayerColor.NULL) ? index : (color.equals(PlayerColor.WHITE) ? index : index + 1));
	}
	
	public Image getTexture(PlayerColor color){
		return Main.texturesManager.getTexture(getIndexOfTexture(color));
	}
	
}

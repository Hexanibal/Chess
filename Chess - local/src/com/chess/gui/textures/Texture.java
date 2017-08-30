package com.chess.gui.textures;

import java.awt.Image;

import com.chess.Main;

public enum Texture {

	EMPTY(0),
	PION_W(1),
	PION_B(2),
	TOUR_W(3),
	TOUR_B(4),
	CAVALIER_W(5),
	CAVALIER_B(6),
	FOU_W(7),
	FOU_B(8),
	REINE_W(9),
	REINE_B(10),
	ROI_W(11),
	ROI_B(12);
	
	int i;
	private Texture(int i) {
		this.i = i;
	}
	
	public Image getTexture(){
		return Main.texturesManager.getTexture(i);
	}
}

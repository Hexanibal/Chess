package com.chess.gui.textures;

import java.awt.Image;

import com.chess.Main;

public enum Texture {

	EMPTY(0),
	PION(1);
	
	int i;
	private Texture(int i) {
		this.i = i;
	}
	
	public Image getTexture(){
		return Main.texturesManager.getTexture(i);
	}
}

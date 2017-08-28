package com.chess.gui.textures;

import java.awt.Image;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class TexturesManager {

	private HashMap<Integer, Image> map;
	
	private Image pion;
	private Image empty;
	
	public TexturesManager() throws IOException {
		map = new HashMap<>();
		
		pion = ImageIO.read(getClass().getResource("/res/img/Pion.png"));
		empty = ImageIO.read(getClass().getResource("/res/img/Empty.png"));
		
		map.put(0, empty);
		map.put(1, pion);
	}
	
	public Image getTexture(int index){
		return map.get(index);
	}
	
}

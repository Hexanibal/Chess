package com.chess.gui.textures;

import java.awt.Image;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class TexturesManager {

	private HashMap<Integer, Image> map;
	
	private Image pion_w;
	private Image pion_b;
	private Image empty;
	
	public TexturesManager() throws IOException {
		map = new HashMap<>();
		
		pion_w = ImageIO.read(getClass().getResource("/res/img/pion-w.png"));
		pion_b = ImageIO.read(getClass().getResource("/res/img/pion-b.png"));
		empty = ImageIO.read(getClass().getResource("/res/img/empty.png"));
		
		map.put(0, empty);
		map.put(1, pion_w);
		map.put(2, pion_b);
		map.put(3, pion_w);
		map.put(4, pion_b);
		map.put(5, pion_w);
		map.put(6, pion_b);
		map.put(7, pion_w);
		map.put(8, pion_b);
		map.put(9, pion_w);
		map.put(10, pion_b);
		map.put(11, pion_w);
		map.put(12, pion_b);
	}
	
	public Image getTexture(int index){
		return map.get(index);
	}
	
}

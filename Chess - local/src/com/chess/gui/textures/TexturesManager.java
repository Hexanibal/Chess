package com.chess.gui.textures;

import java.awt.Image;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class TexturesManager {

	private HashMap<Integer, Image> map;
	
	private Image empty;
	
	private Image pion_w;
	private Image pion_b;
	
	private Image tour_w;
	private Image tour_b;
	
	private Image cavalier_w;
	private Image cavalier_b;
	
	private Image fou_w;
	private Image fou_b;
	
	private Image reine_w;
	private Image reine_b;
	
	private Image roi_w;
	private Image roi_b;
	
	public TexturesManager() throws IOException {
		map = new HashMap<>();
		
		empty = ImageIO.read(getClass().getResource("/res/img/empty.png"));
		
		pion_w = ImageIO.read(getClass().getResource("/res/img/pion-w.png"));
		pion_b = ImageIO.read(getClass().getResource("/res/img/pion-b.png"));
		
		tour_w = ImageIO.read(getClass().getResource("/res/img/tour-w.png"));
		tour_b = ImageIO.read(getClass().getResource("/res/img/tour-b.png"));
		
		cavalier_w = ImageIO.read(getClass().getResourceAsStream("/res/img/cavalier-w.png"));
		cavalier_b = ImageIO.read(getClass().getResourceAsStream("/res/img/cavalier-b.png"));
		
		fou_w = ImageIO.read(getClass().getResourceAsStream("/res/img/fou-w.png"));
		fou_b = ImageIO.read(getClass().getResourceAsStream("/res/img/fou-b.png"));
		
		reine_w = ImageIO.read(getClass().getResourceAsStream("/res/img/roi-w.png"));
		reine_b = ImageIO.read(getClass().getResourceAsStream("/res/img/roi-b.png"));
		
		roi_w = ImageIO.read(getClass().getResourceAsStream("/res/img/reine-w.png"));
		roi_b = ImageIO.read(getClass().getResourceAsStream("/res/img/reine-b.png"));
		
		map.put(0, empty);
		map.put(1, pion_w);
		map.put(2, pion_b);
		map.put(3, tour_w);
		map.put(4, tour_b);
		map.put(5, cavalier_w);
		map.put(6, cavalier_b);
		map.put(7, fou_w);
		map.put(8, fou_b);
		map.put(9, reine_w);
		map.put(10, reine_b);
		map.put(11, roi_w);
		map.put(12, roi_b);
	}
	
	public Image getTexture(int index){
		return map.get(index);
	}
	
}

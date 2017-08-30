package com.chess.piece;

import java.awt.Graphics;
import java.awt.Image;

import com.chess.Main;
import com.chess.Player;
import com.chess.gui.Pan;
import com.chess.gui.textures.TextureType;
import com.chess.utils.Vector;

public abstract class Piece {

	protected PieceType type;
	protected Vector loc;
	protected Player player;
	protected TextureType texture;
	
	public Piece(Vector loc, Player player, PieceType type) {
		this.type = type;
		this.loc = loc;
		this.player = player;
		this.texture = type.getTextureType();
	}
	
	public abstract boolean isValablePath(Vector startPoint, Vector endPoint);
	
	public abstract void move(Vector startPoint, Vector endPoint);

	public PieceType getType() {
		return type;
	}
	
	public void setType(PieceType type){
		this.type = type;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Vector getLocation() {
		return loc;
	}
	
	public void show(Graphics g, Pan pan){
		int sx =  (int) (Main.frame.getContentPane().getSize().getWidth()) / 8;
		int sy = (int) (Main.frame.getContentPane().getSize().getHeight()) / 8;
		
		Vector ctl = Main.game.getBoard().getPixCoord(new Vector(loc.x, loc.y))[0];
		g.drawImage(getTexture(), ctl.x, ctl.y, sx, sy, pan);
	}
	
	public Image getTexture(){
		return texture.getTexture(player.getColor());
	}
	
}

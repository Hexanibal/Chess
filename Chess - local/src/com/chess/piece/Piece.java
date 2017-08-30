package com.chess.piece;

import java.awt.Image;

import com.chess.Player;
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
	
	public Image getTexture(){
		return texture.getTexture(player.getColor());
	}
	
}

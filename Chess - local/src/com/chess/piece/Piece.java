package com.chess.piece;

import com.chess.Player;
import com.chess.utils.Vector;

public abstract class Piece {

	protected PieceType type;
	protected Vector loc;
	protected Player player;
	
	public Piece(Vector loc, Player player, PieceType type) {
		this.type = type;
		this.loc = loc;
		this.player = player;
	}
		public Piece(Vector loc, PieceType type) {
		this.loc = loc;
		this.type = type;
	}

	
	public abstract boolean isValablePath(Vector startPoint, Vector endPoint);
	
	public abstract void move(Vector startPoint, Vector endPoint);

	public PieceType getType() {
		return type;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Vector getLocation() {
		return loc;
	}
	
}

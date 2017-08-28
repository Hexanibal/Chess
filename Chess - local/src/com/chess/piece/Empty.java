package com.chess.piece;

import com.chess.utils.Vector;

public class Empty extends Piece{

	public Empty(Vector loc) {
		super(loc, PieceType.EMPTY);
	}

	@Override
	public boolean isValablePath(Vector startPoint, Vector endPoint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void move(Vector startPoint, Vector endPoint) {
		// TODO Auto-generated method stub
		
	}
	
}

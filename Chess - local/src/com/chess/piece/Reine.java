package com.chess.piece;

import com.chess.Player;
import com.chess.utils.Vector;

public class Reine extends Piece{

	public Reine(Vector loc, Player player) {
		super(loc, player, PieceType.REINE);
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

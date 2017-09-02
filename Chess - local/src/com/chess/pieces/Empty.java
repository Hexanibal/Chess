package com.chess.pieces;

import com.chess.Player;
import com.chess.utils.Vector;

public class Empty extends Piece{

	public Empty(Vector loc, Player player) {
		super(loc, player, PieceType.EMPTY);
	}

	@Override
	public void refreshPath() {
		// TODO Auto-generated method stub
		
	}

}

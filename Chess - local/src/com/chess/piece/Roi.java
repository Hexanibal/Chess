package com.chess.piece;

import com.chess.Player;
import com.chess.utils.Vector;

public class Roi extends Piece{

	public Roi(Vector loc, Player player) {
		super(loc, player, PieceType.ROI);
	
}

	@Override
	public void refreshPath() {
		// TODO Auto-generated method stub
		
	}
}
package com.chess.pieces;

import java.util.ArrayList;

import com.chess.Main;
import com.chess.Player;
import com.chess.PlayerColor;
import com.chess.utils.Vector;

public class Cavalier extends Piece{

	public Cavalier(Vector loc, Player player) {
		super(loc, player, PieceType.CAVALIER);
	}

	@Override
	public void refreshPath() {
		ArrayList<Vector> path = new ArrayList<>();
		board = Main.game.getBoard();

		if(getPlayer().getColor().equals(PlayerColor.WHITE)) {
			if(loc.y > 1){
				if(loc.x > 0){
					if(!board.getPiece(new Vector(loc.x - 1, loc.y - 2)).getPlayer().getColor().equals(PlayerColor.WHITE)){
						path.add(new Vector(loc.x - 1, loc.y - 2));
					}
				}
				if(loc.x < 7){
					if(!board.getPiece(new Vector(loc.x + 1, loc.y - 2)).getPlayer().getColor().equals(PlayerColor.WHITE)){
						path.add(new Vector(loc.x + 1, loc.y - 2));
					}
				}
			}
			if(loc.y > 0){
				if(loc.x > 1){
					if(!board.getPiece(new Vector(loc.x - 2, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.WHITE)){
						path.add(new Vector(loc.x - 2, loc.y - 1));
					}
				}
				if(loc.x < 6){
					if(!board.getPiece(new Vector(loc.x + 2, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.WHITE)){
						path.add(new Vector(loc.x + 2, loc.y - 1));
					}
				}
			}
			if(loc.y < 7){
				if(loc.x > 1){
					if(!board.getPiece(new Vector(loc.x - 2, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.WHITE)){
						path.add(new Vector(loc.x - 2, loc.y + 1));
					}
				}
				if(loc.x < 6){
					if(!board.getPiece(new Vector(loc.x + 2, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.WHITE)){
						path.add(new Vector(loc.x + 2, loc.y + 1));
					}
				}
			}
			if(loc.y < 6){
				if(loc.x > 0){
					if(!board.getPiece(new Vector(loc.x - 1, loc.y + 2)).getPlayer().getColor().equals(PlayerColor.WHITE)){
						path.add(new Vector(loc.x - 1, loc.y + 2));
					}
				}
				if(loc.x < 7){
					if(!board.getPiece(new Vector(loc.x + 1, loc.y + 2)).getPlayer().getColor().equals(PlayerColor.WHITE)){
						path.add(new Vector(loc.x + 1, loc.y + 2));
					}
				}
			}
		}
		
		/* BLACK */
		
		if(getPlayer().getColor().equals(PlayerColor.BLACK)) {
			if(loc.y < 6){
				if(loc.x > 0){
					if(!board.getPiece(new Vector(loc.x - 1, loc.y + 2)).getPlayer().getColor().equals(PlayerColor.BLACK)){
						path.add(new Vector(loc.x - 1, loc.y + 2));
					}
				}
				if(loc.x > 0){
					if(!board.getPiece(new Vector(loc.x + 1, loc.y + 2)).getPlayer().getColor().equals(PlayerColor.BLACK)){
						path.add(new Vector(loc.x + 1, loc.y + 2));
					}
				}
			}
			if(loc.y < 7){
				if(loc.x > 1){
					if(!board.getPiece(new Vector(loc.x - 2, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.BLACK)){
						path.add(new Vector(loc.x - 2, loc.y + 1));
					}
				}
				if(loc.x < 6){
					if(!board.getPiece(new Vector(loc.x + 2, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.BLACK)){
						path.add(new Vector(loc.x + 2, loc.y + 1));
					}
				}
			}
			if(loc.y > 0){
				if(loc.x > 1){
					if(!board.getPiece(new Vector(loc.x - 2, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.BLACK)){
						path.add(new Vector(loc.x - 2, loc.y - 1));
					}
				}
				if(loc.x < 6){
					if(!board.getPiece(new Vector(loc.x + 2, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.BLACK)){
						path.add(new Vector(loc.x + 2, loc.y - 1));
					}
				}
			}
			if(loc.y > 1){
				if(loc.x > 0){
					if(!board.getPiece(new Vector(loc.x - 1, loc.y - 2)).getPlayer().getColor().equals(PlayerColor.BLACK)){
						path.add(new Vector(loc.x - 1, loc.y - 2));
					}
				}
				if(loc.x < 7){
					if(!board.getPiece(new Vector(loc.x + 1, loc.y - 2)).getPlayer().getColor().equals(PlayerColor.BLACK)){
						path.add(new Vector(loc.x + 1, loc.y - 2));
					}
				}
			}
		}
		
		this.path = path;
	}

	
}

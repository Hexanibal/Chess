package com.chess.pieces;

import java.util.ArrayList;

import com.chess.Main;
import com.chess.Player;
import com.chess.PlayerColor;
import com.chess.utils.Vector;

public class Fou extends Piece{

	public Fou(Vector loc, Player player) {
		super(loc, player, PieceType.FOU);
	}

	@Override
	public void refreshPath() {
		ArrayList<Vector> path = new ArrayList<>();
		board = Main.game.getBoard();
		int i;
		
		
		/* WHITE */
		if(getPlayer().getColor().equals(PlayerColor.WHITE)) {
			
			/* PATH RIGTH - UP */
			i = 1;
			while(true) {
				if(loc.x + i > 7 || loc.y - i < 0) break;
				
				if(board.getPiece(new Vector(loc.x + i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x + i, loc.y - i));
				} else if(board.getPiece(new Vector(loc.x + i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					break;
				} else if(board.getPiece(new Vector(loc.x + i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					path.add(new Vector(loc.x + i, loc.y - i));
					break;
				}
				i++;
			}
			
			/* PATH RIGTH - DOWN */
			i = 1;
			while(true) {
				if(loc.x + i > 7 || loc.y + i > 7) break;
				
				if(board.getPiece(new Vector(loc.x + i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x + i, loc.y + i));
				} else if(board.getPiece(new Vector(loc.x + i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					break;
				} else if(board.getPiece(new Vector(loc.x + i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					path.add(new Vector(loc.x + i, loc.y + i));
					break;
				}
				i++;
			}
			
			/* PATH LEFT - DOWN */
			i = 1;
			while(true) {
				if(loc.x - i < 0 || loc.y + i > 7) break;
				
				if(board.getPiece(new Vector(loc.x - i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x - i, loc.y + i));
				} else if(board.getPiece(new Vector(loc.x - i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					break;
				} else if(board.getPiece(new Vector(loc.x - i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					path.add(new Vector(loc.x - i, loc.y + i));
					break;
				}
				i++;
			}
			
			/* PATH LEFT - UP */
			i = 1;
			while(true) {
				if(loc.x - i < 0 || loc.y - i < 0) break;
				
				if(board.getPiece(new Vector(loc.x - i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x - i, loc.y - i));
				} else if(board.getPiece(new Vector(loc.x - i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					break;
				} else if(board.getPiece(new Vector(loc.x - i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					path.add(new Vector(loc.x - i, loc.y - i));
					break;
				}
				i++;
			}
		}
		
		
		/* BLACK */
		if(getPlayer().getColor().equals(PlayerColor.BLACK)) {
			
			/* PATH RIGTH - UP */
			i = 1;
			while(true) {
				if(loc.x - i < 0 || loc.y + i > 7) break;
				
				if(board.getPiece(new Vector(loc.x - i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x - i, loc.y + i));
				} else if(board.getPiece(new Vector(loc.x - i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					break;
				} else if(board.getPiece(new Vector(loc.x - i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					path.add(new Vector(loc.x - i, loc.y + i));
					break;
				}
				i++;
			}
			
			/* PATH RIGTH - DOWN */
			i = 1;
			while(true) {
				if(loc.x - i < 0 || loc.y - i < 0) break;
				
				if(board.getPiece(new Vector(loc.x - i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x - i, loc.y - i));
				} else if(board.getPiece(new Vector(loc.x - i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					break;
				} else if(board.getPiece(new Vector(loc.x - i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					path.add(new Vector(loc.x - i, loc.y - i));
					break;
				}
				i++;
			}
			
			/* PATH LEFT - DOWN */
			i = 1;
			while(true) {
				if(loc.x + i > 7 || loc.y - i < 0) break;
				
				if(board.getPiece(new Vector(loc.x + i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x + i, loc.y - i));
				} else if(board.getPiece(new Vector(loc.x + i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					break;
				} else if(board.getPiece(new Vector(loc.x + i, loc.y - i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					path.add(new Vector(loc.x + i, loc.y - i));
					break;
				}
				i++;
			}
			
			/* PATH LEFT - UP */
			i = 1;
			while(true) {
				if(loc.x + i > 7 || loc.y + i > 7) break;
				
				if(board.getPiece(new Vector(loc.x + i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x + i, loc.y + i));
				} else if(board.getPiece(new Vector(loc.x + i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					break;
				} else if(board.getPiece(new Vector(loc.x + i, loc.y + i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					path.add(new Vector(loc.x + i, loc.y + i));
					break;
				}
				i++;
			}
		}
		
		this.path = path;
	}
	
}

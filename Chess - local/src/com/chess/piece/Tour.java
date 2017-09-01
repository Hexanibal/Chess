package com.chess.piece;

import java.util.ArrayList;

import com.chess.Main;
import com.chess.Player;
import com.chess.PlayerColor;
import com.chess.utils.Vector;

public class Tour extends Piece {

	public Tour(Vector loc, Player player) {
		super(loc, player, PieceType.TOUR);
	}

	@Override
	public void refreshPath() {
		ArrayList<Vector> path = new ArrayList<>();
		board = Main.game.getBoard();
		int i;
		
		
		/* WHITE */
		if(getPlayer().getColor().equals(PlayerColor.WHITE)) {
			
			/* PATH UP */
			i = 1;
			while(true) {
				if(loc.y - i < 0) break;
				
				if(board.getPiece(new Vector(loc.x, loc.y - i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x, loc.y - i));
				} else if(board.getPiece(new Vector(loc.x, loc.y - i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					break;
				} else if(board.getPiece(new Vector(loc.x, loc.y - i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					path.add(new Vector(loc.x, loc.y - i));
					break;
				}
				i++;
			}
			
			/* PATH DOWN */
			i = 1;
			while(true) {
				if(loc.y + i > 7) break;
				
				if(board.getPiece(new Vector(loc.x, loc.y + i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x, loc.y + i));
				} else if(board.getPiece(new Vector(loc.x, loc.y + i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					break;
				} else if(board.getPiece(new Vector(loc.x, loc.y + i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					path.add(new Vector(loc.x, loc.y + i));
					break;
				}
				i++;
			}
			
			/* PATH RIGHT */
			i = 1;
			while(true) {
				if(loc.x + i > 7) break;
				
				if(board.getPiece(new Vector(loc.x + i, loc.y)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x + i, loc.y));
				} else if(board.getPiece(new Vector(loc.x + i, loc.y)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					break;
				} else if(board.getPiece(new Vector(loc.x + i, loc.y)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					path.add(new Vector(loc.x + i, loc.y));
					break;
				}
				i++;
			}
			
			/* PATH LEFT */
			i = 1;
			while(true) {
				if(loc.x - i < 0) break;
				
				if(board.getPiece(new Vector(loc.x - i, loc.y)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x - i, loc.y));
				} else if(board.getPiece(new Vector(loc.x - i, loc.y)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					break;
				} else if(board.getPiece(new Vector(loc.x - i, loc.y)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					path.add(new Vector(loc.x - i, loc.y));
					break;
				}
				i++;
			}
		}
		
		
		/* BLACK */
		if(getPlayer().getColor().equals(PlayerColor.BLACK)) {
			
			/* PATH UP */
			i = 1;
			while(true) {
				if(loc.y + i > 7) break;
				
				if(board.getPiece(new Vector(loc.x, loc.y + i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x, loc.y + i));
				} else if(board.getPiece(new Vector(loc.x, loc.y + i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					break;
				} else if(board.getPiece(new Vector(loc.x, loc.y + i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					path.add(new Vector(loc.x, loc.y + i));
					break;
				}
				i++;
			}
			
			/* PATH DOWN */
			i = 1;
			while(true) {
				if(loc.y - i < 0) break;
				
				if(board.getPiece(new Vector(loc.x, loc.y - i)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x, loc.y - i));
				} else if(board.getPiece(new Vector(loc.x, loc.y - i)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					break;
				} else if(board.getPiece(new Vector(loc.x, loc.y - i)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					path.add(new Vector(loc.x, loc.y - i));
					break;
				}
				i++;
			}
			
			/* PATH RIGHT */
			i = 1;
			while(true) {
				if(loc.x - i < 0) break;
				
				if(board.getPiece(new Vector(loc.x - i, loc.y)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x - i, loc.y));
				} else if(board.getPiece(new Vector(loc.x - i, loc.y)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					break;
				} else if(board.getPiece(new Vector(loc.x - i, loc.y)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					path.add(new Vector(loc.x - i, loc.y));
					break;
				}
				i++;
			}
			
			/* PATH LEFT */
			i = 1;
			while(true) {
				if(loc.x + i > 7) break;
				
				if(board.getPiece(new Vector(loc.x + i, loc.y)).getPlayer().getColor().equals(PlayerColor.NULL)){
					path.add(new Vector(loc.x + i, loc.y));
				} else if(board.getPiece(new Vector(loc.x + i, loc.y)).getPlayer().getColor().equals(PlayerColor.BLACK)){
					break;
				} else if(board.getPiece(new Vector(loc.x + i, loc.y)).getPlayer().getColor().equals(PlayerColor.WHITE)){
					path.add(new Vector(loc.x + i, loc.y));
					break;
				}
				i++;
			}
		}
		
		this.path = path;
	}

}

package com.chess.pieces;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.chess.Main;
import com.chess.Player;
import com.chess.PlayerColor;
import com.chess.utils.Vector;

public class Roi extends Piece {

	public Roi(Vector loc, Player player) {
		super(loc, player, PieceType.ROI);

	}

	@Override
	public void refreshPath() {
		ArrayList<Vector> path = new ArrayList<>();
		board = Main.game.getBoard();

		/* WHITE */
		if (getPlayer().getColor().equals(PlayerColor.WHITE)) {
			if (loc.y != 0) {
				if (loc.x != 0) {
					if (!board.getPiece(new Vector(loc.x - 1, loc.y - 1)).getPlayer().getColor()
							.equals(PlayerColor.WHITE)) {
						path.add(new Vector(loc.x - 1, loc.y - 1));
					}
				}
				if (!board.getPiece(new Vector(loc.x, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.WHITE)) {
					path.add(new Vector(loc.x, loc.y - 1));
				}
				if (loc.x != 7) {
					if (!board.getPiece(new Vector(loc.x + 1, loc.y - 1)).getPlayer().getColor()
							.equals(PlayerColor.WHITE)) {
						path.add(new Vector(loc.x + 1, loc.y - 1));
					}
				}
			}

			if (loc.x != 0) {
				if (!board.getPiece(new Vector(loc.x - 1, loc.y)).getPlayer().getColor().equals(PlayerColor.WHITE)) {
					path.add(new Vector(loc.x - 1, loc.y));
				}
			}
			if (loc.x != 7) {
				if (!board.getPiece(new Vector(loc.x + 1, loc.y)).getPlayer().getColor().equals(PlayerColor.WHITE)) {
					path.add(new Vector(loc.x + 1, loc.y));
				}
			}

			if (loc.y != 7) {
				if (loc.x != 0) {
					if (!board.getPiece(new Vector(loc.x - 1, loc.y + 1)).getPlayer().getColor()
							.equals(PlayerColor.WHITE)) {
						path.add(new Vector(loc.x - 1, loc.y + 1));
					}
				}
				if (!board.getPiece(new Vector(loc.x, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.WHITE)) {
					path.add(new Vector(loc.x, loc.y + 1));
				}
				if (loc.x != 7) {
					if (!board.getPiece(new Vector(loc.x + 1, loc.y + 1)).getPlayer().getColor()
							.equals(PlayerColor.WHITE)) {
						path.add(new Vector(loc.x + 1, loc.y + 1));
					}
				}
			}

		}

		/* BLACK */
		if (getPlayer().getColor().equals(PlayerColor.BLACK)) {
			if (loc.y != 7) {
				if (loc.x != 0) {
					if (!board.getPiece(new Vector(loc.x - 1, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
						path.add(new Vector(loc.x - 1, loc.y + 1));
					}
				}
				if (!board.getPiece(new Vector(loc.x, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
					path.add(new Vector(loc.x, loc.y + 1));
				}
				if (loc.x != 7) {
					if (!board.getPiece(new Vector(loc.x + 1, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
						path.add(new Vector(loc.x + 1, loc.y + 1));
					}
				}
			}

			if (loc.x != 0) {
				if (!board.getPiece(new Vector(loc.x - 1, loc.y)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
					path.add(new Vector(loc.x - 1, loc.y));
				}
			}
			if (loc.x != 7) {
				if (!board.getPiece(new Vector(loc.x + 1, loc.y)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
					path.add(new Vector(loc.x + 1, loc.y));
				}
			}

			if (loc.y != 0) {
				if (loc.x != 0) {
					if (!board.getPiece(new Vector(loc.x - 1, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
						path.add(new Vector(loc.x - 1, loc.y - 1));
					}
				}
				if (!board.getPiece(new Vector(loc.x, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
					path.add(new Vector(loc.x, loc.y - 1));
				}
				if (loc.x != 7) {
					if (!board.getPiece(new Vector(loc.x + 1, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
						path.add(new Vector(loc.x + 1, loc.y - 1));
					}
				}
			}
		}

		Piece p;
		ArrayList<Vector> pa;
		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
				p = board.getPiece(new Vector(x, y));
				
				if(!p.getPlayer().getColor().equals(getPlayer().getColor()) && !p.getPlayer().getColor().equals(PlayerColor.NULL)){
					/*BOUCLE RPOIS*/
					pa = (p.getType().equals(PieceType.ROI)) ? ((Roi) p).getRestrictedPath() : p.getPath();
					for(Vector v : pa){
						if(path.contains(v)){
							path.remove(v);
							System.out.println("removing " + v.x + " " + v.y);
						}
					}
				}
				
			}
		}
		this.path = path;
	}
	
	
	
	public ArrayList<Vector> getRestrictedPath(){
		ArrayList<Vector> path = new ArrayList<>();
		board = Main.game.getBoard();

		/* WHITE */
		if (getPlayer().getColor().equals(PlayerColor.WHITE)) {
			if (loc.y != 0) {
				if (loc.x != 0) {
					if (!board.getPiece(new Vector(loc.x - 1, loc.y - 1)).getPlayer().getColor()
							.equals(PlayerColor.WHITE)) {
						path.add(new Vector(loc.x - 1, loc.y - 1));
					}
				}
				if (!board.getPiece(new Vector(loc.x, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.WHITE)) {
					path.add(new Vector(loc.x, loc.y - 1));
				}
				if (loc.x != 7) {
					if (!board.getPiece(new Vector(loc.x + 1, loc.y - 1)).getPlayer().getColor()
							.equals(PlayerColor.WHITE)) {
						path.add(new Vector(loc.x + 1, loc.y - 1));
					}
				}
			}

			if (loc.x != 0) {
				if (!board.getPiece(new Vector(loc.x - 1, loc.y)).getPlayer().getColor().equals(PlayerColor.WHITE)) {
					path.add(new Vector(loc.x - 1, loc.y));
				}
			}
			if (loc.x != 7) {
				if (!board.getPiece(new Vector(loc.x + 1, loc.y)).getPlayer().getColor().equals(PlayerColor.WHITE)) {
					path.add(new Vector(loc.x + 1, loc.y));
				}
			}

			if (loc.y != 7) {
				if (loc.x != 0) {
					if (!board.getPiece(new Vector(loc.x - 1, loc.y + 1)).getPlayer().getColor()
							.equals(PlayerColor.WHITE)) {
						path.add(new Vector(loc.x - 1, loc.y + 1));
					}
				}
				if (!board.getPiece(new Vector(loc.x, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.WHITE)) {
					path.add(new Vector(loc.x, loc.y + 1));
				}
				if (loc.x != 7) {
					if (!board.getPiece(new Vector(loc.x + 1, loc.y + 1)).getPlayer().getColor()
							.equals(PlayerColor.WHITE)) {
						path.add(new Vector(loc.x + 1, loc.y + 1));
					}
				}
			}

		}

		/* BLACK */
		if (getPlayer().getColor().equals(PlayerColor.BLACK)) {
			if (loc.y != 7) {
				if (loc.x != 0) {
					if (!board.getPiece(new Vector(loc.x - 1, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
						path.add(new Vector(loc.x - 1, loc.y + 1));
					}
				}
				if (!board.getPiece(new Vector(loc.x, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
					path.add(new Vector(loc.x, loc.y + 1));
				}
				if (loc.x != 7) {
					if (!board.getPiece(new Vector(loc.x + 1, loc.y + 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
						path.add(new Vector(loc.x + 1, loc.y + 1));
					}
				}
			}

			if (loc.x != 0) {
				if (!board.getPiece(new Vector(loc.x - 1, loc.y)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
					path.add(new Vector(loc.x - 1, loc.y));
				}
			}
			if (loc.x != 7) {
				if (!board.getPiece(new Vector(loc.x + 1, loc.y)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
					path.add(new Vector(loc.x + 1, loc.y));
				}
			}

			if (loc.y != 0) {
				if (loc.x != 0) {
					if (!board.getPiece(new Vector(loc.x - 1, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
						path.add(new Vector(loc.x - 1, loc.y - 1));
					}
				}
				if (!board.getPiece(new Vector(loc.x, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
					path.add(new Vector(loc.x, loc.y - 1));
				}
				if (loc.x != 7) {
					if (!board.getPiece(new Vector(loc.x + 1, loc.y - 1)).getPlayer().getColor().equals(PlayerColor.BLACK)) {
						path.add(new Vector(loc.x + 1, loc.y - 1));
					}
				}
			}
		}
		
		return path;
	}
	
}
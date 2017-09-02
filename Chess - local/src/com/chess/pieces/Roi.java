package com.chess.pieces;

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

		this.path = path;
	}
}
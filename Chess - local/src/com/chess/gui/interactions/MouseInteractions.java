package com.chess.gui.interactions;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.chess.Main;
import com.chess.utils.Vector;

public class MouseInteractions implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Main.game.getBoard().registerClick(new Vector(e.getX(), e.getY()));
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}

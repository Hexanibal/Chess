package com.chess.utils;

public class Vector {

	public int x;
	public int y;
	
	public Vector() {
		
	}
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return this.y;
	}
	
	public void add(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void add(Vector hvector) {
		this.x += hvector.x;
		this.y += hvector.y;
	}
	
	public String toString() {
		return "x: " + x + " y: " + y;
	}
	
}

package com.enumeration;

public enum ShipModel {

	CRUISER(2),
	BATTLESHIP(3),
	SUBMARINE(4);
	
	int size;
	
	private ShipModel(int size) {
		this.size = size;		
	}

	public int getSize() {
		return size;
	}
	
	
}

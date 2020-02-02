package com.model;

import com.enumeration.Direction;

public interface Plot {
	
	public int getAbscisse();//X
	public int getOrdonnee();//Y
	public Plot getPlotTo(Direction shipDirection);//determiner la case suivante
	
	
	

}

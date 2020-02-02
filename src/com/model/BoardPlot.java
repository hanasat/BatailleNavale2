package com.model;

import java.util.ArrayList;
import java.util.List;

import com.enumeration.Direction;
import com.enumeration.StatusPlot;

//la grille
public class BoardPlot  implements Plot{

	private int abscisse;
	private int ordonnee;	
	List<BoardPlot> plotsSunk = new ArrayList<BoardPlot>();
	private StatusPlot plotStatus;
	
	public BoardPlot() {
		
	}
	public BoardPlot(int abscisse, int ordonnee) {
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
		this.plotStatus = StatusPlot.ISCHECKED;
	}

	@Override
	public int getAbscisse() {
		
		return abscisse;
	}

	@Override
	public int getOrdonnee() {
		
		return ordonnee;
	}

	
	

	public StatusPlot getPlotStatus() {
		return plotStatus;
	}

	public void setPlotStatus(StatusPlot plotStatus) {
		this.plotStatus = plotStatus;
	}

	@Override
	public BoardPlot getPlotTo(Direction direction) {
		int x =0, y=0;

		switch(direction) {
		
		case EAST : 
			x=this.abscisse + 1;
			y=this.ordonnee;
			break;
			
		case  NORTH:
			 
			x=this.abscisse ;
			y=this.ordonnee +1;
			
			break;
			
		case SOUTH:
			x=this.abscisse;
			y=this.ordonnee -1;
			break;
			
		case WEST:
			x=this.abscisse - 1;
			y=this.ordonnee;
			break;
			
		}
		
		BoardPlot plot = new BoardPlot(x,y);
		
		return plot ;
	}
	
	



	@Override
	public String toString() {
		return "BoardPlot [abscisse=" + abscisse + ", ordonnee=" + ordonnee + "]";
	}
	
	
	
}



























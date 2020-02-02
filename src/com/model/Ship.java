package com.model;

import java.util.ArrayList;
import java.util.List;

import com.enumeration.Direction;
import com.enumeration.ShipModel;
import com.enumeration.StatusPlot;

public class Ship {
	
	private Direction direction;
	private ShipModel shipModel;
	private BoardPlot boardPlot;
	List<BoardPlot> plotListe = new ArrayList<BoardPlot>();
	
	
	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public ShipModel getShipModel() {
		return shipModel;
	}

	public void setShipModel(ShipModel shipModel) {
		this.shipModel = shipModel;
	}

	public BoardPlot getBoardPlot() {
		return boardPlot;
	}

	public void setBoardPlot(BoardPlot boardPlot) {
		this.boardPlot = boardPlot;
	}

	public List<BoardPlot> getPlotListe() {
		return plotListe;
	}

	public void setPlotListe(List<BoardPlot> plotListe) {
		this.plotListe = plotListe;
	}

	//constructor 
	public Ship( BoardPlot plot,Direction d, ShipModel m) {
		this.direction = d;
		this.shipModel = m;
		this.plotListe.add(plot);
		BoardPlot lastPlot = new BoardPlot();
		//System.out.println("dernier element : "+this.getPlotListe().get(this.getPlotListe().size()-1));
		
		
		for(int j =0;j<m.getSize()-1;j++)
		{
			lastPlot = this.getPlotListe().get(j);
			this.plotListe.add(lastPlot.getPlotTo(d));
		}	
		
	}
	
	//methodes
	
	public boolean IsSunk() {
	boolean	isSunk = false;
		for(int i = 0; i<this.getPlotListe().size();i++)
		{
			if(this.getPlotListe().get(i).getPlotStatus().equals(StatusPlot.ISSUNK))
			{
				isSunk = true;
				
			}else
				return false;
		}
		
		return isSunk;
	}
	
	
	public boolean isOnPlot(BoardPlot plot) { 
		
		for(BoardPlot p :plotListe)
		{
		if(p.equals(plot))
		 
		return true;
		}		
		return false;
	}

	@Override
	public String toString() {
		return "Ship [direction=" + this.getDirection() + ", shipModel=" + shipModel + 
				", plots : "+this.getPlotListe().toString();
				}
	
	
	
	}
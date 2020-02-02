package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.enumeration.Direction;
import com.enumeration.ShipModel;
import com.enumeration.StatusPlot;
import com.model.BoardPlot;
import com.model.Ship;


public class Game {

	public static void main(String[] args) {
		
		//plot 
		BoardPlot plot1 = new BoardPlot(1,2);
		BoardPlot plot2 = new BoardPlot(4,1);
		BoardPlot plot3 = new BoardPlot(3,2);
		BoardPlot plot4 = new BoardPlot(2,2);
		//System.out.println("cooredonnee depart : "+plot1.toString());
		System.out.println("***********ship ***********");
		Ship ship1 = new Ship(plot1,Direction.EAST,ShipModel.BATTLESHIP);
		System.out.println(ship1.toString());
	

		Ship ship2 = new Ship(plot2,Direction.WEST,ShipModel.SUBMARINE);
		System.out.println(ship2.toString());
		
		plot1.setPlotStatus(StatusPlot.ISSUNK);	
		plot3.setPlotStatus(StatusPlot.ISSUNK);
		plot4.setPlotStatus(StatusPlot.ISSUNK);
		System.out.println("********"+ship1.getPlotListe().contains(plot4));
		for(BoardPlot p : ship1.getPlotListe())
		{
			System.out.println(p.getPlotStatus());
		}
		
		System.out.println(ship1.getPlotListe().get(2).equals(plot3));
		//System.out.println(ship1.statusShip());
		System.out.println("*********** Ship ***********");
		
		
		
		//List of plot checked
		/*HashMap<BoardPlot, Ship> plotsChecked = new HashMap<BoardPlot, Ship>();
		List<Ship> shipList = new ArrayList<Ship>();
		shipList.add(ship1);
		shipList.add(ship2);
		
		for(int i = 0; i<3;i++ )
		{
			plotsChecked.put(ship1.getPlotListe().get(i),ship1);
		}
		//System.out.println(plotsChecked.containsKey(plot3));

		
		Set listKeys=plotsChecked.keySet();  // Obtenir la liste des clés
		Iterator iterateur=listKeys.iterator();
		// Parcourir les clés ;
		while(iterateur.hasNext())
		{
			Object key= iterateur.next();
			System.out.println (key);
		}
		
		System.out.println(plotsChecked.containsKey(plot3));
		*/
}

}

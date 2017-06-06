package com.poc.data.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.poc.data.BidimensionalCoordinate;
import com.poc.data.Figure;
import com.poc.data.FigureType;

public class Triangle implements Figure {
	
	private FigureType type = FigureType.TRIANGLE;
	
	private List<BidimensialCartesianCoordinate> vertices;

	public Triangle() {
		vertices = new ArrayList<BidimensialCartesianCoordinate>();
		// Add 3 empty vertices
		vertices.add(new BidimensialCartesianCoordinate());
		vertices.add(new BidimensialCartesianCoordinate());
		vertices.add(new BidimensialCartesianCoordinate());
		
	}
	
	public Triangle(BidimensialCartesianCoordinate vertex1,BidimensialCartesianCoordinate vertex2, BidimensialCartesianCoordinate vertex3){
		vertices = new ArrayList<BidimensialCartesianCoordinate>();
		vertices.add(vertex1);
		vertices.add(vertex2);
		vertices.add(vertex3);
	}

	/* In this case, it will return the minimal vertex, i.e. the minimal X,Y combination 
	 * This will start arbitrarily */
	public BidimensionalCoordinate getInit() {
		return vertices.get(0);
	}

	public BidimensionalCoordinate getEnd() {
		return vertices.get(2);
	}

	public FigureType getType() {
		return FigureType.TRIANGLE;
	}

	public List<Double> getSidesLength() {
		List<Double> sides = new ArrayList<Double>();
		sides.add(getDistance(vertices.get(0),vertices.get(1)));
		sides.add(getDistance(vertices.get(0),vertices.get(2)));
		sides.add(getDistance(vertices.get(1),vertices.get(2)));
		return sides;
		
	}

	private Double getDistance(BidimensialCartesianCoordinate initCoord,
			BidimensialCartesianCoordinate endCoord) {
		Double xDistance = endCoord.getX() - initCoord.getX();
		Double yDistance = endCoord.getY() - initCoord.getY();
		return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
	}

	public Double getArea() {
		Double perimeter = getPerimeter();
		Double semiper = perimeter / 2;
		Double aSide = semiper - getSidesLength().get(0);
		Double bSide = semiper - getSidesLength().get(1);
		Double cSide = semiper - getSidesLength().get(2);
		Double heron = Math.sqrt(semiper * aSide * bSide * cSide);
		return heron;
		
	}

	public Double getPerimeter() {
		return getSidesLength().get(0) + getSidesLength().get(1) + getSidesLength().get(2);
	}

}

package com.poc.data.implementation;

import java.util.ArrayList;
import java.util.List;

import com.poc.data.BidimensionalCoordinate;
import com.poc.data.Figure;
import com.poc.data.FigureType;

public class Rectangle implements Figure {

	private FigureType type = FigureType.RECTANGLE;
	
	private BidimensialCartesianCoordinate init;
	private BidimensialCartesianCoordinate end;
	
	// Default constructor, will generate an empty RECTANGLE (0,0)(0,0)
	public Rectangle() {
		this.init = new BidimensialCartesianCoordinate();
		this.end = new BidimensialCartesianCoordinate();
	}

	// Constructor, takes init and end coordinates as parameters
	
	public Rectangle(BidimensialCartesianCoordinate init, BidimensialCartesianCoordinate end){
		this.init = init;
		this.end = end;
	}
	
	public BidimensionalCoordinate getInit() {
		return init;
	}

	public BidimensionalCoordinate getEnd() {
		return end;
	}

	public FigureType getType() {
		return type;
	}

	/* getSidesLength: will return an array with 2 elements, one for the length of X side, and the 
	 * other with the length of Y side
	 * 
	 */
	public List<Double> getSidesLength() {
		List<Double> sides = new ArrayList<Double>();
		sides.add(getEnd().getX() - getInit().getX());
		sides.add(getEnd().getY() - getInit().getY());
		return sides;
	}

	/* Simple area calculation: we need to multiply X side length by Y side length */
	public Double getArea() {
		return getSidesLength().get(0) * getSidesLength().get(1);
	}

	/* Just the addition of the length of all sides, since this is a rect, it's enough to take
	 * 2 times X lenght and add 2 times Y length */

	public Double getPerimeter() {
		return 2 * getSidesLength().get(0) + 2 * getSidesLength().get(1);
	}

}

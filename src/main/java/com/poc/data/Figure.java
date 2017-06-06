package com.poc.data;

import java.util.List;

public interface Figure {
	
	public BidimensionalCoordinate getInit();
	public BidimensionalCoordinate getEnd();
	
	// Methods for information
	
	public FigureType getType();
	public List<Double> getSidesLength();
	public Double getArea();
	public Double getPerimeter();
	
}

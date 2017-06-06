package com.poc.data.implementation;

import com.poc.data.BidimensionalCoordinate;

public class BidimensialCartesianCoordinate implements BidimensionalCoordinate {

	private Double xValue;
	private Double yValue;
	
	// Create coordinate in (0,0) by default
	public BidimensialCartesianCoordinate() {
		xValue = new Double(0);
		yValue = new Double(0);
	}

	// if any value is given, add them to the constructor.
	public BidimensialCartesianCoordinate(Double xValue, Double yValue){
		this.xValue = xValue;
		this.yValue = yValue;
	}
	
	public Double getX() {
		return xValue;
	}

	public Double getY() {
		return yValue;
	}

}

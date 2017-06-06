package com.poc.data;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.poc.data.Figure;
import com.poc.data.FigureType;
import com.poc.data.implementation.BidimensialCartesianCoordinate;
import com.poc.data.implementation.Triangle;


public class TriangleTest {

	private static BidimensialCartesianCoordinate point0 = new BidimensialCartesianCoordinate(-1.0, 3.0);
	private static BidimensialCartesianCoordinate point1 = new BidimensialCartesianCoordinate(-11.0, 20.3);
	private static BidimensialCartesianCoordinate point2 = new BidimensialCartesianCoordinate(10.4, 4.2);
	
	private static Figure triangle;
	
	private List<Double> lengths ; 
	
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle (point0,point1,point2);
		lengths = new ArrayList<Double>();
		
	}

	@Test
	public void testTriangleBidimensialCartesianCoordinateBidimensialCartesianCoordinateBidimensialCartesianCoordinate() {
		assertNotNull(triangle);
	}

	@Test
	public void testGetInit() {
		assertNotNull(triangle.getInit());
		assertEquals(point0, triangle.getInit());
	}

	@Test
	public void testGetEnd() {
		assertNotNull(triangle.getEnd());
		assertEquals(point2, triangle.getEnd());
	}

	@Test
	public void testGetType() {
		assertNotNull(triangle.getType());
		assertEquals(FigureType.TRIANGLE, triangle.getType());
	}

	@Test
	public void testGetSidesLength() {
		assertNotNull(triangle.getSidesLength());
		assertEquals(getDistance(point0, point1), triangle.getSidesLength().get(0));
		assertEquals(getDistance(point0, point2), triangle.getSidesLength().get(1));
		assertEquals(getDistance(point1, point2), triangle.getSidesLength().get(2));
		
	}

	@Test
	public void testGetArea() {
		assertNotNull(triangle.getArea());
		assertEquals(getArea(), triangle.getArea());
	}

	@Test
	public void testGetPerimeter() {
		assertNotNull(triangle.getPerimeter());
		Double perimeter = getDistance(point0,point1)+getDistance(point0,point2)+getDistance(point1,point2);
		assertEquals(perimeter, triangle.getPerimeter());
	}

	private Double getDistance(BidimensialCartesianCoordinate initCoord,
			BidimensialCartesianCoordinate endCoord) {
		Double xDistance = endCoord.getX() - initCoord.getX();
		Double yDistance = endCoord.getY() - initCoord.getY();
		return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
	}
	
	public Double getArea() {
		Double perimeter = getDistance(point0,point1)+getDistance(point0,point2)+getDistance(point1,point2);
		Double semiper = perimeter / 2;
		Double aSide = semiper - getDistance(point0,point1) ;
		Double bSide = semiper - getDistance(point0,point2) ;
		Double cSide = semiper - getDistance(point1,point2);
		Double heron = Math.sqrt(semiper * aSide * bSide * cSide);
		return heron;
		
	}
}

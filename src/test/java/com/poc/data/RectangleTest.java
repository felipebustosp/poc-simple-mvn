package com.poc.data;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.poc.data.FigureType;
import com.poc.data.implementation.BidimensialCartesianCoordinate;
import com.poc.data.implementation.Rectangle;

public class RectangleTest {

	private static final double Y_END = 1000.0;
	private static final double X_END = 1000.0;
	private static final double Y_INIT = 10.0;
	private static final double X_INIT = 10.0;
	private static final double Y_LENGTH = 990.0;
	private static final double X_LENGTH = 990.0;
	private static final Double EXPECTED_AREA = new Double(980100.0);
	private static final Double EXPECTED_PERIMETER = new Double(3960.0);
	private Rectangle emptyRect;
	private Rectangle nonEmptyRect;
	
	private static BidimensialCartesianCoordinate init;
	private static BidimensialCartesianCoordinate end;
	
	private List<Double> lengths ;
	
	@Before
	public void setUp() throws Exception {
		
		init = new BidimensialCartesianCoordinate(X_INIT, Y_INIT);
		end = new BidimensialCartesianCoordinate(X_END, Y_END);
		loadLengths();
		emptyRect = new Rectangle();
		nonEmptyRect = new Rectangle(init,end);
	}

	private void loadLengths() {
		lengths = new ArrayList<Double>();
		lengths.add(X_LENGTH);
		lengths.add(Y_LENGTH);
	}

	@Test
	public void testRectangleBidimensialCartesianCoordinateBidimensialCartesianCoordinate() {
		assertNotNull(emptyRect);
		assertNotNull(nonEmptyRect);
	}

	@Test
	public void testGetInit() {
		assertNotNull(nonEmptyRect.getInit());
		assertEquals(RectangleTest.init, nonEmptyRect.getInit());
	}

	@Test
	public void testGetEnd() {
		assertNotNull(nonEmptyRect.getEnd());
		assertEquals(RectangleTest.end, nonEmptyRect.getEnd());
	}

	@Test
	public void testGetType() {
		assertNotNull(nonEmptyRect.getType());
		assertEquals(FigureType.RECTANGLE, nonEmptyRect.getType());
	}

	@Test
	public void testGetSidesLength() {
		assertNotNull(nonEmptyRect.getSidesLength());
		assertEquals(lengths, nonEmptyRect.getSidesLength());
	}

	@Test
	public void testGetArea() {
		assertNotSame(0, nonEmptyRect.getArea());
		assertEquals(EXPECTED_AREA, nonEmptyRect.getArea());
		
	}

	@Test
	public void testGetPerimeter() {
		assertEquals(EXPECTED_PERIMETER, nonEmptyRect.getPerimeter());
	}

}

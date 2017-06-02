package org.web.app.testing;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.web.app.models.MaxValueCalculator;
import org.web.app.models.MeanCalculator;
import org.web.app.models.MedianCalculator;
import org.web.app.models.MinValueCalculator;
import org.web.app.models.ModeCalculator;
import org.web.app.models.RandomGenerator;
import org.web.app.models.StandardDeviationCalulator;


public class UnitTestAll {
	
	private ArrayList<Integer>sampleArrayList;
	private MeanCalculator  meanCalc;
	private MedianCalculator meadianCalc;
	private ModeCalculator modeCalc;
	private MaxValueCalculator maxCalc;
	private MinValueCalculator minCalc;
	private StandardDeviationCalulator stdCalc;
	private RandomGenerator randomGenerator;
	
	
	@Before
	public void initializeTests() {
		sampleArrayList=new ArrayList<Integer>(Arrays.asList(21,84,77,87,97,17,27,10,20,40,50,43,53,63,83,66,76,96,6,89,
				99,19,29,39,32,42,52,62,72,65,75,85,95,78,18,28,11,21,31,41,
				34,44,54,64,74,67,77,87,97,7,1,20,30,40,23,43,53,63,46,56,
				66,86,96,79,89,99,19,2,12,22,32,42,35,45,55,75,58,68,78,88,
				98,91,1,11,21,31,24,34,44,54,64,57,67,77,87,70,80,1,10,20)) ;
	
		meanCalc=new MeanCalculator(sampleArrayList);
		meadianCalc=new MedianCalculator(sampleArrayList);
		modeCalc=new ModeCalculator(sampleArrayList); 
		maxCalc=new MaxValueCalculator(sampleArrayList);
		minCalc=new MinValueCalculator(sampleArrayList);
		stdCalc=new StandardDeviationCalulator(sampleArrayList,meanCalc.getMeanValue());
		
	}
	
	
	@Test
	public void test100Values() {
				
		assertEquals(51.67, meanCalc.getMeanValue(),0);
				
		assertEquals(53, meadianCalc.getMedianValue(),0);
			
		assertEquals("21, 77, 87, 20, 1", modeCalc.getModeValue());
			
		assertEquals(99, maxCalc.getMaxValue());
			
		assertEquals(1, minCalc.getMinValue());
			
		assertEquals(28.51, stdCalc.getStdValue(),0);
		
	}
	
	
	/**
	 * Test for range of Random Numbers
	 */
	@Test
	public void testRandomNumbersRange() {
		for (int i = 0; i < 1000; i++) {
			randomGenerator = new RandomGenerator(100);
			sampleArrayList = randomGenerator.getRandomArray();
			minCalc = new MinValueCalculator(sampleArrayList);
			maxCalc = new MaxValueCalculator(sampleArrayList);
			assertTrue(minCalc.getMinValue()>=0);
			assertTrue(maxCalc.getMaxValue()<=99);
		}
	}
	
	@After
	public void tearDown() {	
		
		sampleArrayList=null;
		meanCalc=null;
		meadianCalc=null;
		modeCalc=null;
		maxCalc=null;
		minCalc=null;
		stdCalc=null;		
	}

}

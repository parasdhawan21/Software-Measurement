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
	private MedianCalculator medianCalc;
	private ModeCalculator modeCalc;
	private MaxValueCalculator maxCalc;
	private MinValueCalculator minCalc;
	private StandardDeviationCalulator stdCalc;
	private RandomGenerator randomGenerator;
	
	
	@Before
	public void initializeTests() {
		sampleArrayList=new ArrayList<Integer>(Arrays.asList(16,3,9,34,59,84,85,9,87,59,12,18,91,68,69,18,
											   72,97,50,27,0,0,97,98,56,81,5,11,12,37,62,15,11,12,37,9,10,35,
											   31,32,57,82,30,55,80,4,77,53,98,22,23,19,25,50,22,23,48,73,45,
											   99,23,48,20,74,51,23,72,49,50,46,71,19,97,69,70,47,0,73,69,22,
											   76,48,20,45,17,95,67,68,45,46,23,77,83,7,32,57,58,83,60,13)) ;
	
		meanCalc=new MeanCalculator(sampleArrayList);
		medianCalc=new MedianCalculator(sampleArrayList);
		modeCalc=new ModeCalculator(sampleArrayList); 
		maxCalc=new MaxValueCalculator(sampleArrayList);
		minCalc=new MinValueCalculator(sampleArrayList);
		stdCalc=new StandardDeviationCalulator(sampleArrayList,meanCalc.getMeanValue());
		
	}
	
	
	@Test
	public void test100Values() {
				
		assertEquals(46.16, meanCalc.getMeanValue(),0);
				
		assertEquals(47.5, medianCalc.getMedianValue(),0);
			
		assertEquals("23", modeCalc.getModeValue());
			
		assertEquals(99, maxCalc.getMaxValue());
			
		assertEquals(0, minCalc.getMinValue());
			
		assertEquals(28.77, stdCalc.getStdValue(),0);
		
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
			assertTrue(minCalc.getMinValue()>0);
			assertTrue(maxCalc.getMaxValue()<=99);
		}
	}
	
	@After
	public void tearDown() {	
		
		sampleArrayList=null;
		meanCalc=null;
		medianCalc=null;
		modeCalc=null;
		maxCalc=null;
		minCalc=null;
		stdCalc=null;		
	}

}

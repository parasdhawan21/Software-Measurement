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
import org.web.app.models.StandardDeviationCalulator;


public class UnitTestAll {
	
	private ArrayList<Integer>sampleArrayList;
	private MeanCalculator  meanCalc;
	private MedianCalculator meadianCalc;
	private ModeCalculator modeCalc;
	private MaxValueCalculator maxCalc;
	private MinValueCalculator minCalc;
	private StandardDeviationCalulator stdCalc;
	
	
	@Before
	public void initializeTests() {
		sampleArrayList=new ArrayList<Integer>(Arrays.asList(56,62,49,63,82,49,72,47,89,97,14,3,93,97,52,7,
							39,0,31,57,99,78,75,78,20,62,46,97,0,41,97,33,17,11,43,99,30,33,22,78,81,36,39,42,
							21,63,0,36,10,56,54,76,21,91,99,50,69,27,50,53,75,77,80,19,42,98,48,3,24,61,16,67,17,68,28,
							12,44,66,64,67,17,44,30,14,17,20,23,74,97,52,50,53,37,45,43,17,15,66,16,67)) ;
	
		meanCalc=new MeanCalculator(sampleArrayList);
		meadianCalc=new MedianCalculator(sampleArrayList);
		modeCalc=new ModeCalculator(sampleArrayList); 
		maxCalc=new MaxValueCalculator(sampleArrayList);
		minCalc=new MinValueCalculator(sampleArrayList);
		stdCalc=new StandardDeviationCalulator(sampleArrayList,meanCalc.getMeanValue());
		
	}
	
	
	@Test
	public void test100Values() {
				
		assertEquals(48, meanCalc.getMeanValue(),0);
				
		assertEquals(55, meadianCalc.getMeadianValue(),0);
			
		assertEquals(97, modeCalc.getModeValue());
			
		assertEquals(99, maxCalc.getMaxValue());
			
		assertEquals(0, minCalc.getMinValue());
			
		assertEquals(27, stdCalc.getStdValue(),0);
		
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

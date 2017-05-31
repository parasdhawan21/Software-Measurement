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
	private MedianCalculator medianCalc;
	private ModeCalculator modeCalc;
	private MaxValueCalculator maxCalc;
	private MinValueCalculator minCalc;
	private StandardDeviationCalulator stdCalc;
	
	
	@Before
	public void initializeTests() {
		sampleArrayList=new ArrayList<Integer>(Arrays.asList(67,74,58,24,8,99,15,51,34,63,98,59,95,26,91,21,
											  4,88,18,25,56,87,65,48,84,43,74,57,88,52,35,95,25,8,6,90,20,51,
											  82,99,29,89,72,55,86,21,28,64,28,11,28,46,82,41,10,13,97,8,44,
											  57,51,34,46,67,84,53,89,48,31,62,45,4,93,52,72,89,72,31,40,23,6,
											  42,49,32,15,75,5,41,0,31,50,51,1,6,71,30,66,25,8,92)) ;
	
		meanCalc=new MeanCalculator(sampleArrayList);
		medianCalc=new MedianCalculator(sampleArrayList);
		modeCalc=new ModeCalculator(sampleArrayList); 
		maxCalc=new MaxValueCalculator(sampleArrayList);
		minCalc=new MinValueCalculator(sampleArrayList);
		stdCalc=new StandardDeviationCalulator(sampleArrayList,meanCalc.getMeanValue());
		
	}
	
	
	@Test
	public void test100Values() {
				
		assertEquals(48.74, meanCalc.getMeanValue(),0);
				
		assertEquals(48.5, medianCalc.getMedianValue(),0);
			
		assertEquals(8, modeCalc.getModeValue());
			
		assertEquals(99, maxCalc.getMaxValue());
			
		assertEquals(0, minCalc.getMinValue());
			
		assertEquals(28.89, stdCalc.getStdValue(),0);
		
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

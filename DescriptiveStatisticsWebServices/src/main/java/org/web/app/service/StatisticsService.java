package org.web.app.service;

import java.util.ArrayList;

import org.web.app.models.MaxValueCalculator;
import org.web.app.models.MeanCalculator;
import org.web.app.models.MedianCalculator;
import org.web.app.models.MinValueCalculator;
import org.web.app.models.ModeCalculator;
import org.web.app.models.RandomGenerator;
import org.web.app.models.StandardDeviationCalulator;

public class StatisticsService {

	private RandomGenerator randomGen;
	private MeanCalculator  meanCalc;
	private MedianCalculator meadianCalc;
	private ModeCalculator modeCalc;
	private MaxValueCalculator maxCalc;
	private MinValueCalculator minCalc;
	private StandardDeviationCalulator stdCalc;
	
	public StatisticsService(int size) {
		
	    randomGen=new RandomGenerator(size);
		meanCalc=new MeanCalculator(randomGen.getRandomArray());	
		meadianCalc=new MedianCalculator(randomGen.getRandomArray());
		modeCalc=new ModeCalculator(randomGen.getRandomArray()); 
		maxCalc=new MaxValueCalculator(randomGen.getRandomArray());
		minCalc=new MinValueCalculator(randomGen.getRandomArray());
		stdCalc=new StandardDeviationCalulator(randomGen.getRandomArray(),
												                    meanCalc.getMeanValue());
	}
	
	
	public ArrayList<Integer> getRandomNumbers(){
		return this.randomGen.getRandomArray();
	}
	
	public double getMean() {	
		return this.meanCalc.getMeanValue();
	}
	
	public int getMax() {
		return this.maxCalc.getMaxValue();
	}
	
	
	public int getMin() {
		return this.minCalc.getMinValue();
	}
	
	public int getMode() {
		return this.modeCalc.getModeValue();
	}
	
	public double getMeadian() {
		return this.meadianCalc.getMeadianValue();
	}
	
	public double getSTD() {
		return this.stdCalc.getStdValue();
	}
	
}

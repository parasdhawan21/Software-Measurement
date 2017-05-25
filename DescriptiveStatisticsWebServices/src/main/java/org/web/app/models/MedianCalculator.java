package org.web.app.models;
import java.util.ArrayList;

import org.web.app.misclleneous.RoundValues;

public class MedianCalculator {
	
	private double meadianValue;

	 private ArrayList<Integer> randomNumbersArray;
	
	 
	 public MedianCalculator() {
		 
	 }
	 
	 public MedianCalculator(ArrayList<Integer> randomValues) {
	 		this.randomNumbersArray=randomValues;
	 		this.calculateMedian();
	 }
	 
	public double calculateMedian() {
	   
		int middleValue = randomNumbersArray.size()/2;
	    if (randomNumbersArray.size()%2 == 1) {
	    	double meadianValue= randomNumbersArray.get(middleValue);
	    	 this.meadianValue=meadianValue;
	    	 return meadianValue;
	    } else {
	        double meadianValue=(randomNumbersArray.get(middleValue-1) + randomNumbersArray.get(middleValue)) / 2.0;
	        meadianValue=RoundValues.round(meadianValue, 2);
	        this.meadianValue=meadianValue;
	        return meadianValue;
	    }
	}
	
	public double getMeadianValue() {
			return this.meadianValue;
	}
}

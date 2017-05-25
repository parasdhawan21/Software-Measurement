package org.web.app.models;
import java.util.ArrayList;

import org.web.app.misclleneous.RoundValues;

public class MeanCalculator {	
		
 private ArrayList<Integer> randomNumbersArray;
 private double meanValue;
 
 	public MeanCalculator() {
 		
 	}
 
 	public MeanCalculator(ArrayList<Integer> randomValues) {
 		this.randomNumbersArray=randomValues;
 		this.calculateMean();
 	}
 
 	public double calculateMean() {
 		
 		double sum=0;
 		
 		for(int i=0;i<this.randomNumbersArray.size();i++) {
 			sum=sum+this.randomNumbersArray.get(i);
 		}
 		
 			double mean= sum/(this.randomNumbersArray.size());
 			mean=RoundValues.round(mean, 4);
 			this.meanValue=mean;
 			return mean;
 	}
	
	public double getMeanValue() {
		return this.meanValue;
	}
	
}

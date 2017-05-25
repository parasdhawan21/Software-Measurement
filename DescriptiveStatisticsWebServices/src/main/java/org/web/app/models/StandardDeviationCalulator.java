package org.web.app.models;
import java.util.ArrayList;

import org.web.app.misclleneous.RoundValues;

public class StandardDeviationCalulator {

	private ArrayList<Integer> randomNumbersArray;
	private double stdValue;
	private double mean;
	 
	  public StandardDeviationCalulator() {
		  
	  }
	
	  public StandardDeviationCalulator(ArrayList<Integer> randomValues,double mean) {
	 		this.randomNumbersArray=randomValues;
	 		this.mean=mean;
	 		this.calculateStandardDeviation();
	  }

	 	
	 	public double calculateStandardDeviation() {
	 		double totalSum=0;

	 		for(int i=0;i<randomNumbersArray.size();i++) {
	 			double sumValue=randomNumbersArray.get(i)-this.mean;
	 			sumValue=sumValue*sumValue;
	 			totalSum=sumValue+totalSum; 			
	 		}
	 		
	 		double stdVal=squarRoot(totalSum/(randomNumbersArray.size()));
	 		stdVal=RoundValues.round(stdVal, 2);
	 		this.stdValue=stdVal;
	 		return stdVal;
	 		
	 	}
	 	
	 	public static double squarRoot(double value) {
	 		double t;
	 	 
	 		double squareRootValue = value / 2;
	 	 
	 		do {
	 			t = squareRootValue;
	 			squareRootValue = (t + (value / t)) / 2;
	 		} while ((t - squareRootValue) != 0);
	 	 
	 		return squareRootValue;
	 	}
	 	
	 	public double getStdValue() {
	 		return this.stdValue;
	 	}
	 	
}

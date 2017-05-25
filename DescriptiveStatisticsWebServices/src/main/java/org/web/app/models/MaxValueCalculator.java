package org.web.app.models;
import java.util.ArrayList;

public class MaxValueCalculator {

	private ArrayList<Integer> randomNumbersArray;
	private int maxValue;
	 
	
	public MaxValueCalculator() {
		
	}
	
	 	public MaxValueCalculator(ArrayList<Integer> randomValues) {
	 		this.randomNumbersArray=randomValues;
	 		this.calculateMax();
	 		}
	 
	 	public int calculateMax() {
	 		
	 		int max = randomNumbersArray.get(0);

	 		for (int i = 0; i < randomNumbersArray.size(); i++) {
	 		    if (randomNumbersArray.get(i) > max) {
	 		      max = randomNumbersArray.get(i);
	 		    }
	 		} 		
	 		this.maxValue=max;
	 		return max;
	 	}
		
	 	
		public int getMaxValue() {
			return this.maxValue;
		}
}

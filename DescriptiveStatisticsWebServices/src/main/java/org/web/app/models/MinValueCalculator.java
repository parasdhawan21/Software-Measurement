package org.web.app.models;
import java.util.ArrayList;

public class MinValueCalculator {

	private ArrayList<Integer> randomNumbersArray;
	private int minValue;
	 
	
	public MinValueCalculator() {
		
	}
	
	 	public MinValueCalculator(ArrayList<Integer> randomValues) {
	 		this.randomNumbersArray=randomValues;
	 		this.calculateMin();
	 	}
	 
	 	public int calculateMin() {
	 		
	 		int min = randomNumbersArray.get(0);

	 		for (int i = 0; i < randomNumbersArray.size(); i++) {
	 		    if (randomNumbersArray.get(i) < min) {
	 		      min = randomNumbersArray.get(i);
	 		    }
	 		} 		
	 		this.minValue=min;
	 		return min;
	 	}
		
		public int getMinValue() {
			return this.minValue;
		}
}

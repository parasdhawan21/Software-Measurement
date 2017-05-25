package org.web.app.models;
import java.util.ArrayList;

public class ModeCalculator {

	private ArrayList<Integer> randomNumbersArray;
	 private int modValue;
	 
	 public ModeCalculator() {
		 
	 }
	 	 
	 	public ModeCalculator(ArrayList<Integer> randomValues) {
	 		this.randomNumbersArray=randomValues;
	 		this.calculateMode();
	 	}
	 
	 	public int calculateMode() {
	 	    int maxValue=0, maxCount=0;

	 	    for (int i = 0; i < randomNumbersArray.size(); ++i) {
	 	        int count = 0;
	 	        for (int j = 0; j < randomNumbersArray.size(); ++j) {
	 	            if (randomNumbersArray.get(j) == randomNumbersArray.get(i)) {
	 	            		++count;
	 	            	}
	 	        }
	 	         if (count > maxCount) {
	 	            maxCount = count;
	 	            maxValue = randomNumbersArray.get(i);
	 	          }
	 	    }
	 	    this.modValue=maxValue;
	 	    return maxValue;
	 	}
		
		public int getModeValue() {
			return this.modValue;
		}
		
	
	
}

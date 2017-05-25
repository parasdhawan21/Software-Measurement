package org.web.app.models;
import java.util.ArrayList;

import org.web.app.misclleneous.RoundValues;

public class MedianCalculator {
	
	private double meadianValue;

	 private ArrayList<Integer> randomNumbersArray;
	
	 
	 public MedianCalculator() {
		 
	 }
	 
	 public MedianCalculator(ArrayList<Integer> randomValues) { 		
		    copyAllValues(randomValues);
	 		doInsertionSort(this.randomNumbersArray); 				
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
	        meadianValue=RoundValues.round(meadianValue, 4);
	        this.meadianValue=meadianValue;
	        return meadianValue;
	    }
	}
	
	public void doInsertionSort(ArrayList<Integer> randomValues){
        
        int temp;
        for (int i = 1; i <  randomValues.size(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(randomValues.get(j) < randomValues.get(j-1)){
                    temp = randomValues.get(j);
                    randomValues.set(j, randomValues.get(j-1));
                    randomValues.set(j-1, temp);
                }
            }
        }
    }
	
	public double getMeadianValue() {
			return this.meadianValue;
	}
	
	public void copyAllValues(ArrayList<Integer> tempArray) {	
	
		this.randomNumbersArray=new ArrayList<>();
			
		for(int i=0;i<tempArray.size();i++) {
			this.randomNumbersArray.add(tempArray.get(i));
		}
	}
}

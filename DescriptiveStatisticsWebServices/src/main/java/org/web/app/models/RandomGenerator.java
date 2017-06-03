package org.web.app.models;

import java.util.ArrayList;

/**
 * This class generates the random number
 * 
 * @author ALI and PARAS
 * @version 1.0 May 2017
 */
public class RandomGenerator {

	// Private Members
	private ArrayList<Integer> randomArray;

	// Public Members

	/**
	 * Parameterized Constructor
	 * 
	 * @param randomValues
	 *            An instance of Integer type to be used for the size of array
	 */
	public RandomGenerator(int size) {
		randomArray = new ArrayList<>();
		generateNoArray(size);
	}

	/**
	 * Method to generate array of random numbers
	 * 
	 * @param size
	 *            The count of random numbers
	 */
	public void generateNoArray(int size) {

		Long seed;
		int randNo;
		float tempRandNo;

	   	   for(int i=0;i<size;i++) {	
			   seed=System.nanoTime();	
			   tempRandNo = ((seed * 25173 + 13849) %101);
			   tempRandNo=(tempRandNo/101);
			   randNo=(int) (100*tempRandNo+0);
			   System.out.println(randNo);	
			   randomArray.add(randNo);		   
		   } 
	}

	/**
	 * Getter method for Random Numbers
	 */
	public ArrayList<Integer> getRandomArray() {
		return this.randomArray;
	}
}

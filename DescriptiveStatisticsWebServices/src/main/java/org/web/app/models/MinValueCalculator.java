package org.web.app.models;

import java.util.ArrayList;

/**
 * This class calculates the Minimum value
 * 
 * @author ALI and PARAS
 * @version 1.0 May 2017
 */
public class MinValueCalculator {

	// Private Members
	private ArrayList<Integer> randomNumbersArray;
	private int minValue;

	// Public Members
	/**
	 * Default Constructor
	 **/
	public MinValueCalculator() {

	}

	/**
	 * Parameterized Constructor
	 * 
	 * @param randomValues
	 *            An instance of ArrayList of Integer type to be associated with
	 *            the randomNumbers instance
	 */
	public MinValueCalculator(ArrayList<Integer> randomValues) {
		this.randomNumbersArray = randomValues;
		this.calculateMin();
	}

	/**
	 * Method to calculate the minimum of Integer List
	 * 
	 * @return Minimum Value : An Integer
	 */
	public int calculateMin() {

		int min = randomNumbersArray.get(0);

		for (int i = 0; i < randomNumbersArray.size(); i++) {
			if (randomNumbersArray.get(i) < min) {
				min = randomNumbersArray.get(i);
			}
		}
		this.minValue = min;
		return min;
	}

	/**
	 * Getter method for Minimum Value
	 */
	public int getMinValue() {
		return this.minValue;
	}
}

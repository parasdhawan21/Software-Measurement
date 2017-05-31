package org.web.app.models;

import java.util.ArrayList;

/**
 * This class calculates the maximum value
 * 
 * @author ALI and PARAS
 * @version 1.0 May 2017
 */
public class MaxValueCalculator {

	// Private Members

	private ArrayList<Integer> randomNumbersArray;
	private int maxValue;

	// Public Members

	/**
	 * Parameterized Constructor
	 * 
	 * @param randomValues
	 *            An instance of ArrayList of Integer type to be associated with
	 *            the randomNumbers instance
	 */
	public MaxValueCalculator(ArrayList<Integer> randomValues) {
		this.randomNumbersArray = randomValues;
		this.calculateMax();
	}

	/**
	 * Method to calculate the Max of Integer List
	 * 
	 * @return Maximum Value : An integer
	 */
	public int calculateMax() {

		int max = randomNumbersArray.get(0);

		for (int i = 0; i < randomNumbersArray.size(); i++) {
			if (randomNumbersArray.get(i) > max) {
				max = randomNumbersArray.get(i);
			}
		}
		this.maxValue = max;
		return max;
	}

	/**
	 * Getter method for Max Value
	 */
	public int getMaxValue() {
		return this.maxValue;
	}
}

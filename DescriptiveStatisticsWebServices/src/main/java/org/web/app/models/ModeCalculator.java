package org.web.app.models;

import java.util.ArrayList;

/**
 * This class calculates the Mode value
 * 
 * @author ALI and PARAS
 * @version 1.0 May 2017
 */
public class ModeCalculator {

	//Private Members
	private ArrayList<Integer> randomNumbersArray;
	private int modValue;

	// Public Members

	/**
	 * Parameterized Constructor
	 * 
	 * @param randomValues
	 *            An instance of ArrayList of Integer type to be associated with
	 *            the randomValues instance
	 */
	public ModeCalculator(ArrayList<Integer> randomValues) {
		this.randomNumbersArray = randomValues;
		this.calculateMode();
	}

	/**
	 * Method to calculate the mode of Integer List
	 * 
	 * @return Minimum Value : An Integer
	 */
	public int calculateMode() {
		int maxValue = 0, maxCount = 0;

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
		this.modValue = maxValue;
		return maxValue;
	}


	/**
	 * Getter method for Mode Value
	 */
	public int getModeValue() {
		return this.modValue;
	}

}

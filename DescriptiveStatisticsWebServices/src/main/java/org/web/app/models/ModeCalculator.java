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
	private String modValue;

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

		int maxValue = randomNumbersArray.get(0);
		int maxCount = 0;
		ArrayList<Integer> tempModeArray = new ArrayList<>();
		String tempStrModeValue = "";

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
				tempModeArray.clear();
				tempModeArray.add(maxValue);
			} 
			else if (count == maxCount && count > 1 && !checkIfAlreadyInArray(tempModeArray,randomNumbersArray.get(i))) {
				tempModeArray.add(randomNumbersArray.get(i));
			}
		}

		for (int i = 0; i < tempModeArray.size(); i++) {

			this.modValue = tempStrModeValue + Integer.toString(tempModeArray.get(i));
			tempStrModeValue = this.modValue + ", ";
		}

		tempModeArray = null;
		return 0;
	}

	/**
	 * Checks if mode value is already in array, if it is then it does not add new one in it.
	 */
	public boolean checkIfAlreadyInArray(ArrayList<Integer> tempArray, int value) {

		for (int i = 0; i < tempArray.size(); i++) {

			if (value == tempArray.get(i)) {
				return true;
			}
		}
		return false;
	}


	/**
	 * Getter method for Mode Value
	 */
	public String getModeValue() {
		return this.modValue;
	}

}

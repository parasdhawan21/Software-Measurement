package org.web.app.models;

import java.util.ArrayList;

import org.web.app.misclleneous.RoundValues;

/**
 * This class calculates the Median value
 * 
 * @author ALI and PARAS
 * @version 1.0 May 2017
 */
public class MedianCalculator {

	// Private Members
	private double meadianValue;
	private ArrayList<Integer> randomNumbersArray;

	// Public Members

	/**
	 * Default Constructor
	 **/
	public MedianCalculator() {

	}

	/**
	 * Parameterized Constructor
	 * 
	 * @param randomValues
	 *            An instance of ArrayList of Integer type to be associated with
	 *            the randomNumbers instance
	 */
	public MedianCalculator(ArrayList<Integer> randomValues) {
		copyAllValues(randomValues);
		doInsertionSort(this.randomNumbersArray);
		this.calculateMedian();
	}

	/**
	 * Method to calculate the Max of Integer List
	 * 
	 * @return Median Value : A double
	 */
	public double calculateMedian() {

		int middleValue = randomNumbersArray.size() / 2;
		if (randomNumbersArray.size() % 2 == 1) {
			double meadianValue = randomNumbersArray.get(middleValue);
			this.meadianValue = meadianValue;
			return meadianValue;
		} else {
			double meadianValue = (randomNumbersArray.get(middleValue - 1) + randomNumbersArray.get(middleValue)) / 2.0;
			meadianValue = RoundValues.round(meadianValue, 4);
			this.meadianValue = meadianValue;
			return meadianValue;
		}
	}

	/**
	 * Method to sort the Integer List
	 * 
	 * @return Maximum Value : An integer
	 */
	public void doInsertionSort(ArrayList<Integer> randomValues) {

		int temp;
		for (int i = 1; i < randomValues.size(); i++) {
			for (int j = i; j > 0; j--) {
				if (randomValues.get(j) < randomValues.get(j - 1)) {
					temp = randomValues.get(j);
					randomValues.set(j, randomValues.get(j - 1));
					randomValues.set(j - 1, temp);
				}
			}
		}
	}

	/**
	 * Getter method for Median Value
	 */
	public double getMeadianValue() {
		return this.meadianValue;
	}

	public void copyAllValues(ArrayList<Integer> tempArray) {

		this.randomNumbersArray = new ArrayList<>();

		for (int i = 0; i < tempArray.size(); i++) {
			this.randomNumbersArray.add(tempArray.get(i));
		}
	}
}

package org.web.app.models;

import java.util.ArrayList;

import org.web.app.misclleneous.RoundValues;

/**
 * This class calculates the mean value
 * 
 * @author ALI and PARAS
 * @version 1.0 May 2017
 */
public class MeanCalculator {

	// Private Members
	
	private ArrayList<Integer> randomNumbersArray;
	private double meanValue;

	// Public Members

	/**
	 * Default Constructor
	 **/
	public MeanCalculator() {

	}

	/**
	 * Parameterized Constructor
	 * 
	 * @param randomValues
	 *            An instance of ArrayList of Integer type to be associated with
	 *            the randomNumbers instance
	 */
	public MeanCalculator(ArrayList<Integer> randomValues) {
		this.randomNumbersArray = randomValues;
		this.calculateMean();
	}

	/**
	 * Method to calculate the Mean of Integer List
	 * 
	 * @return Mean Value : A double
	 */
	public double calculateMean() {

		double sum = 0;

		for (int i = 0; i < this.randomNumbersArray.size(); i++) {
			sum = sum + this.randomNumbersArray.get(i);
		}

		double mean = sum / (this.randomNumbersArray.size());
		mean = RoundValues.round(mean, 4);
		this.meanValue = mean;
		return mean;
	}

	/**
	 * Getter method for Mean Value
	 */
	public double getMeanValue() {
		return this.meanValue;
	}

}

package org.web.app.models;

import java.util.ArrayList;

import org.web.app.Utilities.RoundValues;

public class StandardDeviationCalulator {

	// Private Members
	private ArrayList<Integer> randomNumbersArray;
	private double stdValue;
	private double mean;

	// Public Members

	/**
	 * Parameterized Constructor
	 * 
	 * @param randomValues
	 *            An instance of ArrayList of Integer type to be associated with
	 *            the randomNumbersArray instance
	 * 
	 * @param mean
	 *            An instance of double type to be associated with the mean
	 *            instance
	 * 
	 */
	public StandardDeviationCalulator(ArrayList<Integer> randomValues, double mean) {
		this.randomNumbersArray = randomValues;
		this.mean = mean;
		this.calculateStandardDeviation();
	}

	/**
	 * Method to calculate the Standard deviation of Integer List
	 * 
	 * @return Minimum Value : An double
	 */
	public double calculateStandardDeviation() {
		double totalSum = 0;

		for (int i = 0; i < randomNumbersArray.size(); i++) {
			double sumValue = randomNumbersArray.get(i) - this.mean;
			sumValue = sumValue * sumValue;
			totalSum = sumValue + totalSum;
		}
		

		double stdVal = totalSum==0?0:squarRoot(totalSum / (randomNumbersArray.size()));
		stdVal = RoundValues.round(stdVal, 4);
		this.stdValue = stdVal;
		return stdVal;

	}

	/**
	 * Method to calculate the square root
	 * 
	 * @param value
	 *            A double value whose square root need to be found
	 */
	public static double squarRoot(double value) {
		double t;

		double squareRootValue = value / 2;

		do {
			t = squareRootValue;
			squareRootValue = (t + (value / t)) / 2;
		} while ((t - squareRootValue) != 0);

		return squareRootValue;
	}

	/**
	 * Getter method for Standard Deviation
	 */
	public double getStdValue() {
		return this.stdValue;
	}

}

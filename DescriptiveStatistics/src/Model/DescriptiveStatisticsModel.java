package Model;

import java.util.ArrayList;

/**
 * This class defines a Statistic Model and its properties
 * 
 * @author ALI and PARAS
 * @version 1.0 May 2017
 */
public class DescriptiveStatisticsModel {

	// Private Members
	private ArrayList<Integer> randomNumbers;
	private double mean;
	private double median;
	private String mode;
	private int max;
	private int min;
	private double standardDeviation;

	// Public Members
	/**
	 * Setter method for Random Number Arraylist
	 * 
	 * @param randNos
	 *            An instance of ArrayList of Integer type to be associated with
	 *            the randomNumbers instance
	 */
	public void setRandomNumbers(ArrayList<Integer> randNos) {
		this.randomNumbers = randNos;
	}

	/**
	 * Getter method for Random Number Arraylist
	 */
	public ArrayList<Integer> getRandomNumbers() {
		return this.randomNumbers;
	}

	/**
	 * Setter method for Mean
	 * 
	 * @param tempMean
	 *            An instance of double to be associated with the mean instance
	 */
	public void setMean(double tempMean) {
		this.mean = tempMean;
	}

	/**
	 * Getter method for Mean
	 */
	public double getMean() {
		return this.mean;
	}

	/**
	 * Setter method for Median
	 * 
	 * @param tempMedian
	 *            An instance of double to be associated with the median
	 *            instance
	 */
	public void setMedian(double tempMedian) {
		this.median = tempMedian;
	}

	/**
	 * Getter method for Random Number Arraylist
	 */
	public double getMeadian() {
		return this.median;
	}

	/**
	 * Setter method Max
	 * 
	 * @param tempMax
	 *            An instance of integer to be associated with the max instance
	 */
	public void setMax(int tempMax) {
		this.max = tempMax;
	}

	/**
	 * Getter method for Max
	 */
	public int getMax() {
		return this.max;
	}

	/**
	 * Setter method Min
	 * 
	 * @param tempMin
	 *            An instance of integer to be associated with the min instance
	 */
	public void setMin(int tempMin) {
		this.min = tempMin;
	}

	/**
	 * Getter method for Min
	 */
	public int getMin() {
		return this.min;
	}

	/**
	 * Setter method Mode
	 * 
	 * @param tempMode
	 *            An instance of integer to be associated with the mode instance
	 */
	public void setMode(String tempMode) {
		this.mode = tempMode;
	}

	/**
	 * Getter method for Mode
	 */
	public String getMode() {
		return this.mode;
	}

	/**
	 * Setter method Standard Deviation
	 * 
	 * @param std
	 *            An instance of double to be associated with the
	 *            standardDeviation instance
	 */
	public void setStandardDeviation(double std) {
		this.standardDeviation = std;
	}

	/**
	 * Getter method for Standard Deviation
	 */
	public double getStandardDeviation() {
		return this.standardDeviation;
	}
}

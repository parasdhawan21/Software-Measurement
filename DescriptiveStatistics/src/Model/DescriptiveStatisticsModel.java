package Model;

import java.util.ArrayList;

public class DescriptiveStatisticsModel {

	private ArrayList<Integer> randomNumbers;
	private double mean;
	private double meadian;
	private int mode;
	private int max;
	private int min;
	private double standardDeviation;
	
	
	public DescriptiveStatisticsModel() {
		
	}
	
	public void setRandomNumbers(ArrayList<Integer> randNos) {
		this.randomNumbers=randNos;
	}
	public ArrayList<Integer> getRandomNumbers(){
		return this.randomNumbers;
	}
	public void setMean(double tempMean) {
		this.mean=tempMean;
	}
	public double getMean() {
		return this.mean;
	}
	public void setMeadian(double tempMeadian) {
		this.meadian=tempMeadian;
	}
	public double getMeadian() {
		return this.meadian;
	}
	public void setMax(int tempMax) {
		this.max=tempMax;
	}
	public int getMax() {
		return this.max;
	}
	public void setMin(int tempMin) {
		this.min=tempMin;
	}
	public int getMin() {
		return this.min;
	}
	public void setMode(int tempMode) {
		this.mode=tempMode;
	}
	public int getMode() {
		return this.mode;
	}
	public void setStandardDeviation(double std) {
		this.standardDeviation=std;
	}
	public double getStandardDeviation() {
		return this.standardDeviation;
	}
}

package question2;

/**
 * Author: Tharny Elilvannan
 * Last Updated: November 08, 2024
 * Purpose: Calculates the average and median of a list of integers.
 */

import java.util.*;

public class App {
	public static void main(String[] args) {
        	int[] hello = {4, 3, 2, 9, 8};

			StatisticsCalculator s = new StatisticsCalculator(hello);
			System.out.println(s.calculateAverage());
			System.out.println(s.calculateMedian());
	} // end of main method
} // end of App class

class StatisticsCalculator {
	double average = 0.0;
	double median = 0.0;
	double sum = 0;
	int[] intArray;

	StatisticsCalculator(int[] listOfInt) {
		intArray = sortArray(listOfInt);
		calculateSum();
	} // end of StatisticsCalculator method

	private void calculateSum() {
		int i;

		for (i =0; i < intArray.length; i++) {
			sum = sum + intArray[i];
		} // end of for loop
	} // end of calculateSum method

	public double calculateAverage() {
		average = sum / (intArray.length);
		return average;
	} // end of calculateAverage method

	private int[] sortArray(int[] listOfInt) {
		Arrays.sort(listOfInt);
		return listOfInt;
	} // end of sortArray method
 
	public double calculateMedian() {

		if ((intArray.length % 2) == 0) {
			median = (intArray[(intArray.length)/2] + intArray[((intArray.length)/2)+1])/2;
		}
		else {
			median = intArray[(intArray.length)/2];
		}

		return median;

	} // end of calculateMedian method

	public void updateArray(int[] newArray) {
		intArray = sortArray(newArray);
		calculateSum();
	} // end of updateArray method

	public int[] getArray() {
		return intArray;
	}

} // end of StatisticsCalculator class
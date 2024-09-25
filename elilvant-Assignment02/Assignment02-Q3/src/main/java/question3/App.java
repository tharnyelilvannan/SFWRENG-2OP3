package question3;

/**
 * Author: Tharny Elilvannan
 * Last Updated: September 25, 2024
 * Purpose: Prints numbers in a triangle
 */

import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

		System.out.print("Enter integer: ");
	
		int number = userInput.nextInt();

		// calls method to print out triangle
		Triangle t = new Triangle(number);

		userInput.close();

    } // end of main method

} // end of App class


class Triangle {

    // prints numbers in a triangle
    Triangle(int number) {

		int counter = 1;
		String triangle = "";
	
		// determines and prints next line in triangle
		while (counter <= number) {

	    	triangle = triangle + Integer.toString(counter);
	    	System.out.println(triangle);

	    	counter = counter + 1;

		} // end of while

    } // end of Triangle method

} // end of Triangle class
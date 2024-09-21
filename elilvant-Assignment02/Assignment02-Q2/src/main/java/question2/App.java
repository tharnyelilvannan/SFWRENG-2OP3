package question2;

/**
 * Author: Tharny Elilvannan
 * Last Updated: September 17, 2024
 * Purpose: Prints integer numbers divisible by 3, 5, or both
 */

import java.util.Scanner;

public class App extends Object {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

	// user enters an integer 	
	System.out.print("Enter integer: ");
	int number = userInput.nextInt();
	
	// integers divisible by 3 and 5 are printed
	Divide d = new Divide();
	d.Divide(number);
	
	    } // end of main method

} // end of App class

class Divide {

    public static void Divide(int number) {

	divideByThree(number);
	divideByFive(number);
	divideByBoth(number);

    } // end of Divide method

    // prints numbers divisible by 3
    private static void divideByThree(int number) {
	int i = 1;
	String byThree = "";

	System.out.print("Divided by 3 ->");

	// if number is less than 3, there are no numbers divisible by 3
	if (number < 3) {
	    System.out.println(" None.");
        }
	else {
	    while (i <= number) {
	        if ((i % 3) == 0) {
		    byThree = byThree + " " + Integer.toString(i) + ",";
	        } // end of if statements
	    
	        i = i +1;
	    } // end of while

		// formats output 
		int lengthByThree = byThree.length();
		byThree = byThree.substring(0, lengthByThree - 1);
		byThree = byThree + ".";

		System.out.println(byThree);

	} // end of if/else statement
		
    } // end of divideByThree method

    // divides by 5
    private static void divideByFive(int number) {
	int i = 1;
	String byFive = "";

	System.out.print("Divided by 5 ->");
	
	// if number is less than 5, there are no numbers divisible by 5
	if (number < 5) {
	    System.out.println(" None.");
	}
	else {
	    while (i <= number) {
	        if ((i % 5) == 0) {
		    byFive = byFive + " " + Integer.toString(i) + ",";
	        } // end of if statement
	    
	        i = i +1;
	    } // end of while

		// formats output
		int lengthByFive = byFive.length();
		byFive = byFive.substring(0, lengthByFive - 1);
		byFive = byFive + ".";

		System.out.println(byFive);

	} // end of if/else statement
	
    } // end of divideByFive method

    // prints numbers divisible by both 3 and 5
    private static void divideByBoth(int number) {
	int i = 1;
	String byBoth = "";
	
	System.out.print("Divided by 3 and 5 ->");

	// if the number is less than 5, then there are no numbers divisible by both
	if (number <= 5) {
	    System.out.println(" None.");
	}
	else {
	    while (i <= number) {
	        if ((i% 5 == 0) & (i % 3 == 0)) {
	            byBoth = byBoth + " " + Integer.toString(i) + ",";
	        } // end of if statement
	    
	        i = i + 1;
	    } // end of while
	
	    // formats output
	    int lengthByBoth = byBoth.length();
	    byBoth = byBoth.substring(0, lengthByBoth - 1);
	    byBoth = byBoth + ".";
	
	    System.out.println(byBoth);

	} // end of if/else statement

    } // end of divideByBoth method

} // end of Divide class
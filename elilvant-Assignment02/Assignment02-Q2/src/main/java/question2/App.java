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

	System.out.print("Enter integer: ");
	int number = userInput.nextInt();
	
	    } // end of main method

} // end of App class

class Divide {
    public static void Divide(int number) {
	
    }

    private static String divideByThree(int number) {
	int i = 1;
	String byThree = "";

	System.out.print("Divided by 3 -> ");
	while (i <= number) {
	    if ((i % 3) == 0) {
		byThree = byThree + Integer.toString(i) + ","
	    } // end of if
	    
	    i = i +1;
	} // end of while
	
	lengthByThree = byThree.length();
	byThree = byThree.substring(0, lengthByThree - 1);

	System.out.println(byThree);
	
    } // end of divideByThree method

} // end of Divide class
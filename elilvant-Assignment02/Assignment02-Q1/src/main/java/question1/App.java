package question1;

/**
 * Author: Tharny Elilvannan
 * Last Updated: September 17, 2024
 * Purpose: Converts a decimal to an octal number. 
 */

import java.util.Scanner;

public class App extends Object {
    private static class Octal extends Object {
	private int decToOctal = 0;

	public void octal(int decimal) {

	    if (decimal < 8) {
		decToOctal = decimal;
	    }
	    else {
		octal = decimal;
	    } // end of if/else statement
		
	} // end of octal method

	private int getOctal() {
	    return decToOctal;
	} // end of getOctal method

    } // end of Octal class

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

	System.out.println("Enter integer: ");
	int number = userInput.nextInt();
	
	Octal d = new Octal(number);
	System.out.println("Octal: ", d.getOctal());

    } // end of main method

} // end of App class

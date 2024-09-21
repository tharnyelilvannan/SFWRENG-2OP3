package question1;

/**
 * Author: Tharny Elilvannan
 * Last Updated: September 21, 2024
 * Purpose: Converts a decimal to an octal number. 
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

		System.out.print("Enter integer: ");
		int number = userInput.nextInt();
	
		Octal d = new Octal();
		System.out.print("Octal: ");
		System.out.println(Integer.toString(d.getOctal(number)));

    } // end of main method

} // end of App class

class Octal {

	// converts decimal to octal
	private static int Octal(int decimal) {

		// ensures decimal value is positive
		int decimalPositive = decimal;
		if (decimal < 0){
			decimalPositive = decimal * -1;
		}

		int remainder = decimalPositive % 8;
	    int quotient = decimalPositive / 8;
	    String octalStr = "";
		String remainderStr = "";
		int octal = 0;

		if (decimal < 8 & decimal > -8) { // decimal and octal value would be the same 
			octalStr = String.valueOf(decimal);
		}
		else {
			remainderStr = String.valueOf(remainder);
			octalStr = remainderStr + octalStr;

			while (quotient != 0) {

				remainder = quotient % 8;
				quotient = quotient / 8;
				remainderStr = String.valueOf(remainder);
				octalStr = remainderStr + octalStr;

			} // end of while

			if (decimal < 0) { // if decimal value was negative, then add negative sign

				octalStr = "-" + octalStr;
				
			} // end of if statement
		} // end of if/else statement

		octal = Integer.parseInt(octalStr);
		return octal;

	} // end of Octal method
	
	// calls Octal method and returns converted value
	public int getOctal(int decimal) {

		int octal = Octal(decimal);
	    return octal;

	} // end of getOctal method

} // end of Octal class
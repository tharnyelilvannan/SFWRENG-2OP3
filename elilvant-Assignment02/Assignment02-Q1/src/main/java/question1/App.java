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

	System.out.println("Enter integer: ");
	int number = userInput.nextInt();
	
	Octal d = new Octal();
	d.Octal(number);
	System.out.println("Octal: ");
	System.out.print(Integer.toString(d.getOctal()));

    } // end of main method

} // end of App class

class Octal {
	private int octal = 0;

	public static void Octal(int decimal) {
		int remainder = decimal % 8;
	    int quotient = decimal / 8;
	    String octal = "";
		String remainderStr = "";
		
		if (decimal <= 8 & decimal >= -8) {
			octal = String.valueOf(decimal);
		}
		else {
			while (remainder != 0) {
				remainderStr = String.valueOf(remainder);
				octal = remainderStr + octal;
				System.out.println(octal);
				remainder = quotient % 8;
				quotient = quotient /8;
			} // end of while
		} // end of if/else statement
	} // end of Octal method
	
	public int getOctal() {
	    return octal;
	} // end of getOctal method

} // end of Octal class
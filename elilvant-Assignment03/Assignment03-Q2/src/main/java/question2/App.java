package question2;


/**
 * Author: Tharny Elilvannan
 * Last Updated: October 05, 2024
 * Purpose: Converts an alphanumeric phone number to a numeric phone number.
 */


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter 10 digit phone number: ");
	String number = userInput.next();

	PhoneNumber n = new PhoneNumber(number);

	System.out.println("The phone number for " + number + " is "+ n.getNumber() + ".");
	
	userInput.close();

    } // end of main method

} // end of App class



class PhoneNumber {

    private String phoneNumber = "";

    // constructor method makes new phone number
    PhoneNumber(String number) {

	int counter = 0;

	while (counter < 10) {
	    
	    String digit = Character.toString(number.charAt(counter));

	    digit = alphaToNumerical(digit);
	
	    phoneNumber = phoneNumber + digit;

	    if (counter == 2 || counter == 5) {
		
		phoneNumber = phoneNumber + "-";
	
	    } // end of if statement

	    counter = counter + 1;
	
	} // end of while
		
    } // end of PhoneNumber method

    
    // converts each letter to a number
    private String alphaToNumerical(String digit) {

	if ((digit.compareTo("A") == 0) || (digit.compareTo("B") == 0) || (digit.compareTo("C") == 0)) {
	    return "2";
	} 
	else if ((digit.compareTo("D") == 0) || (digit.compareTo("E") == 0) || (digit.compareTo("F") == 0)) {
	    return "3";
	}
	else if ((digit.compareTo("G") == 0) || (digit.compareTo("H") == 0) || (digit.compareTo("I") == 0)) {
	    return "4";
	}
	else if ((digit.compareTo("J") == 0) || (digit.compareTo("K") == 0) || (digit.compareTo("L") == 0)) {
	    return "5";
	}
	else if ((digit.compareTo("M") == 0) || (digit.compareTo("N") == 0) || (digit.compareTo("O") == 0)) {
	    return "6";
	}
	else if ((digit.compareTo("P") == 0) || (digit.compareTo("Q") == 0) || (digit.compareTo("R") == 0) || (digit.compareTo("S") == 0)) {
	    return "7";
	}
	else if ((digit.compareTo("T") == 0) || (digit.compareTo("U") == 0) || (digit.compareTo("V") == 0)) {
	    return "8";
	}
	else if ((digit.compareTo("W") == 0) || (digit.compareTo("X") == 0) || (digit.compareTo("Y") == 0) || (digit.compareTo("Z") == 0)) {
	    return "9";
	}
	else {
	    return digit;
	} // end of if/else statement

    } // end of alphaToNumerical method


    // returns phone number
    public String getNumber() {

	return phoneNumber;

    } // end of getNumber method


} // end of PhoneNumber class

package question3;

/**
 * Author: Tharny Elilvannan
 * Last Updated: September 21, 2024
 * Purpose: Prints numbers in a triangle
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

	System.out.print("Enter integer: ");
	
	int number = userInput.nextInt();

	// calls method to print out triangle
	Triangle t = new Triangle();
	t.Triangle(number);

    } // end of main method

} // end of App class

class Triangle {

    // prints numbers in a triangle
    public static void Triangle(int number) {
	int i = 1;
	String triangle = "";
	
	// determines next number in triangle
	while (i <= number) {
	    triangle = triangle + Integer.toString(i);
	    System.out.println(triangle);
	    i = i + 1;

	} // end of while

    } // end of Triangle method

} // end of Triangle class

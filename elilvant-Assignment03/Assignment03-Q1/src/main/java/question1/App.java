package question1;

/**
 * Author: Tharny Elilvannan
 * Last Updated: October 03, 2024
 * Purpose: Outputs roots of a quadratic equation.
 */

import java.util.Scanner;
import java.lang.Math.sqrt;

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter a: ");
	Double a = userInput.nextDouble();

	System.out.print("Enter b: ");
	Double b = userInput.nextDouble();

	System.out.print("Enter c: ");
	Double c = userInput.nextDouble();

	Quadratic q = new Quadratic(a, b, c);
	System.out.print("For a = ");
	System.out.print(Double.toString(a));
	System.out.print(", b = ");
	System.out.print(Double.toString(b));
	System.out.print(" and c = ");
	System.out.print(Double.toString(c));
	System.out.print(",");
	System.out.println(Quadratic.roots());

    } // end of main method

} // end of App class


class Quadratic {
    int solutions;
    Double A;
    Double B;
    Double C;

    Quadratic(Double a, Double b, Double c) {

	A = a;
	B= b;
	C = c;
	
	discriminant();

    } // end of Quadratic method


    private void discriminant() {

	if (((B*B) - 4*A*C) > 0) {
	    
	    solutions = 2;

	}
	else if (((B*B) - 4*A*C) == 0) {

	    solutions = 1;

	}
	else if (((B*B) - 4*A*C) < 0) {

	    solutions = 0;

	}
	else {
	    System.out.println("Error.");
	}

     } // end of discriminant method

	
    
    private String roots() {

	if (solutions == 2) {

	    Double x1 = (-B + Math.sqrt((B*B) - (4 * A *C))) / (2 * A);
	    Double x2 = (-B - Math.sqrt((B*B) - (4 * A *C))) / (2 * A);
		
	    String root1 = Double.toString(x1);
	    String root2 = Double.toString(x2);
	    String bothRoot = "the roots are " + root1 + " and " + root2 + ".";
	
	    return bothRoot;

	}
	else if (solutions == 1) {

	    Double x = (-B / (2 * A));
	    String root1 = Double.toString(x);
	    String root = "the root is " + root1 + ".";

	    return root;

	}
	else if (solutions == 0) {

	    String root = "there are no real roots.";

	    return root;

	}
	else {

	    System.out.println("Error.");

	}

    } // end of roots method
    

} // end of Quadratic class

package question1;


/**
 * Author: Tharny Elilvannan
 * Last Updated: October 04, 2024
 * Purpose: Outputs roots of a quadratic equation.
 */


import java.util.Scanner;
import java.lang.Math;


public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
	

	// user inputs for a, b, c
	System.out.print("Enter a: ");
	Double a = userInput.nextDouble();

	System.out.print("Enter b: ");
	Double b = userInput.nextDouble();

	System.out.print("Enter c: ");
	Double c = userInput.nextDouble();

	Quadratic q = new Quadratic(a, b, c);

	userInput.close();

    } // end of main method

} // end of App class


class Quadratic {

    private int solutions;
    private Double A;
    private Double B;
    private Double C;

    // constructor method 
    Quadratic(Double a, Double b, Double c) {

	A = a;
	B= b;
	C = c;
	
	discriminant();
	getRoots();

    } // end of Quadratic method


    // calculates discriminant to determine number of solutions
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

	
    
    // calculates roots of number of solutions is 2
    private Double[] twoRoots() {

	Double root1 = (-B + Math.sqrt((B*B) - (4 * A *C))) / (2 * A);
	Double root2 = (-B - Math.sqrt((B*B) - (4 * A *C))) / (2 * A);
		
	Double[] roots = {root1, root2};
	
	return roots;

    } // end of twoRoots method
	


    // calculates solution if number of solutions is 1
    private Double oneRoot() {

	Double root = (-B / (2 * A));

	return root;

    } // end of oneRoot method


    // number of solutions is 0
    private String noRoots() {
	
	String root = ", there are no real roots.";

	return root;

    } // end of noRoots method

	
    // prints roots
    private void getRoots() {

	if (solutions == 2) {

	    Double[] roots = twoRoots();
	    
	    System.out.println("For a=" + A + ", b=" + B + " and c=" + C + ", the roots are " + String.format("%.2f", roots[0]) + " and " + String.format("%.2f", roots[1]));    
	
	}
	else if (solutions == 1) {

	    Double root = oneRoot();

	    System.out.println("For a=" + A + ", b=" + B + " and c=" + C + ", the root is " + String.format("%.2f", root));

	}
	else if (solutions == 0) {

	    String root = noRoots();
	
	    System.out.println("For a=" + A + ", b=" + B + " and c=" + C + root);

	}
	else {

	    System.out.println("Error.");

	} // end of if/else statement

    } // end of getRoots method
    
} // end of Quadratic class

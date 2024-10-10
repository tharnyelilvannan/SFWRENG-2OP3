package tutorial5;

/**
 * Author: Tharny Elilvannan
 * Last Updated: October 07, 2024
 * Purpose: Manage student information. 
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

	System.out.print("Enter your first and last name: ");
	String studentName = userInput.nextLine();
	
	System.out.print("Enter your student number: ");
	int studentNumber = userInput.nextInt();

	System.out.print("Enter your password: ");
	String password = userInput.next();

	Student s = new Student(studentNumber, password, studentName);
	System.out.println(s.logIn());

	userInput.close();
    }
}

class Student {

    private int studentNumber = 0;
    private String password = "";
    private String studentName = "";

    Student(int num, String pass, String name) {

	this.studentName = name;
	this.password = pass;

	String studentNum = Integer.toString(num);
	
	if (pass.length() == 9) {
	    this.studentNumber = num;
	}
	else {
	    throw new IllegalArgumentException("Student number must be 9 digits.");
	} // end of if/else statement

	System.out.println(this.studentNumber);
	System.out.println(this.password);
	System.out.println(this.studentName);

    } // end of Student method

	
    public String logIn() {	

	int tries = 0;

	Scanner keyboard = new Scanner(System.in);

	while (tries < 3) {
	    System.out.print("Enter your name: ");
	    String username = keyboard.nextLine();

	    System.out.print("Enter your password: ");
	    String guess = keyboard.nextLine();

	    if ((guess.equals(password)) && (username.equals(studentName))) {
		int num = getStudentNumber();
		System.out.println(num);
		return "Done.";
	    } // end of if statement

	    tries = tries + 1;

	} // end of while	


	keyboard.close();

	return "You are out of tries.";

    } // end of logIn method


    private int getStudentNumber() {

	return this.studentNumber;

    } // end of getStudentNumber method

} // end of Student class

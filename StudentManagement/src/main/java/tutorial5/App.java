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
	String password = userInput.nextLine();

	Student s = new Student(studentNumber, password, studentName);
	s.logIn();

	userInput.close();
    }
}

class Student {

    private int studentNumber = 0;
    private String password = "";
    private String studentName = "";

    Student(int num, String pass, String name) {

	studentNumber = num;
	password = pass;
	studentName = name;

    } // end of Student method

	
    public void logIn() {	

	int tries = 0;

	Scanner keyboard = new Scanner(System.in);

	while (tries < 3) {
	    System.out.print("Enter your name: ");
	    String username = keyboard.nextLine();

	    System.out.print("Enter your password: ");
	    String guess = keyboard.nextLine();

	    if (guess == password) {
		int num = getStudentNumber();
		System.out.println(num);
		break;
	    }	
	    else {
		tries = tries + 1;
	    } // end of if/else statement

	} // end of while	

	if (tries == 3) {
	    System.out.println("You are out of tries.");
	}

	keyboard.close();

    } // end of logIn method


    private int getStudentNumber() {

	return studentNumber;

    } // end of getStudentNumber method

} // end of Student class

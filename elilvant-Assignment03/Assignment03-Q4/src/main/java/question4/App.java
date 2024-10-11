package question4;

/**
 * Author: Tharny Elilvannan
 * Last Updated: October 05, 2024
 * Purpose: Plays a guessing game with a user.
 */

import java.util.Scanner;
import java.util.Random;


public class App {

    public static void main(String[] args) {

        GuessingGame d = new GuessingGame();

    } // end of main method

} // end of App class


class GuessingGame {

    Random random = new Random();
    private int randomNumber = random.nextInt(100);

    Scanner userInput = new Scanner(System.in);

    
    GuessingGame() {

	System.out.println("Welcome to the game! You have 10 tries to guess the number.\n");
	game();	

    } // end of GuessingGame method


    private void game() {    

	int tries = 10;

	while (tries > 0) {

	    int guess = guess();
	
	    int correct = compare(guess);

	
	    if (correct == 1) {
		System.out.println("You successfully guessed the number!");
		break;
	    }

	    tries = tries - 1;

	    System.out.println("You have " + tries + " tries left.");

	} // end of while
	
	if (tries == 0) {
	    System.out.println("You have exhausted your tries.");
	}

    } // end of game method


    private int guess() {

	System.out.print("Enter your guess: ");

	int userGuess = userInput.nextInt();

	return userGuess;
	
    } // end of guess method


    private int compare(int guess) {

	if (randomNumber == guess) {
	    return 1;
	}
	else if (randomNumber > guess) {
	    System.out.println("The number is higher than " + guess + ".");
	    return 0;
	}
	else if (randomNumber < guess) {
	    System.out.println("The number is lower than " + guess + ".");
	    return 0;
	}
	else {
	    return 0;
	}

    } // end of compare method

} // end of GuessingGame class

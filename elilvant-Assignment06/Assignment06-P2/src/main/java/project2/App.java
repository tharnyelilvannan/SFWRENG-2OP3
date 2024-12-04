package project2;

/**
 * Author: Tharny Elilvannan
 * Last Updated: December 03, 2024
 * Purpose: Tic Tac Toe game.
 */

import java.util.Scanner;
import main.java.project2.Game;
 
public class App {
 
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        boolean valid = false;

        System.out.println("Welcome to TicTacToe!");

        while (!valid) {

            System.out.println("\nWould you like to play against a computer or a player?\nPress 1 for human.\nPress 2 for computer.");
            System.out.println("If you would like to play computer vs. computer, press 3.\n");

            int humanOrComputer = input.nextInt();

            System.out.println("Would you like to play the regular 3x3 game or a different size?\nPress 1 for a different size.");
            int regularOrDifferentSize = input.nextInt();

            try {

                    if (regularOrDifferentSize == 1) {

                        System.out.println("What do you want the grid size to be?\n");
                        int gridSize = input.nextInt();

                        System.out.println("What do you want the winning number to be?");
                        int winningNumber = input.nextInt();

                        new Game(humanOrComputer, gridSize, winningNumber);

                    }
                    else {

                        new Game(humanOrComputer);
                        valid = true;

                    } // end of if/else statement

            }
            catch (Exception t) {

                System.out.println(t.getMessage());

            } // end of try/catch statement

        } // end of while loop

        input.close();

    } // end of main method

} // end of App class
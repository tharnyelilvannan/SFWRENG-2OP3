package main.java.project2;

/**
 * Author: Tharny Elilvannan
 * Last Updated: December 03, 2024
 * Purpose: Tic Tac Toe Player class.
 */

import java.util.Random;
import java.util.Scanner;

public abstract class Player {
 
    private String marker = "";
    private String name = "";

    Player(String marker, String name) {

        this.marker = marker;
        this.name = name;

    } // end of Player method

    String getName() {

        return this.name;

    } // end of getName method

    String getMarker() {

        return this.marker;

    } // end of getMarker method

    abstract int[] getPosition() throws Exception;

    abstract int[] getPosition(int N) throws Exception;

} // end of Player class


class HumanPlayer extends Player {
 
    Scanner input = new Scanner(System.in);
    
    HumanPlayer(String marker, String name) {

        super(marker, name);

    } // end of HumanPlayer method

    int[] getPosition() throws Exception {

        System.out.println("Row: ");
        int row = input.nextInt();

        // assume user will enter rows as 1, 2, or 3
        row = row - 1; 

        if (row >= 3) {

            throw new Exception("Row value must be 1, 2, or 3.");

        } // end of if statement

        System.out.println("Column: ");
        int col = input.nextInt();

        // assume user will enter rows as 1, 2, or 3
        row = col - 1; 

        if (col >= 3) {

            throw new Exception("Column value must be 1, 2, or 3.");

        } // end of if statement

        int[] getPosition = {row, col};

        return getPosition;

    } // end of row method

    int[] getPosition(int N) throws Exception {

        System.out.println("Row: ");
        int row = input.nextInt();

        // assume user will enter rows as 1, 2, or 3
        row = row - 1; 

        if (row >= N) {

            throw new Exception("Row value must be between 1 and " + N + ".");

        } // end of if statement

        System.out.println("Column: ");
        int col = input.nextInt();

        // assume user will enter rows as 1, 2, or 3
        row = col - 1; 

        if (col >= N) {

            throw new Exception("Column value must be between 1 and " + N + ".");

        } // end of if statement

        int[] getPosition = {row, col};

        return getPosition;

    } // end of getPosition method

} // end of HumanPlayer class


class ComputerPlayer extends Player {
 
    Random random = new Random();

    ComputerPlayer(String marker, String name) {

        super(marker, name);

    } // end of ComputerPlayer method

    int[] getPosition() throws Exception {

        int row = random.nextInt(3);
        int col = random.nextInt(3);

        int[] getPosition = {row, col};

        return getPosition;

    } // end of getPosition method

    int[] getPosition(int N) throws Exception {

        int row = random.nextInt(N);
        int col = random.nextInt(N);

        int[] getPosition = {row, col};

        return getPosition;

    } // end of getPosition method

} // end of ComputerPlayer class
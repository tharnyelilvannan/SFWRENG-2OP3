package question1;

/**
 * Author: Tharny Elilvannan
 * Last Updated: November 11, 2024
 * Purpose: Creates a car class.
 */

public class App {
    public static void main(String[] args) {

        System.out.println("Car");

    } // end of main method

} // end of App class

abstract class Car {

    // instance variables
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
        
    } // end of Car method

    String getMake() {

        return this.make;

    } // end of getMake method

    String getModel() {

        return this.model;

    } // end of getModel method

    int getYear() {

        return this.year;

    } // end of getYear method

    abstract int fuelEfficiency();

    abstract int range();

} // end of Car class
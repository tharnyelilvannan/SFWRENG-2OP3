package question2;

/**
 * Author: Tharny Elilvannan
 * Last Updated: November 12, 2024
 * Purpose: Extends car class.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ElectricCar e = new ElectricCar("Tesla", "Model X", 2021, 400.0);
        GasolineCar g = new GasolineCar("Honda", "Civic", 2013, 40.0);

        System.out.println("Electric Car Fuel Efficiency: " + e.getFuelEfficiency());
        System.out.println("Electric Car Range on Full Charge: " + e.getRange());
        System.out.println("Gasoline Car Fuel Efficiency: " + g.getFuelEfficiency());
        System.out.println("Gasoline Car Range on Full Tank: " + g.getRange());

    } // end of main method

} // end of App class

abstract class Car {

    // instance variables
    final private String make;
    final private String model;
    final private int year;

    Car(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
        
    } // end of Car method

    final String getMake() {

        return this.make;

    } // end of getMake method

    final String getModel() {

        return this.model;

    } // end of getModel method

    final int getYear() {

        return this.year;

    } // end of getYear method

    abstract protected void fuelEfficiency();

    abstract public double getFuelEfficiency();

    abstract protected void range();

    abstract public double getRange();

} // end of Car class

class GasolineCar extends Car {

    private double efficiency = 0.0;
    private double range = 0.0;
    private double fuelTankCapacity = 0.0;
    private double milesPerGallon = 0.0;
    Scanner input = new Scanner(System.in);

    GasolineCar(String make, String model, int year, double fuelTankCapacity) {

        super(make, model, year);
        this.fuelTankCapacity = fuelTankCapacity;
        fuelEfficiency();
        this.milesPerGallon = getFuelEfficiency();
        range();
        
    } // end of GasolineCar class

    protected void fuelEfficiency() {

        try {

            System.out.println("Input distance travelled in miles: ");
            double distance = input.nextDouble();

            System.out.println("Input fuel used in Gallons: ");
            double fuelUsed = input.nextDouble();
        
            this.efficiency = distance / fuelUsed;

        } catch (InputMismatchException m) {

            System.out.println("Input must be a number.");

        } catch (Exception e) {

            System.out.println(e.getMessage());
            
        } // end of try/catch statement

    } // end of fuelEfficiency method

    public double getFuelEfficiency() {

        return this.efficiency;

    } // end of getFuelEfficiency methodS

    protected void range() {

        this.range = this.efficiency * this.fuelTankCapacity;

    } // end of range method

    public double getRange() {

        return this.range;

    } // end of getRange method

    public double getFuelTankCapacity() {

        return this.fuelTankCapacity;

    } // end of getFuelTankCapacity method

    public double getMilesPerGallon() {

        return this.milesPerGallon;

    }

} // end of GasolineCar class

class ElectricCar extends Car {

    private double efficiency = 0.0;
    private double range = 0.0;
    private double batteryCapacity = 0.0;
    private double milesPerKwh = 0.0;
    Scanner input = new Scanner(System.in);

    public ElectricCar(String make, String model, int year, double batteryCapacity) {

        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        fuelEfficiency();
        this.milesPerKwh = getFuelEfficiency();
        range();

    } // end of ElectricCar method

    protected void fuelEfficiency() {

        try {

            System.out.println("Input distance travelled in miles: ");
            double distance = input.nextDouble();

            System.out.println("Input battery used in kWh: ");
            double batteryUsed = input.nextDouble();
        
            this.efficiency = distance / batteryUsed;

        } catch (InputMismatchException m) {

            System.out.println("Input must be a number.");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } // end of try/catch statement

    } // end of fuelEfficiency method

    public double getFuelEfficiency() {

        return this.efficiency;

    } // end of getFuelEfficiency methodS

    protected void range() {

        this.range = this.efficiency * this.batteryCapacity;

    } // end of range method

    public double getRange() {

        return this.range;

    } // end of getRange method

    public double getBatteryCapacity() {

        return this.batteryCapacity;
        
    } // end of getBatteryCapacity method

    public double getMilesPerKwh() {

        return this.milesPerKwh;

    } // end of getMilesPerKwh method

} // end of ElectricCar class
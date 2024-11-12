package question2;

/**
 * Author: Tharny Elilvannan
 * Last Updated: November 12, 2024
 * Purpose: Extends car class.
 */

public class App {
    public static void main(String[] args) {

        ElectricCar e = new ElectricCar("Tesla", "Model X", 2021, 400.0, 220.3);
        GasolineCar g = new GasolineCar("Honda", "Civic", 2013, 40.0, 13.1);

        System.out.println(e.getFuelEfficiency());
        System.out.println(e.getRange());
        System.out.println(g.getFuelEfficiency());
        System.out.println(g.getRange());

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

    GasolineCar(String make, String model, int year, double fuelTankCapacity, double milesPerGallon) {

        super(make, model, year);
        this.fuelTankCapacity = fuelTankCapacity;
        this.milesPerGallon = milesPerGallon;
        fuelEfficiency();
        range();

        
    } // end of GasolineCar class

    protected void fuelEfficiency() {

        this.efficiency = 129;

    } // end of fuelEfficiency method

    public double getFuelEfficiency() {

        return this.efficiency;

    } // end of getFuelEfficiency methodS

    protected void range() {

        this.range = 133;

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

    public ElectricCar(String make, String model, int year, double batteryCapacity, double milesPerKwh) {

        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.milesPerKwh = milesPerKwh;
        fuelEfficiency();
        range();

    } // end of ElectricCar method

    protected void fuelEfficiency() {

        this.efficiency = 129;

    } // end of fuelEfficiency method

    public double getFuelEfficiency() {

        return this.efficiency;

    } // end of getFuelEfficiency methodS

    protected void range() {

        this.range = 133;

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
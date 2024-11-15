package question5;

/**
 * Author: Tharny Elilvannan
 * Last Updated: November 14, 2024
 * Purpose: Make hybrid car class.
 */

 import java.util.InputMismatchException;
 import java.util.Scanner;
 
 public class App {
     public static void main(String[] args) {
 
        HybridCar car1 = new HybridCar("Honda", "Civic", 2019, 40.0);
        HybridCar car2 = new HybridCar("Toyota", "Corolla", 2003, 40.0, 400);
        
     } // end of main method

     private static void printEfficiencyAndRange(Car[] cars) {

        for (int i = 0; i < cars.length; i++) {

            System.out.println(cars[i].getMake() + " " + cars[i].getModel() + " " + cars[i].getYear() + " Fuel Efficiency: " + cars[i].getFuelEfficiency());
            System.out.println(cars[i].getMake() + " " + cars[i].getModel() + " " + cars[i].getYear() + " Range: " + cars[i].getRange());

        } // end of for loop

     } // end of printEfficiencyAndRange class

     private static double averageRange(Car[] cars) {

        double total = 0;

        for (int i = 0; i < cars.length; i++) {

            total = total + cars[i].getRange();

        } // end of for loop

        double average = total / cars.length;

        return average;

     } // end of averageRange method
 
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
 
 class GasolineCar extends Car implements refill {
 
     private double efficiency = 0.0;
     private double range = 0.0;
     private double fuelTankCapacity = 0.0; // total fuel tank capacity
     private double milesPerGallon = 0.0;
     Scanner input = new Scanner(System.in);
     private double currentGas = 0.0;
 
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
 
     } // end of getMilesPerGallon method

    public void refillCar(double refill) {

        this.currentGas = this.currentGas + refill;

    } // end of refillCar method
 
 } // end of GasolineCar class
 
 class ElectricCar extends Car implements refill {
 
     private double efficiency = 0.0;
     private double range = 0.0;
     private double batteryCapacity = 0.0; // total battery capacity
     private double milesPerKwh = 0.0;
     Scanner input = new Scanner(System.in);
     private double currentBattery = 0.0;
 
     ElectricCar(String make, String model, int year, double batteryCapacity) {
 
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

     public void refillCar(double refill) {

        this.currentBattery = this.currentBattery + refill;

    } // end of refillCar method
 
 } // end of ElectricCar class

 interface refill {

    public void refillCar(double refill);

 } // end of refill interface

 class HybridCar extends Car {

    private double efficiency = 0.0;
     private double range = 0.0;
     private double batteryCapacity = 0.0; // total battery capacity
     private double milesPerKwh = 0.0;
     Scanner input = new Scanner(System.in);
     private double currentBattery = 0.0;
     private double fuelTankCapacity = 0.0; // total fuel tank capacity
     private double milesPerGallon = 0.0;
     private double currentGas = 0.0;

    HybridCar(String make, String model, int year, double fuelTankCapacity, double batteryCapacity) {

        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.fuelTankCapacity = fuelTankCapacity;
        range();
        fuelEfficiency();
        this.milesPerGallon = getFuelEfficiency();

    } // end of HybridCar method

    HybridCar(String make, String model, int year, double fuelTankCapacity) {

        super(make, model, year);
        this.fuelTankCapacity = fuelTankCapacity;
        range();
        fuelEfficiency();
        this.milesPerKwh = getFuelEfficiency();

    } // end of HybridCar method

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

        this.range = this.efficiency * this.fuelTankCapacity;

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

    public double getFuelTankCapacity() {
 
        return this.fuelTankCapacity;

    } // end of getFuelTankCapacity method

    public double getMilesPerGallon() {

        return this.milesPerGallon;

    } // end of getMilesPerGallon method

    public void refillCar(double refill) {

       this.currentBattery = this.currentBattery + refill;

   } // end of refillCar method

 } // end of HybridCar class
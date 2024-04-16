package mycarapp;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MyCarApp {

    /****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 02/9/2024
 * Assignment: Homework #3: MyCarApp
 * Environment Java with Netbeans
 * Files Included: MyCarApp & BuildCar
 * Purpose: create 2 car objects and specify requirements towards a trip
 * Input: Integers
 * Preconditions/ Assumptions: That program starts at zero
 * Equations: Speed = Speed + accelerate, Speed = Speed - decrement, 1*degrees 
Direction = Direction - degrees; if (degrees <= 0), if (degrees >= 0) 
Direction = Direction + degrees, Odometer = Odometer + miles, Fuel_gauge = Fuel_gauge + gas, Fuel_pumped = Fuel_gauge - Odometer/20;
 * Output: Speed, Fuel, Direction, Odometer, Fuel Used
 * Postconditions/Assumptions: Type of Integer Variable 
 * Contraints: 2 class objects
 * Algorithm: 
 * Prompt User to enter a Speeds
 * Prompt user to enter Miles Traveled
 * Prompt User to enter Fuel Used
 * Prompt user to enter direction used in positive degrees for right and negative degrees for left
 *
 * Output the initial Speed, Fuel, Direction, Odometer, Fuel Used at 0
 * Output the new values after user input and use equations for output
 * Output final results after adding each value together
 ****************************************************/
    public static void main(String[] args) {
        
        BuildCar testCar1 = new BuildCar();
        BuildCar testCar2 = new BuildCar();
        
        
        String title2 = JOptionPane.showInputDialog("Car 1 Status at Start\n");
        testCar1.startTest();
        testCar1.hitGas(50);
        testCar1.hitBreak(10);
        testCar1.hitGas(20);
        testCar1.addMiles(100);
        testCar1.addMiles(20);
        testCar1.checkFuel_gauge(10);
        testCar1.changeDirection(90);
        testCar1.gasUsed(10);
        testCar1.endTest();
        
        System.out.println("Car 2 Status at Start\n");
        String increment = JOptionPane.showInputDialog("Enter the acceleration speed: ");
        int number1 = Integer.parseInt(increment);
        String degrees = JOptionPane.showInputDialog("Enter the direction moved in degrees: if right enter positive number, if left use negative number: ");
        int number2 = Integer.parseInt(degrees);
        String gas = JOptionPane.showInputDialog("Enter the fuel pumped: ");
        int number3 = Integer.parseInt(gas);
        String miles = JOptionPane.showInputDialog("Enter the miles traveled: ");
        int number4 = Integer.parseInt(miles);
        int number5 = number4;
        double number7= number5/number3;
        double number6 = number4/20.00;
        
        JOptionPane.showMessageDialog(null, "Status at Finish\n"+ "Speed = " + number1 
                +"\n" +"Fuel = " + number2 
                + "Direction = " + number3 +"\n"
                +"Odometer = " + number4 +"\n"
                +"I traveled " , number4
                +" and used " + number6
                +" gallons of fuel.\n"
                +"You have "+ number7 
                + " gallons of gas remaining.\n", JOptionPane.PLAIN_MESSAGE);
        testCar2.hitGas(number1);
        testCar2.changeDirection(number2);
        testCar2.checkFuel_gauge(number3);
        testCar2.addMiles(number4);
        testCar2.gasUsed(number5);
        testCar2.endTest();

    }
}

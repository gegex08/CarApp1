
package mycarapp;

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
public class BuildCar {

    private int Speed = 0;
    private int Odometer = 0;
    private int Direction = 0; 
    private int Fuel_gauge = 0;
    private int Fuel_pumped = 0;
        
    public void hitGas(int accelerate){
        System.out.println("Speed increased by " + accelerate + " mph.\n");
        Speed = Speed + accelerate;
    }
    public void hitBreak(int decrement){
        System.out.println("Speed decreased by " + decrement + " mph.\n");
        Speed = Speed - decrement;
    }
    public void changeDirection(int degrees){
        if (degrees <= 0){
        System.out.println("I just turned left " + -1*degrees + " degrees.\n");
        Direction = Direction - degrees;
        }
        if (degrees >= 0){
        System.out.println("I just turned right " + degrees + " degrees.\n");
        Direction = Direction + degrees;
        }
    }
    public void addMiles(int miles){
        System.out.println("I added " + miles + " more miles to the trip.\n");
        Odometer = Odometer + miles;
    }
    public void checkFuel_gauge(int gas){
        System.out.println("Just added " + gas + " gallons of fuel.\n"); 
        Fuel_gauge = Fuel_gauge + gas;
    }
    public void gasUsed(int gas){
        
        Fuel_pumped = Fuel_gauge - Odometer/20;
        
    }
    public void startTest(){
        System.out.println("Status at Start\n");
        System.out.println("Speed = 0\n");
        System.out.println("Fuel = 0\n");
        System.out.println("Direction = 0\n");
        System.out.println("Odometer = 0\n");
        
    }
    public void endTest(){
        System.out.println("Status at Finish\n");
        System.out.println("Speed = " + Speed +"\n");
        System.out.println("Fuel = " + Fuel_gauge +"\n");
        System.out.println("Direction = " + Direction +"\n");
        System.out.println("Odometer = " + Odometer +"\n");
        System.out.printf("%s %d %s %.2f %s" , "I traveled " , Odometer , " and used " , Odometer/20.00 , " gallons of fuel.\n\n");
        System.out.println("You have " + Fuel_pumped + " gallons of gas remaining.\n");
        System.out.println("");
    }
}
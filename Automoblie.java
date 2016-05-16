/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quesion4;

import java.util.Random;

public class Automoblie 
{
    private String userAnswer;
    private String brand;
    private String model;
    private String color;
    private String name;
    private String discription; 
    private int year;
    private static int dieNumbers; 
    private static int lowestValue = 1;
    private static int highestValue = 6;
    private double gear;
    private double totalDistance;
    private double totalCycles;
    private double cycles; 
    
    
    public Automoblie(String Brand, String Model, String Color,
                                        String Name, int Year, double Gears)
    {
        name = Name;
        brand = Brand;
        model = Model;
        color = Color; 
        year = Year;
        gear = Gears;
        
    }
    
    
    
    
    
    public String About(double totalDistance) 
    {
         
           
            discription = (name + " " + color + " " + " " + year + " " + brand + " " 
                            + model + " has traveled " + totalDistance + " Miles"); 
   
           
            return discription; 
        
    }
    
    public static int Throw(int dices)
	{
            dieNumbers = dices;
            lowestValue = lowestValue * dieNumbers;
            highestValue = highestValue * dieNumbers;
            Random rand = new Random();
            int cycles = lowestValue + (int)(Math.random() * ((highestValue - lowestValue) + 1));
            return cycles;
	}
    
    public double DistanceTraveled( double totalCycles)
    { 
        for (double cycles = 0; cycles <= totalCycles; cycles++)
        {
            if (totalCycles == 0)
            {
                totalDistance = 0; 
            }
            else if (cycles <= gear)
            {

                totalDistance += (cycles * 10)/60.00;
                this.totalDistance += (cycles * 10)/60.00;
            }
            else if (cycles > gear)
            {
                totalDistance += (gear * 10)/60.00;
                this.totalDistance += (cycles * 10)/60.00;
            }
            
        }
        this.totalCycles = totalCycles;
        return totalDistance;
    }
    
    

}

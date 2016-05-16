/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quesion4;

import java.util.Scanner;

/**
 *
 * @author owner
 */
public class Quesion4 {

     public static void main(String[] args) 
    {
        int numberOfDie;
        int cycles;
        double totalDistanceTruck;
        double totalDistanceVan;
        double totalDistanceSport;
        boolean reroll = true;
        String userAnswer; 
        
        
        Automoblie truck = new Automoblie( "Toyota", "Tacoma", "Black", "Trucky", 2009, 6.0);
        Automoblie van = new Automoblie( "Honda", "Odyssey", "Blue", "Vanny", 2000, 4.0);
        Automoblie sport = new Automoblie( "Chevrolet", "Corvette", "Red", "Sporty", 2015, 8.0);

        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.print("Please input the number of Dice you want to throw: ");
            numberOfDie = scan.nextInt();

            cycles = Automoblie.Throw(numberOfDie);

            totalDistanceTruck = truck.DistanceTraveled(cycles);
            totalDistanceVan = van.DistanceTraveled(cycles);
            totalDistanceSport = sport.DistanceTraveled(cycles);


            System.out.println(truck.About(totalDistanceTruck));
            System.out.println(van.About(totalDistanceVan));
            System.out.println(sport.About(totalDistanceSport));
        
       
            do
            {
                
                System.out.println("Do You Wish to Reroll, Increase Your Total Distance Traveled, or Finish Program?");
                System.out.print("Input REROLL, INCREASE, or FINSIH: "); 
                userAnswer = scan.next();
                if (userAnswer.equalsIgnoreCase("reroll"))
                {
                    truck.DistanceTraveled(0);
                    van.DistanceTraveled(0);
                    sport.DistanceTraveled(0);
                    break; 
                }
                else if (userAnswer.equalsIgnoreCase("increase"))
                {
                    totalDistanceTruck = truck.DistanceTraveled(cycles++);
                    totalDistanceVan = van.DistanceTraveled(cycles++);
                    totalDistanceSport = sport.DistanceTraveled(cycles++);
                    System.out.println(truck.About(totalDistanceTruck));
                    System.out.println(van.About(totalDistanceVan));
                    System.out.println(sport.About(totalDistanceSport)); 
                }
                else if (userAnswer.equalsIgnoreCase("finish"))
                {
                    reroll = false;
                    break; 
                }
                else 
                {
                    System.out.println("Incorrect Input Try Again");
                    System.out.println("");
                }
            }while(true);
            
        }while(reroll); 
                
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}

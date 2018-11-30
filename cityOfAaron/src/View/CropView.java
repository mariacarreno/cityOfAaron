/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron; 
import exceptions.*;

/**
 *
 * @author Rhett
 */
public class CropView {
    
     // Create a Scanner object
 private static Scanner keyboard = new Scanner(System.in);   
     
 // Get references to the Game object and the CropData object
 private static Game game = CityOfAaron.getGame();
 private static CropData cropData = game.getCropData();

 // The buyLandView method
 // Purpose: interface with the user input for buying land
// Parameters: none
 // Returns: none
 public static void buyLandView()
 {
     int price = CropControl.calcLandCost();
     System.out.format("\n\nLand is selling for %d bushels per acre. %n", price);
     int toBuy;
     boolean paramsNotOkay;
     
     do {
         paramsNotOkay = false;
         System.out.println("\nHow many acres of land do you wish to buy?");
         toBuy = keyboard.nextInt();
         try {
             CropControl.buyLand(price, toBuy, cropData);
         } catch(CropException e) {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
         }
     } while(paramsNotOkay);
     
      // output how much land we now own
     System.out.format("You now own " + cropData.getAcresOwned() + " acres of land. ");
}

  /**
     * displayCropsReportView method
     * purpose: display annual report
     * parameters: none
     * returns: none
     */
    public static void displayCropsReportView() {
        
        CropData cropData = new CropData();
        int currentpo = cropData.getPopulation();
        int starvedpo = CropControl.calcStarved(cropData);
        int control;
        
        control = (50 * currentpo) / 100;
        // The year number
        System.out.println("In year " + cropData.getYear() + ":\n");
        // How many people starved
        System.out.println(CropControl.calcStarved(cropData) + " People starved.\n");
        // How many people came to the city
        System.out.println(CropControl.growPopulation(cropData) + " people came to the city.\n");
        // The current population
        System.out.println("The current population is " + cropData.getPopulation() + ". \n");
        // The number of acres of crop land owned by the city
        System.out.println("The city now owns " + cropData.getAcresOwned() + " acres of land.\n");
        // The number of bushels per acre in this years harvest 
        System.out.println("You harvested " + CropControl.harvestCrops(cropData) + " bushels of wheat.\n");
        // The  total number of bushels of wheat harvested
        System.out.println(CropControl.calcEatenByRats(cropData) + " bushels were eaten by rats.\n");
        // The number of bushels of wheat in store (model)
        System.out.println("You now have " + cropData.getWheatInStore() + " bushels of wheat in store.\n");
        
        if (control < starvedpo) {
        System.out.println("More than 50% of your people is starved, they need to eat!");
        System.out.println("Thanks for playing ... goodbye.");
          } else {
            return;
        }
    }
 
 
 // The sellLandView method
 // Purpose: interface with the user input for selling land
// Parameters: none
 // Returns: none
 public static void sellLandView()
 {
     // Get the cost of land for this round.
     int price = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to sell
     System.out.format("\n\nLand is selling for " + price + " bushels per acre.%n");
    int toSell;
     boolean paramsNotOkay;
     
     do {
         paramsNotOkay = false;
         System.out.println("\nHow many acres of land do you wish to sell?");
         //  Get the user’s input and save it.
         toSell = keyboard.nextInt();
         try {
             // Call the sellLand( ) method in the control layer to buy the land
             CropControl.sellLand(price, toSell, cropData);
         } catch(CropException e) {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
         }
     } while(paramsNotOkay);
 
    // output how much land we now own
     System.out.format("You now own " + cropData.getAcresOwned() + " acres of land. ");
}



 // The feedPeapleView method
 // Purpose: interface with the user input for feeding people
// Parameters: none
 // Returns: none
 public static void feedPeopleView()
 {
     // Get how much wheat you have.
     int WheatInStore = cropData.getWheatInStore();

     // Prompt the user to enter the number of wheat to save
     System.out.format("\n\nYou have " + WheatInStore + " bushels of wheat in store.%n");
          int savedWheat;
     boolean paramsNotOkay;
     
     do {
         paramsNotOkay = false;
     System.out.print("\nHow many bushels of wheat to you want to set aside for feeding people? ");
              savedWheat = keyboard.nextInt();
         try {
             CropControl.feedPeople(savedWheat, cropData);
         } catch(CropException e) {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
         }
     } while(paramsNotOkay);

    // output how much wheat we now have
     System.out.format("You now have " + cropData.getWheatInStore() + " bushels of wheat in store. ");

} 
 
// The runCropView method()
// Purpose: runs the methods to manage the crops game
// Parameters: none
// Returns: none
public static void runCropView()
{
    // call the buyLandView( ) method
    buyLandView( );

    // add calls to the other crop view methods
    // as they are written
    
    sellLandView();
    feedPeopleView();
    displayCropsReportView();
    plantCropsView();
    
    
}


// The plantCropsView method()
// Purpose: runs the methods to plant crops.
// Parameters: none
// Returns: none
public static void plantCropsView() {
    
    int acresToPlant;
    int availableAcres = cropData.getAcresOwned();
    int availablePeople = cropData.getPopulation();
    int wheatInStore = cropData.getWheatInStore();
    
    // Prompt the user to enter the number of acres to plant
    System.out.println("\nHow many acres of land do you want to plant?"); 
    
    // Get the user's input and save it
    acresToPlant = keyboard.nextInt();
    
    // Plant the crops
    cropData.setAcresPlanted(acresToPlant);
    
    // output how many acres were planted
    System.out.format("You have planted " + acresToPlant + " acres.");
    
}
    
}

// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Roger deBry
// Date last modified: May 2018
//-------------------------------------------------------------
package control;
/**
 Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */
import java.util.Random;
import java.util.Scanner;
import model.*;

public class CropControl {
 
    // constants
     private static final int LAND_BASE = 17;
     private static final int LAND_RANGE = 10;

    // random number generator
    private static Random random = new Random();
    
    // calcLandCost() method
    // Purpose: Calculate a random land cost between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land cost
    public static int calcLandCost()
    {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;  
        return landPrice;            
    }

    
// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and
//    a reference to a CropData object
// Returns: the number of acres owned after the sale
// Pre-conditions: acres to sell must be positive
// and <= acresOwned
    
    
    public static int sellLand(int landPrice, int acresToSell, CropData cropData) 
    {
         //if acresToSell < 0, return -1
          if(acresToSell < 0)
              return -1;

        //if acresToSell > acresOwned, return -1
          int owned = cropData.getAcresOwned();
         if(acresToSell > owned)
             return -1;
         
        //acresOwned = acresOwned - acresToSell
          owned -= acresToSell;
          cropData.setAcresOwned(owned);

        //wheatInStore = wheatInStore + acresToSell * landPrice
        int wheat = cropData.getWheatInStore();
        wheat += (acresToSell * landPrice);
        cropData.setWheatInStore(wheat);

        //return acresOwned
             return owned;
    }

    //The buyLand method
   //purpose: To buy land
   //Parameters: the price of the land, the number of acres to buy, and a reference to a CropData object.
   //Returns: the amount of wheatInStore left after the sale.
   //Pre-conditions: the number of wheatInStore is greater than or equal to landPrice times acresToBuy.
    
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData)
    {
      //landPrice = random number generated between 17 and 27
      //acresToBuy = number entered by user
      //if acresToBuy < 0, return -1
        if(acresToBuy < 0)
              return -1;
        
      //if acresToBuy * landPrice > wheatInStore, return -1
       int acresland = acresToBuy * landPrice;
       int wheat1 = cropData.getWheatInStore();
        if(acresland > wheat1)
              return -1;
        
      //acresOwned = acresOwned + acresToBuy
        int owned1 = cropData.getAcresOwned();
        owned1 += acresToBuy;
        
      //wheatInStore = wheatInStore – (acresToBuy * landPrice)
          wheat1 -= (acresToBuy * landPrice);
          cropData.setWheatInStore(wheat1);
          return wheat1;
      }
    
    /**
     * The feedPeople() method
     * Purpose: To Set Aside Wheat to feed the People
     * @parameter:  number of wheat that player want to set aside to feed  
     * @parameter: a reference to a CropData object
     * @ return the number of bushels of grain set aside to feed the people
     * @ return the number of bushels of grain is left in storage
     * Pre-conditions: bushels of grain set aside to feed must be positive
     * and less than or equal the number of wheat in storage
     */

     public static int feedPeople(int SeetAsideWheat, CropData cropData)
     {
         
        // If SeetAsideWheat < 0,  return -1
            if(SeetAsideWheat < 0)
                return -1;
        //if SeetAsideWheat > WheathInStore,  return -1
            int wheat2 = cropData.getWheatInStore();
            if(SeetAsideWheat > wheat2)
                   return -1;
        //wheatInStore = wheatInStore – SeetAsideWheat
             wheat2 -= SeetAsideWheat;
             
        //return SeetAsideWheat and WheatInStore
             cropData.setWheatInStore(wheat2);
             return SeetAsideWheat;
     }
     
     /**
      * The setOffering method
      * Purpose: Set the offering percentage
      * @param _offeringPercentage the offering percentage
      * @param _cropData reference to a CropData object
      * @return a valid offering percentage
      * Pre-conditions: if the harvest is > 0, the offering percentage must be > 0 
      */
     public static int setOffering(int _offeringPercentage, CropData _cropData) {
         
         int op = _offeringPercentage;
         int harvest = _cropData.getHarvest();
         
         if (isOfferingInRange(op, 1, 100)) {
             if (harvest >= 1) {
                 return op;
             } else {
                 return 0;
             }
         } else {
             return -1;
         }
         
     }
     
     private static boolean isOfferingInRange(int offeringPercentage, int min, int max) {
         return (offeringPercentage >= min && offeringPercentage <= max);
     }
     
     
     
     //The plantCrops method
    //purpose: To allocate seed for next years crops.
    //Parameters: the acres of land planted, the number of wheat in store, and a reference to a CropData object.
    //Returns: the number of acres planted and the amount of wheat left in storage.
    //Pre-conditions: the city has enough land to plant, the city has enough people to tend the land, there is enough wheat in store to plant the number of acres of land.

     
         public static int plantCrops(int acresPlanted, int wheatInStore, int population1, CropData _cropData){
             
             int owned = _cropData.getAcresOwned();
             int planted = acresPlanted;
             int population = population1;
             int wheat = wheatInStore;
         
             
             
             
        //acresPlanted = number entered by user
        /*Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter number of acres planted: ");
        planted = keyboard.nextInt();
        */
      
        
        //acresPlanted > 0
        if(planted < 0)
              return -1;        
        
        //acresOwned >= acresPlanted
        if(owned < planted)
            return -1;
        
        //population >= acresPlanted / 10
        int chk = planted / 10;
        if(population < chk)
            return -1;        
        
        //wheatInStore >= acresPlanted / 2
         if(wheat < planted / 2)
            return -1;         
        
        
        //acresPlanted / 2
        int wheatUsed = planted / 2;
        
        //wheatInStore  = wheatInStore - acresPlanted / 2
        wheat = wheat - wheatUsed;
        return wheat;

      }

}


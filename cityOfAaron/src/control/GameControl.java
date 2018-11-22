/*
 * The GameControl class - part of the control layer
 * Object of this class manages the main menu
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 * Date last modified: Nov 2018
 */
//-------------------------------------------------------------
package control;

import model.*;
import cityofaaron.CityOfAaron;


/**
 *
 * @author Rhett
 */
public class GameControl {
    
    // Size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    private static Game game = new Game();
    
        public static void createNewGame(String _name) {
            
            
    
         //Game game = new Game();
   
   // Create a new Player object
        Player player = new Player();
        
   //  Store the name of the player in the Player object
        player.setName(_name);
   
   // Store a reference to the Player object in the Game object
        game.setPlayer(player);
        
        createCropDataObject();
        
        createMap();

  
   // Save a reference to the Game object in the static variable
   
        CityOfAaron.setGame(game);
  
   // declared in the CityOfAaron class.

            
        }
        
        
        // method prologue
        public static void createCropDataObject() {
            
            CropData theCrops = new CropData();
            
            theCrops.setYear(0);
            theCrops.setPopulation(100);
            theCrops.setNewPeople(5);
            theCrops.setCropYield(3);
            theCrops.setNumberWhoDied(0);
            theCrops.setOffering(10);
            theCrops.setWheatInStore(2700);
            theCrops.setAcresOwned(1000);
            theCrops.setAcresPlanted(1000);
            theCrops.setHarvest(3000);
            theCrops.setOfferingBushels(300);
            
            game.setCropData(theCrops);
            
        }
        
        
        // The createMap method
        // Purpose: creates the location objects and the map
        // Parameters: none
        // Returns: none
        public static void createMap() {
            
            //create the map object
            // refer to the Map constructor
            Map theMap = new Map(MAX_ROW, MAX_COL);
            
            String mtns = "\nYou are in the mountains. The mountains create a protective" +
                          "\nbarrier on the west.";
            String city = "\nThis is the city. Where most of the population lives.";
            String farmLand = "\nYou are in the fertile banks of the river." +
                              "\nIn the spring, this low farmland floods and is covered with rich" +
                              "\nnew soil. Wheat is planted as far as you can see.";
            String forest = "\nThis is the forest. Timber for building is harvested from here.";
            String river = "\nYou are in the river. The river is the source" +
                           "\nof life in our city. The river marks the eastern" +
                           "\nboundary of the city - it is wilderness to the East.";
            
            // Create a new location object
            Location locMtns = new Location();
            Location locCity = new Location();
            Location locFarm = new Location();
            Location locForest = new Location();
            Location locRiver = new Location();
            
            // Use setters in the location class to set the description and symbol
            locMtns.setDescription(mtns);
            locMtns.setSymbol("^^^");
            
            // Use setters in the location class to set the description and symbol
            locCity.setDescription(city);
            locCity.setSymbol("|||");
            
            // Use setters in the location class to set the description and symbol
            locFarm.setDescription(farmLand + "\nOne bushel will plant 2 acres of wheat.");
            locFarm.setSymbol("!!!");
            
            // Use setters in the location class to set the description and symbol
            locForest.setDescription(forest);
            locForest.setSymbol("###");

            // Use setters in the location class to set the description and symbol
            locRiver.setDescription(river);
            locRiver.setSymbol("~~~");locRiver.setDescription(river);
            
            // Set this location object in each cell of the array in column 4
            for (int i = 0; i < MAX_ROW; i++) {
                theMap.setLocation(i, 4, locRiver);
            }
            
            for (int j = 0; j < MAX_ROW; j++) {
                theMap.setLocation(j, 3, locFarm);
            }
            
            for (int k = 0; k < MAX_ROW; k++) {
                theMap.setLocation(k, 0, locMtns);
            }
            
            for (int l = 0; l < MAX_ROW; l++) {
                theMap.setLocation(l, 2, locCity);
            }
            
            for (int m = 0; m < MAX_ROW; m++) {
                theMap.setLocation(m, 1, locForest);
            }
            
            game.setMap(theMap);
            
        }
        
        
        

}

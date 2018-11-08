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
        public static void createNewGame(String _name){
   // Create a new Game object.
    
         Game game = new Game();
   
   // Create a new Player object
        Player player = new Player();
        
   //  Store the name of the player in the Player object
        player.setName(_name);
   
   // Store a reference to the Player object in the Game object
        game.setPlayer(player);   
        
   // Create a CropData object     
   // Initialize the data values in the CropData object
   // Save a reference to the CropData object in the Game object
        CropData cropData = new CropData();
        
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setAcresPlanted(1000); 
        cropData.setWheatForFood(2000);
        game.setCropData(cropData); 
        
        

  
   // Save a reference to the Game object in the static variable
   
        CityOfAaron.setGame(game);
  
   // declared in the CityOfAaron class.

            
        }

}

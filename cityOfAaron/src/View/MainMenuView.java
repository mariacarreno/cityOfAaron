/*
 * The MainMenuView class - part of the view layer
 * Object of this class manages the main menu
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 * Date last modified: Nov 2018
 */
//-------------------------------------------------------------
package View;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;
import java.io.*;


/**
 *
 * @author Rhett
 */
public class MainMenuView extends MenuView {
    
    int userInput = 0;
    final int MAX = 5;




// The MainMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
public MainMenuView()
{
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n",
                5);
}


 // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override public void doAction(int option)
    {
                switch(option)
        {
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4: // save game
                saveGame();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }

    } 

     // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startNewGame()
    {
    // Display the Banner Page.
        System.out.println("\nWelcome to the city of Aaron.");

    // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();

    // Call the createNewGame() method in the GameControl class
        GameControl.createNewGame(name);
    
    // Display a welcome message
        System.out.println("Welcome " + name + " have fun!!!");
     
    // Display the Game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenuView();

    }

    // The startSavedGame method
    // Purpose: creates game object and saves the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void startSavedGame() {
        // Get rid of nl character left in the stream
        
        // prompt user to get a file path
        System.out.println("\nPlease type the saved game's file name: ");
        String filePath = keyboard.next();
        
        try {
            FileInputStream fips = new FileInputStream(filePath);
            ObjectInputStream input = new ObjectInputStream(fips);
        } catch (FileNotFoundException e1) {
            System.out.println("\nWe can't find that file. Please try again.");
        } catch (IOException e2) {
            System.out.println("\nThere was as problem with the file you selected. Please try again.");
        }
        
        
        // call the getSavedGame() method in the GameControl class to load the game
        GameControl.getSavedGame(filePath);
        
        // display the game menu for the loaded game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenuView();
        
        
        //System.out.println("\nStart saved game selected.");
    }

     // The displayHelpMenuView method
    // Purpose: creates game object and displays the help menu
    // Parameters: none
    // Returns: none
    // ===================================     
    public void displayHelpMenuView( )
    {
         System.out.println("\nDisplay help menu view selected.");
         
         // display the Help menu
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayMenuView();

         
    }

     // The displaySaveGameView method
    // Purpose: creates game object and displays the save game view
    // Parameters: none
    // Returns: none
    // ===================================     
    public void saveGame()
    {
         System.out.println("\nPlease enter a file name for your saved game");
         
         // prompt user to get a file path
        String filePath = keyboard.next();
        
        try {
            FileOutputStream fops = new FileOutputStream(filePath);
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(CityOfAaron.getGame());
        } catch (Exception e) {
            System.out.println("\nThere was a problem saving your game file. Please try again.");
            System.out.print(e);
            System.out.println(e.getStackTrace());
        } 
    }    
    
}
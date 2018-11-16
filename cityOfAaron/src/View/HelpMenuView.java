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


   
/**
 *
 * @author Rhett
 */
public class HelpMenuView extends MenuView {
    
    int userInput = 0;
    final int MAX = 5;

    

// The MainMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
public HelpMenuView()
{
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Goals\n" +
                   " 2 - Map Help\n" +
                   " 3 - Move Help\n" +
                   " 4 - List Help\n" +
                   " 5 - Return to Main Menu\n", 
                5);
    }



 // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(int option)
    {
                switch(option)
        {
            case 1: // create and start a new game
                viewGoals();
                break;
            case 2: // get and start a saved game
                viewMapHelp();
                break;
            case 3: // get help menu
                ViewMoveHelp();
                break;
            case 4: // save game
                listHelp();
                break;
            case 5:
                //System.out.println("Thanks for playing ... goodbye.");
                // return to main menu
                return;

        }

    }     

     // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewGoals()
    {
    // Display Stub.
        System.out.println("\nDisplay Goals.");
    }

    // ===================================     
    public void viewMapHelp( )
    {
        // Display Stub.
         System.out.println("\nDisplay Map Help.");
    }

    // ===================================     
    public void ViewMoveHelp( )
    {
        // Display Stub.
         System.out.println("\nDisplay Move Help.");
    }

    // ===================================     
    public void listHelp( )
    {
        // Display Stub.
         System.out.println("\nDisplay List Help.");
    }    
    
}





    
    


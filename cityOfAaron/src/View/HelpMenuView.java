/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;


   
/**
 *
 * @author Rhett
 */
public class HelpMenuView {
    
    private String theHelpMenu;
    private int max;
    int userInput = 0;
    final int MAX = 5;

    
    Scanner keyboard = new Scanner(System.in);

    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // =========================================================    
    public void displayMenuView()
    {
        int menuOption;
    do
    {
        // Display the menu
        System.out.println(theHelpMenu);

        // Prompt the user and get the user’s input
        menuOption = getMenuOption();

        // Perform the desired action
        doAction(menuOption);

    } while (menuOption != max);

 
    }




// The MainMenuView constructor
// Purpose: Initialize the menu data
// Parameters: none
// Returns: none
// ===================================
public HelpMenuView()
{
        theHelpMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Goals\n" +
                   " 2 - Map Help\n" +
                   " 3 - Move Help\n" +
                   " 4 - List Help\n" +
                   " 5 - Return to Main Menu\n";
        
        max = 5;
}


 // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
 
          do
{
         // get user input from the keyboard
         userInput = keyboard.nextInt();
         // if it is not a valid value, output an error message
         if(userInput < 1 || userInput > MAX)
              System.out.println("Error: you must select 1, 2, 3, 4, or 5");
        // loop back to the top of the loop if input was not valid
// end loop
} while (userInput < 1 || userInput > MAX);

        return userInput;
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





    
    


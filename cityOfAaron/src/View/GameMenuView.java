/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import java.util.Arrays;
import cityofaaron.CityOfAaron;
import control.*;

/**
 *
 * @author Nate Petersen
 */
public class GameMenuView {

    private final String theGameMenu;
    private final int max = 5;
    int userInput = 0;
    Scanner keyboard = new Scanner(System.in);

    
    // The GameMenuView constructor
    // Purpose: Initialize the game menu data
    // Parameters: none
    // Returns: none
    // ===================================
    public GameMenuView() {
        theGameMenu = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - View Map\n"
                + " 2 - View/Print a List\n"
                + " 3 - Move to a New Location\n"
                + " 4 - Manage the Crops\n"
                + " 5 - Return to the Main Menu\n";
    }
    

    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    // selected action
    // Parameters: none
    // Returns: none
    // =========================================================
    public void displayMenuView() {
        
        int menuOption;
        
        do {
            // Display the menu
            System.out.println(theGameMenu);

            // Prompt the user and get the user’s input
            menuOption = getMenuOption();

            // Perform the desired action
            doAction(menuOption);
        
        } while (menuOption != max);
    
    }
    

    // The getInputs method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: int - the option selected
    // ===================================       
    public int getMenuOption() {
        
        do {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            
            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > max) {
                System.out.println("Error: you must select 1, 2, 3, 4, or 5");
            }

            // loop back to the top of the loop if input was not valid

            // end loop
        } while (userInput < 1 || userInput > max);

        return userInput;
        
    }
    

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: int menu option
    // Returns: none
    // ===================================       
    public void doAction(int option) {
        switch (option) {
            case 1: //view map
                viewMap();
                break;
            case 2: //view lists menu
                viewList();
                break;
            case 3: //view move to new location
                moveToNewLocation();
                break;
            case 4: // manage crops
                manageCrops();
                break;
            case 5: // main menu
                return;
        }

    }

    
    // ===================================     
    public void viewMap() {
        // Display Stub.
        System.out.println("\nView Map.");
    }
    

    // ===================================     
    public void viewList() {
        // Display Stub.
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenuView();
    }
    
  
    // ===================================     
    public void moveToNewLocation() {
        // Display Stub.
        System.out.println("\nMove to New Location.");
    }
    

    // ===================================     
    public void manageCrops() {
        // Display Stub.
        System.out.println("\nManage Crops.");
    }

}

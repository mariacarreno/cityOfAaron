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
    String userInput;
    Scanner keyboard = new Scanner(System.in);

    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    // selected action
    // Parameters: none
    // Returns: none
    // =========================================================    
    public void displayMenuView() {
        
        String menuOption;
        boolean endView = false;
        
        do {
            // Display the menu
            System.out.println(theGameMenu);

            // Prompt the user and get the user’s input
            menuOption = getInput();
            
            if (menuOption.equals("Q") || menuOption.equals("")) {
                return;
            } else {
                endView = true;
            }

            // Perform the desired action
            doAction(menuOption);

        } while (endView != true);

    }

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
                + " V - View map\n"
                + " I - View/Print a list\n"
                + " A - View list of actors\n"
                + " S - View ship status\n"
                + " L - View contents of location\n"
                + " M - Move person to new location\n"
                + " E - Estimate the resource needed\n"
                + " B - Design barrels\n"
                + " C - Construct tools\n"
                + " R - Harvest resource\n"
                + " D - Deliver resource\n"
                + " W - Work on ship\n"
                + " J - Launch ship\n"
                + " SG - Save game\n"
                + " H - Help\n"
                + " Q - Quit\n";
    }
    

    // The getInputs method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: String - the option selected
    // ===================================       
    public String getInput() {
        
        String[] inputs = new String[] {"V", "I", "A", "S", "L", "M", "E", "B", "C", "R", "D", "W", "J", "SG", "H", "Q"};
        
        boolean valid = false;
        
        do {
            
            // get user input from the keyboard
            userInput = keyboard.next().trim().toUpperCase();
            
            if (userInput.length() > 0 && Arrays.stream(inputs).anyMatch(userInput::equals)) {
                valid = true;
            } else {
                System.out.println("Error: you must select a valid menu option.");
            }
            
        } while (valid != true);
        
        return userInput;
        
    }
    

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    public void doAction(String option) {
        switch (option) {
            case "V":
                viewMap();
                break;
            case "I": //view lists menu
                viewList();
                break;
            case "A":
                viewActors();
                break;
            case "S":
                viewShipStatus();
                break;
            case "L":
                viewLocationContents();
                break;
            case "M":
                movePerson();
                break;
            case "E":
                estimateNeededResources();
                break;
            case "B":
                designBarrles();
                break;
            case "C":
                constructTools();
                break;
            case "R":
                harvestResource();
                break;
            case "D":
                deliverResource();
                break;
            case "W":
                workOnShip();
                break;
            case "J":
                launchShip();
                break;
            case "SG":
                saveGame();
                break;
            case "H":
                help();
                break;
            case "Q":
                break;

        }

    }

    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // ===================================     
    public void viewMap() {
        // Display Stub.
        System.out.println("\nDisplay Map.");
    }

    // ===================================     
    public void viewList() {
        // Display Stub.
         ListMenuView lmv = new ListMenuView();
         lmv.displayMenuView();
    }
  
    // ===================================     
    public void viewActors() {
        // Display Stub.
        System.out.println("\nDisplay Actors.");
    }

    // ===================================     
    public void viewShipStatus() {
        // Display Stub.
        System.out.println("\nDisplay Ship Status.");
    }
    
    // ===================================     
    public void viewLocationContents() {
        // Display Stub.
        System.out.println("\nDisplay Location Contents.");
    }
    
    // ===================================     
    public void movePerson() {
        // Display Stub.
        System.out.println("\nMove Person to New Location.");
    }
    
    // ===================================     
    public void estimateNeededResources() {
        // Display Stub.
        System.out.println("\nEstimate Needed Resources.");
    }
    
    // ===================================     
    public void designBarrles() {
        // Display Stub.
        System.out.println("\nDesign Barrels.");
    }
    
    // ===================================     
    public void constructTools() {
        // Display Stub.
        System.out.println("\nConstruct Tools.");
    }
    
    // ===================================     
    public void harvestResource() {
        // Display Stub.
        System.out.println("\nHarvest Resource.");
    }
    
    // ===================================     
    public void deliverResource() {
        // Display Stub.
        System.out.println("\nDeliver Resource.");
    }
    
    // ===================================     
    public void workOnShip() {
        // Display Stub.
        System.out.println("\nWork on Ship.");
    }
    
    // ===================================     
    public void packShip() {
        // Display Stub.
        System.out.println("\nPack Ship.");
    }
    
    // ===================================     
    public void launchShip() {
        // Display Stub.
        System.out.println("\nLaunch Ship.");
    }
    
    // ===================================     
    public void saveGame() {
        // Display Stub.
        System.out.println("\nSave Game.");
    }
    
    // ===================================     
    public void help() {
        // Display Stub.
        System.out.println("\nHelp.");
    }

}

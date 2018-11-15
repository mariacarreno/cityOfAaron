/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Nate
 */
public abstract class MenuView implements ViewInterface {
    
    protected final static Scanner keyboard = new Scanner(System.in);
    protected String menu;
    protected int max;
    
    // Menu View Constructor
    // Purpose: Initialize the new object with the menu string
    // Parameters: the menu string and the max value
    // Returns: none
    public MenuView(String _menu, int _max) {
        
        menu = _menu;
        max = _max;
        
    } 
    
    // The displayMenu method
    // Purpose: displays the menu, gets the user's input, and does the selected action
    // Parameters: none
    // Returns: none
    @Override public void displayMenuView() {
        
        int menuOption = 0;
        
        do {
            // Display the menu
            System.out.println(menu);

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
    @Override public int getMenuOption() {
        
        int inputValue = 0;
        
        do {
            
            System.out.format("\nPlease enter an option(1 - %d):", max);
            inputValue = keyboard.nextInt();
            
            if (inputValue < 1 || inputValue > max) {
                System.out.format("\nError: input value must be between 1 and %d.", max);
            }
           
        } while (inputValue < 1 || inputValue > max);

        return inputValue;
        
    }
    
}

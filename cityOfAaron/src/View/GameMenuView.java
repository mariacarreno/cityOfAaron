/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Nate Petersen
 */
public class GameMenuView extends MenuView {

    int userInput = 0;
    final int MAX = 5;

    
    // The GameMenuView constructor
    // Purpose: Initialize the game menu data
    // Parameters: none
    // Returns: none
    // ===================================
    public GameMenuView() {
        super("\n"
                + "**********************************\n"
                + "* CITY OF AARON: GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - View Map\n"
                + " 2 - View/Print a List\n"
                + " 3 - Move to a New Location\n"
                + " 4 - Manage the Crops\n"
                + " 5 - Return to the Main Menu\n", 5);
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
    

    // The viewList method
    // Purpose: Creates a ListMenuView object and calls its displayMenu() method
    // Parameters: none
    // Returns: none
    public void viewList() {
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
        CropView.buyLandView();
        CropView.sellLandView();
    }

}

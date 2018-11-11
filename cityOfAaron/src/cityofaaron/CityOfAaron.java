/*
 * The main()class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */

package cityofaaron;

import model.*;
import View.*;
    

/**
 *
 * @author Usuario, npetersen
 */
public class CityOfAaron {
    
    // variable for keeping a reference to the Game object
    private static Game theGame = null;
    public static Game getGame() {
        return theGame;
    }

    public static Game setGame(Game _theGame) {
        return theGame = _theGame;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // main function - entry point for the program
            // runs the main menu
            MainMenuView mmv = new MainMenuView();
            mmv.displayMenuView();
            
    }
    
}

/*
 * The main()class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */

package cityofaaron;

import model.*;

/**
 *
 * @author Usuario, npetersen
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* 
         * Create an instance of your Player class. 
         * Using its setName() method, store a person’s 
         * name in the instance of your Player class 
         */
        Player player1 = new Player();
        player1.setName("Test Player");
        
        /* 
         * Create an instance of your Game class. 
         * Using its setPlayer() method, save a 
         * reference to your player object in the 
         * game object 
         */
        Game game1 = new Game();
        game1.setPlayer(player1);
        
        /* 
         * Get a reference to the Player object from the game 
         * object, and use its getName() method to display it 
         */
        System.out.println(game1.getPlayer().getName());
        
        /* 
         * Get one of the objects in your TeamMember enum and call its getName() 
         * and getDescription() methods to retrieve the name and description for 
         * that team member and display them on the console 
         */
        System.out.println(TeamMember.TEAMMEMBER1.getName());
        System.out.println(TeamMember.TEAMMEMBER1.getTitle());
        
        /*
         * This is a test to show how Push works
         *
         */
        
        
        
    }
    
}

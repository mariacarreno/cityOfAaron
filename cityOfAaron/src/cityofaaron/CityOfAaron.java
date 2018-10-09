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
        
        Player player1 = new Player();
        player1.setName("Test Player");
        
        Game game1 = new Game();
        game1.setPlayer(player1);
        
        System.out.println(game1.getPlayer().getName());
        
        System.out.println(TeamMember.TeamMember1.getName());
        
        System.out.println(TeamMember.TeamMember1.getTitle());
        
    }
    
}

/*
 * The Game class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */

package model;

/**
 *
 * @author npetersen
 */
public class Game {
    
    private Player thePlayer;
    
    public Game() {}
    
    public Player getPlayer() {
        return this.thePlayer;
    }
    
    public void setPlayer(Player _thePlayer) {
        this.thePlayer = _thePlayer;
    }
    
}

/*
 * The Player class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */

package model;

import java.io.*;

/**
 *
 * @author npetersen
 */
public class Player implements Serializable {
    
    private String name;
    
    public Player() {}
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String _name) {
        this.name = _name;
    }
    
}

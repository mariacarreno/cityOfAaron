/*
 * The Player class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */
package model;

import java.io.*;

/**
 * @author Rhett McDermott 
 */
public class ListItem implements Serializable {
    
    private String name;
    private int number;

    public ListItem(String _name, int _number) {
        name = _name;
        number = _number;
    }
            
    public String getName() {
        return this.name;
    }    
    public void setName(String _name) {
        this.name = _name;
    }

    public int getNumber() {
        return this.number;
    }
    
    public void setNumber(int _number) {
        this.number = _number;
    }    
    
}

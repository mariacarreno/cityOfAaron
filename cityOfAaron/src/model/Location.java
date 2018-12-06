 /*
 *The Player class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */
package model;

import java.io.*;

/**
 *
 * @author María Carreño
 */
public class Location implements Serializable {
    
    private String description;
    private String symbol;
    
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String _description) {
        this.description = _description;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(String _symbol) {
        this.symbol = _symbol;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;

/**
 *
 * @author Nate Petersen
 */
public class Map implements Serializable {
    
    private int rowCount;
    private int colCount;
    private Location locations[][];
    
    
    // Default Map constructor
    // Purpose: Set data members to default values
    // Paramters: none
    // Returns: none
    public Map() {};
    
    // Parameterized Map constructor
    // Purpose: Sets row and column values and creates an array of location objects
    // Parameters: Row and column counts
    // Returns: none
    public Map(int _rows, int _cols) {
        rowCount = _rows;
        colCount = _cols;
        
        // Create the array of location objects
        locations = new Location[_rows][_cols];
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }
    
    // The getLocation method
    // Purpose: Returns the location object at the given row and column
    // Paramters: row and column
    // Returns: a Location object
    public Location getLocation(int row, int col) {
        return locations[row][col];
    }
    
    // The setLocation method
    // Purpose: stores a location object at the row and column 
    // Parameters: a row and a column and a reference to a Location object
    // Returns: void
    public void setLocation(int row, int col, Location _location) {
        locations[row][col] = _location;
    }
    
}

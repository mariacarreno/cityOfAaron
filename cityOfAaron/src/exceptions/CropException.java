/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Nate Petersen
 */
public class CropException extends Exception {
    
    // Default constructor
    // Purpose: Initialized data members to default values
    // Parameters: none
    // Returns: none
    public CropException() {}
    
    // Parameterized constructor
    // Purpose: initializes data members to value passed as a parameter
    // Parameters: A string containing the error message
    // Returns: none
    public CropException(String _string) {
        super(_string);
    }
    
}
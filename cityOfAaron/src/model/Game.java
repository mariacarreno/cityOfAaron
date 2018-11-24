/*
 * The Game class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author npetersen
 */
public class Game {
    
    private Player thePlayer;
    private CropData theCropData;
    private Map map;
    private ArrayList<String> theTools;
 
    
    
    public Game() {}
    
    public Player getPlayer() {
        return this.thePlayer;
    }
    
    public void setPlayer(Player _thePlayer) {
        this.thePlayer = _thePlayer;
    }
    
    public CropData getCropData() {
        return this.theCropData;
    }
    
    public void setCropData(CropData _theCropData) {
        this.theCropData = _theCropData;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map _map) {
        this.map = _map;
    } 
    
    
    public ArrayList<String> getTool() {
        return theTools;
    }    
    
    public void setTool(ArrayList<String> _theTools) {
        this.theTools = _theTools;
    }

 
    
  


  
    
    
    
}

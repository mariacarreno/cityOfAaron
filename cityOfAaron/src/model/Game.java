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
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> provisions;
 
    
    
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
    
 
    
    public ArrayList<ListItem> getTool() {
        return this.tools;
    }

    public void setTool(ArrayList<ListItem> _tools) {
        this.tools = _tools;
    }
    
    
    
    

    public ArrayList<ListItem> getAnimals() {
        return this.animals;
    }

    public void setAnimals(ArrayList<ListItem> _animals) {
        this.animals = _animals;
    }
    
    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }
    
  


  
    
    
    
}

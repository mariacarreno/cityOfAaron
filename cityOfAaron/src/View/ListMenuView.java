/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import model.*;
import cityofaaron.CityOfAaron;
import java.util.ArrayList;
import java.io.*;
import control.*;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Maria Rosa
 */
public class ListMenuView extends MenuView {
    
    int userInput = 0;
    final int MAX = 5;
    private Game game = CityOfAaron.getGame();
   
    public ListMenuView () {
     super("\n" 
           + "*********************************\n" 
           +"** CITY OF AARON: LIST MENU **\n" 
           +"*********************************\n" 
           +" 1 - List the animals in the storehouse\n" 
           +" 2 - List the tools in the storehouse\n" 
           +" 3 - List the provisions in the storehouse\n" 
           +" 4 - List the Developers\n" 
           +" 5 - Return to the Main menu\n",5);
           
    }
      
    /**
     * Purpose: To perform the player's desired action
     */
    public void doAction(int option) {
        switch (option) {
            case 1: //List the animals
                listAnimals();
                break;
            case 2: //List tools
                listTools();
                break;
            case 3: //List provisions
                listProvisions();
                break;
            case 4: //List developers
                listTeam();
                break;
            case 5: //Return to the calling menu
                return;
        }
    }
    
    /**
     * Purpose: Display the list of animals that the player has
     */
    public void listAnimals() {
        ArrayList<ListItem> animals = game.getAnimals();     
        
        System.out.println("Display a list of animals here");
        
        for (ListItem animal: animals) {
            System.out.println(animal.getName() + "\t" + animal.getNumber());
        }
    }
    
    /**
     * Purpose: Display the list of tools that the player has
     */

        public void listTools() {
          
                 ArrayList<ListItem> tools = game.getTool(); 
        System.out.println("\nDo you want to view the Tools list or print the provisions list?\nEnter 1 to view the list\nEnter 2 to print the list.");
        switch(keyboard.next()) {
            case "1": 
                //displays the tools list to the screen
                System.out.println("Tools in the City of Aaron");
          for (ListItem tool: tools) {
            System.out.println(tool.getName() + "\t" + tool.getNumber());
        }
                break;
            case "2":
                // write the tools list to a file
                System.out.println("Tools list was saved to tools.txt");
                try (PrintWriter out = new PrintWriter("tools.txt")) {
                    out.println("\nCity of Aaron Tools in the Storehouse");
                    for (ListItem tool : tools) {
                        out.println(tool.getName() + "\t" + tool.getNumber());
                    }
                } catch (IOException e) {
                    System.out.println("File Error.");
                }
                break;
  
        }
   }

    /**
     * @author npetersen
     * Purpose: Display or print to a file the list of the provisions that the player has
     */
    public void listProvisions() {
        int inputValue = keyboard.nextInt();
        ArrayList<ListItem> provisions = game.getProvisions();
        System.out.println("\nDo you want to view the provisions list or print the provisions list?\nEnter 1 to view the list\nEnter 2 to print the list to a file");
        switch(inputValue) {
            case 1: // Display the tools list on the screen
                System.out.println("\nCity of Aaron Provisions in the Storehouse");
                for (ListItem provision : provisions) {
                    System.out.println(provision.getName() + "\t" + provision.getNumber());
                }
                break;
            case 2: // Print the tools list to a file
                try (PrintWriter out = new PrintWriter("provisions.txt")) {
                    out.println("\nCity of Aaron Provisions in the Storehouse");
                    for (ListItem provision : provisions) {
                        out.println(provision.getName() + "\t" + provision.getNumber());
                    }
                    System.out.println("The provisions list was saved to the file: provisions.txt");
                } catch (IOException e) {
                    System.out.println("File Error.");
                }
                break;
                
        }
        
    }
    
    /**
     * Purpose: List the team members that created this application
     */
    public void listTeam() {
        System.out.println("Display the team members here");
    }

   
}

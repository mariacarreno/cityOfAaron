/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import cityofaaron.CityOfAaron;
import java.util.Scanner;
import model.*;
import control.*;
/**
 *
 * @author Usuario
 */
public class ListMenuView {
     private String listMenu = "\n" +
            "*********************************\n" +
            "** CITY OF AARON: IN-LIST MENU **\n" +
            "*********************************\n" +
            " 1 - List the animals in the storehouse\n" +
            " 2 - List the tools in the storehouse\n" +
            " 3 - List the provisions in the storehouse\n" +
            " 4 - List the Developers\n" +
            " 5 - Return to the Main menu\n";
    private final int MAX = 5;
    private Scanner keyboard = new Scanner(System.in);
    private Game game = CityOfAaron.getGame();
    public ListMenuView () {
        
    }
    
    /**
     * Purpose: Display the menuView
     */
    public void displayMenuView() {
        int menuOption = 0;
       
        do {
            System.out.println(listMenu);
            menuOption = getMenuOption();
            doAction(menuOption);            
        } while (menuOption != MAX);
    }

    /**
     * Purpose: To collect user input
     * @return User selected menu option as int
     */
    public int getMenuOption() {
        int userInput = 0;
        // Loop to check for proper input from the user
        do {
            userInput = keyboard.nextInt();
            if (userInput < 0 || userInput > MAX)
            {
                System.out.println("Error, please enter an option 1 to 5\n");
            }
        } while (userInput < 0 || userInput > MAX);
        return userInput;
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
        System.out.println("Display a list of animals here");
    }
    
    /**
     * Purpose: Display the list of tools that the player has
     */
    public void listTools() {
        System.out.println("Display a list of tools here");
    }

    /**
     * Purpose: Display the list the provisions that the player has
*/
    public void listProvisions() {
        System.out.println("Display a list of provisions here");
    }
    
    /**
     * Purpose: List the team members that created this application
     */
    public void listTeam() {
        System.out.println("Display the team members here");
    }
}

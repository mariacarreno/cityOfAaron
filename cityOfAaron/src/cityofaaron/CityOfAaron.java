/*
 * The main()class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */

package cityofaaron;

// Start imports for CropData test experiment
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
// End imports for CropData test experiment
import model.*;

/**
 *
 * @author Usuario, npetersen
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* 
         * Create an instance of your Player class. 
         * Using its setName() method, store a person’s 
         * name in the instance of your Player class 
         */
        Player player1 = new Player();
        player1.setName("Test Player");
        
        /* 
         * Create an instance of your Game class. 
         * Using its setPlayer() method, save a 
         * reference to your player object in the 
         * game object 
         */
        Game game1 = new Game();
        game1.setPlayer(player1);
        
        /* 
         * Get a reference to the Player object from the game 
         * object, and use its getName() method to display it 
         */
        System.out.println(game1.getPlayer().getName());
        
        /* 
         * Get one of the objects in your TeamMember enum and call its getName() 
         * and getDescription() methods to retrieve the name and description for 
         * that team member and display them on the console 
         */
        System.out.println(TeamMember.TEAMMEMBER1.getName());
        System.out.println(TeamMember.TEAMMEMBER1.getTitle());
        
        /*
         * Location call test María
         */
        Location mylocation = new Location();
        mylocation.setDescription("My Location");       
        mylocation.setSymbol("*"); 
        
        System.out.println(mylocation.getDescription());
        System.out.println(mylocation.getSymbol());
        
        /*
         * ListItem test
         */
        ListItem item1 = new ListItem();
        item1.setName("Test this is an item");       
        item1.setNumber(34); 
        
        System.out.println(item1.getName());
        System.out.println(item1.getNumber());
        
        /* 
         * CropData test. This test uses Reflection to introspect the CropData class and 
         * loop through and print out each variable's name and value in the class.
         * I did this as an experiment so that I didn't have to write a print statement
         * for each getter method in the CropData class.
         * see: https://stackoverflow.com/questions/3217603/how-to-print-values-of-an-object-in-java-when-you-do-not-have-the-source-code-for
         */
        CropData testCropData = new CropData();
        
        testCropData.setAcresOwned(2);
        testCropData.setAcresPlanted(2);
        testCropData.setCropYield(5);
        testCropData.setHarvest(10);
        testCropData.setNewPeople(3);
        testCropData.setNumberWhoDied(6);
        testCropData.setPopulation(1000);
        testCropData.setWheatForFood(11);
        testCropData.setWheatInStore(10);
        testCropData.setYear(2018);
        
        for (Field field : testCropData.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                String name = field.getName();
                Object value = field.get(testCropData);
                System.out.printf("%s: %s%n", name, value);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(CityOfAaron.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}

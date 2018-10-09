/*
 * The TeamMember enum file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */

package model;

/**
 *
 * @author npetersen
 */

public enum TeamMember {
    
    TeamMember1("Maria Carreno", "Developer 1"),
    TeamMember2("Nate Petersen", "Developer 2"),
    TeamMember3("Rhett McDermott", "Developer 3");
        
    private String name;
    private String title;
        
    TeamMember(String _name, String _title) {
        this.name = _name;
        this.title = _title;
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

}
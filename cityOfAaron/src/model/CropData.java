/*
 *The CropData class file for the cityOfAaron project
 * CIT 260
 * Spring 2018
 * Team members: Nate Petersen, Rhett McDermott, María Carreño.
 */

package model;

/**
 *
 * @author npetersen
 */

public class CropData {
    
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int offering;
    private int offeringBushels;
    private int newPeople;
    private int harvest;
    private int wheatForFood;
    private int acresPlanted;

    public CropData() {
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int _year) {
        this.year = _year;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int _population) {
        this.population = _population;
    }

    public int getAcresOwned() {
        return this.acresOwned;
    }

    public void setAcresOwned(int _acresOwned) {
        this.acresOwned = _acresOwned;
    }

    public int getCropYield() {
        return this.cropYield;
    }

    public void setCropYield(int _cropYield) {
        this.cropYield = _cropYield;
    }

    public int getWheatInStore() {
        return this.wheatInStore;
    }

    public void setWheatInStore(int _wheatInStore) {
        this.wheatInStore = _wheatInStore;
    }

    public int getNumberWhoDied() {
        return this.numberWhoDied;
    }

    public void setNumberWhoDied(int _numberWhoDied) {
        this.numberWhoDied = _numberWhoDied;
    }
    
    public int getOffering() {
        return offering;
    }

    public void setOffering(int offering) {
        this.offering = offering;
    }

    public int getOfferingBushels() {
        return offeringBushels;
    }

    public void setOfferingBushels(int offeringBushels) {
        this.offeringBushels = offeringBushels;
    }

    public int getNewPeople() {
        return this.newPeople;
    }

    public void setNewPeople(int _newPeople) {
        this.newPeople = _newPeople;
    }

    public int getHarvest() {
        return this.harvest;
    }

    public void setHarvest(int _harvest) {
        this.harvest = _harvest;
    }

    public int getWheatForFood() {
        return this.wheatForFood;
    }

    public void setWheatForFood(int _wheatForFood) {
        this.wheatForFood = _wheatForFood;
    }

    public int getAcresPlanted() {
        return this.acresPlanted;
    }

    public void setAcresPlanted(int _acresPlanted) {
        this.acresPlanted = _acresPlanted;
    }
    
    
}

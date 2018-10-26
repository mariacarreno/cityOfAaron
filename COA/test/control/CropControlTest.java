/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of calcLandCost method, of class CropControl.
     */
    @Test
    public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 0;
        int result = CropControl.calcLandCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 5;
        int acresToSell = -1;
        CropData cropData = null;
        int expResult = -1;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of buyLand method, of class CropControl.
     * Test Case 1
     */
    @Test
    public void testBuyLand1() {
        System.out.println("buyLand - Test Case 1");
        int landPrice = 20;
        int acresToBuy = 1;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(40);
        int expResult = 20;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test Case 2
     */
    @Test
    public void testBuyLand2() {
        System.out.println("buyLand - Test Case 2");
        int landPrice = 20;
        int acresToBuy = -10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(40);
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test Case 3
     */
    @Test
    public void testBuyLand3() {
        System.out.println("buyLand - Test Case 3");
        int landPrice = 20;
        int acresToBuy = 5;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(40);
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test Case 4
     */
    @Test
    public void testBuyLand4() {
        System.out.println("buyLand - Test Case 4");
        int landPrice = 20;
        int acresToBuy = 2;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(40);
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     * Test Case 5
     */
    @Test
    public void testBuyLand5() {
        System.out.println("buyLand - Test Case 5");
        int landPrice = 20;
        int acresToBuy = 0;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(40);
        int expResult = 40;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int SeetAsideWheat = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.feedPeople(SeetAsideWheat, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    
    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 1
     */
    @Test
    public void plantCrops1() {
        System.out.println("plantCrops - Test Case 1");
        int planted = 20;
        int population = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(20);
        int wheat = cropData.getWheatInStore();
        int expResult = 10;
        int result = CropControl.plantCrops(planted, wheat, population, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }    
    
    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 2
     */
    @Test
    public void plantCrops2() {
        System.out.println("plantCrops - Test Case 2");
        int planted = -10;
        int population = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(20);
        int wheat = cropData.getWheatInStore();
        int expResult = -1;
        int result = CropControl.plantCrops(planted, wheat, population, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }     

    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 3
     */
    @Test
    public void plantCrops3() {
        System.out.println("plantCrops - Test Case 3");
        int planted = 200;
        int population = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(20);
        int wheat = cropData.getWheatInStore();
        int expResult = -1;
        int result = CropControl.plantCrops(planted, wheat, population, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }        
    
    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 4
     */
    @Test
    public void plantCrops4() {
        System.out.println("plantCrops - Test Case 4");
        int planted = 40;
        int population = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(20);
        int wheat = cropData.getWheatInStore();
        int expResult = 0;
        int result = CropControl.plantCrops(planted, wheat, population, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }            

    /**
     * Test of plantCrops method, of class CropControl.
     * Test Case 5
     */
    @Test
    public void plantCrops5() {
        System.out.println("plantCrops - Test Case 5");
        int planted = 0;
        int population = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(100);
        cropData.setWheatInStore(20);
        int wheat = cropData.getWheatInStore();
        int expResult = 20;
        int result = CropControl.plantCrops(planted, wheat, population, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }         
    
}

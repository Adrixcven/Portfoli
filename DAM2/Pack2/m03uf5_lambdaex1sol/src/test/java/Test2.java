
import Entities.Vehicle;
import java.util.zip.DataFormatException;
import junit.framework.Assert;
import org.junit.Test;
import utils.Predicats;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manel
 */
public class Test2 {
   
    
    @Test
    public void Test_Predicats() {
        
        // Predicats
        try {
            //historic
            Assert.assertTrue(Predicats.getPredicat(0).test(new Vehicle("1234BTD",1990,120)));
            Assert.assertFalse(Predicats.getPredicat(0).test(new Vehicle("1234BTD",2010,120))); 
            
            //ECO
            Assert.assertTrue(Predicats.getPredicat(1).test(new Vehicle("1234BTD",2010,99))); 
            Assert.assertFalse(Predicats.getPredicat(1).test(new Vehicle("1234BTD",2010,220))); 
            
            //electric
            Assert.assertTrue(Predicats.getPredicat(2).test(new Vehicle("1234BTD",2010,0)));
            Assert.assertFalse(Predicats.getPredicat(2).test(new Vehicle("1234BTD",2010,100))); 
            
        } catch (DataFormatException ex) {
              Assert.fail();
        }
    }
}

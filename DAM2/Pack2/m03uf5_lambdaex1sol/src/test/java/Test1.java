
import Entities.Vehicle;
import java.util.zip.DataFormatException;
import junit.framework.Assert;
import org.junit.Test;


/**
 * @author manel
 */
public class Test1 {
    
    @Test
    public void Matricules_Incorrectes() {

        try {
            // test regles de negoci Vehicle
            Vehicle v1 = new Vehicle("BTD1234",2000,120);
            Assert.fail();
        } catch (DataFormatException ex) {
            Assert.assertTrue(true);
        }
        
        try {
            // test regles de negoci Vehicle
            Vehicle v2 = new Vehicle("BTDF234",2000,120);
            Assert.fail();
            
        } catch (DataFormatException ex) {
            Assert.assertTrue(true);
        }
        
        try {
            // test regles de negoci Vehicle
            
            Vehicle v3 = new Vehicle(".1124BTD",2000,120);
            Assert.fail();
            
        } catch (DataFormatException ex) {
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void Emisions_Incorrectes() {
        
         try {
            // test regles de negoci Vehicle
            Vehicle v1 = new Vehicle("BTD1234",2000,-1);
            Assert.fail();
        } catch (DataFormatException ex) {
            Assert.assertTrue(true);
        }
    }
    
    
    @Test
    public void Dates_Incorrectes() {
         try {
            // test regles de negoci Vehicle
            Vehicle v1 = new Vehicle("BTD1234",1989,120);
            Assert.fail();
        } catch (DataFormatException ex) {
            Assert.assertTrue(true);
        }
         
        try {
            // test regles de negoci Vehicle
            Vehicle v1 = new Vehicle("BTD1234",2031,120);
            Assert.fail();
        } catch (DataFormatException ex) {
            Assert.assertTrue(true);
        }
        
    }
    
     @Test
    public void Vehicles_correctes() {
         try {
            // test regles de negoci Vehicle
            Vehicle v1 = new Vehicle("1234BTD",1990,120);
            Assert.assertTrue(true);
        } catch (DataFormatException ex) {
             Assert.fail();
        }
         
        try {
            // test regles de negoci Vehicle
            Vehicle v1 = new Vehicle("1234BTD",2030,120);
            Assert.assertTrue(true);
        } catch (DataFormatException ex) {
            Assert.fail();
        }
        
    }
    
}

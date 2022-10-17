/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M03UF5;
import java.util.Comparator;
/**
 *
 * @author Adrix
 */
public class ComparadorVelocitat implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle a1, Vehicle a2) {
        int ret = 0;
        
        if (a1.getVelMax() == a2.getVelMax()) ret = 0; 
                else if (a1.getVelMax() < a2.getVelMax()) ret = 1;
                    else if (a1.getVelMax() > a2.getVelMax()) ret = -1;
        
        return ret;
    }
}

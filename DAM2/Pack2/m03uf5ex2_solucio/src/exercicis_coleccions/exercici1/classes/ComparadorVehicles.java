/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis_coleccions.exercici1.classes;

import java.util.Comparator;

/**
 * Compara un vehicle en funció de la seva velocitat
 * 
 * @author manel
 * Compares this object with the specified object for order. Returns a negative integer, 
 * zero, or a positive integer as this object is less than, equal to, 
 * or greater than the specified object.
 */
public class ComparadorVehicles implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
    
        int ret = 0;
        
        if (o1.getVelocitat() > o2.getVelocitat())
            ret = 1;
        
        if (o1.getVelocitat() < o2.getVelocitat())
            ret = -1;
        
      return ret;
    }
}

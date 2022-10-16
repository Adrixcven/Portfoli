/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Entities.Vehicle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.function.Predicate;

/**
 *
 * @author manel
 */
public class Predicats {
    
    public static Predicate getPredicat(Integer n)
    {
        Predicate<Vehicle> p1 = (vehicle) -> (Calendar.getInstance().get(Calendar.YEAR) - vehicle.getAny()) > 30;
        Predicate<Vehicle> p2 = (vehicle) -> vehicle.getEmissionsCO2() < 100;
        Predicate<Vehicle> p3 = (vehicle) -> vehicle.getEmissionsCO2() == 0;
        
        ArrayList<Predicate> predicats = new ArrayList<>(Arrays.asList(p1,p2,p3));
        
        return predicats.get(n);
    }
}

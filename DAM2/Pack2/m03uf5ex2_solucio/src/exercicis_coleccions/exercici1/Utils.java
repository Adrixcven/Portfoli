/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis_coleccions.exercici1;

import exercicis_coleccions.exercici1.classes.Vehicle;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author manel
 */
public class Utils {
    
    /***
     * Mostra per consola tota la llista de vehicles.
     * 
     * La classe ArrayList és fàcilment accessible. 
     * 
     * Es pot fer de 3 maneres:
     * - Directament per posició igual que un array de tipus primitiu
     * - Amb el mètode forEach i una expressió lambda
     * - Amb un Iterador (totes les coleccions han de ser iterables)
     * 
     * @param vehicles 
     */
    public static void mostraVehiclesPerPosicio(ArrayList<Vehicle> vehicles)
    {
        // per posició
        for (int i = 0; i< vehicles.size(); i++)
            System.out.println("Posicio: " + i + " " + vehicles.get(i).toString());
    }
    
    public static void mostraVehiclesForeach(ArrayList<Vehicle> vehicles)
    {
        // amb foreach
        vehicles.forEach( v -> System.out.println(v) );
    }
    
    public static void mostraVehiclesIterador(ArrayList<Vehicle> vehicles)
    {
        // amb Iterador
        Iterator<Vehicle> iterador = vehicles.iterator();
        while (iterador.hasNext())
        {
            System.out.println(iterador.next().toString());
        }
    }
    
    public static void separador(String text)
    {
        System.out.println("");
        System.out.println(" ==== " + text + "====");
        System.out.println("");
    }
    
}

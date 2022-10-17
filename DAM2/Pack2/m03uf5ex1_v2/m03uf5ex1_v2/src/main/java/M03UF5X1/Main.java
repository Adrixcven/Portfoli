/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M03UF5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Adrix
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> Vehicle = new ArrayList<>();
    
        Vehicle.add(new Cotxe("9345DFG", 120, 4));
        Vehicle.add(new Cotxe("2233ADG", 140, 4));
        Vehicle.add(new Vaixell("DF-345-TY", 80, 0));
        Vehicle.add(new Vaixell("L-001-EK", 100, 3));
        Vehicle.add(new Avio("X-9008789", 300, 2));
        Vehicle.add(new Avio("A-9008789", 430, 2));
        
        //Todos los elementos desordenados
        Vehicle.forEach(a -> System.out.println(a));
        //solo el primer elemento
        System.out.println("El primer elemento es " + Vehicle.get(0));
        //Ordenar por velocidad maxima
        System.out.println("Ordenació per Velocitat Maxima:");
        Vehicle.sort(new ComparadorVelocitat());
        Vehicle.forEach(a -> System.out.println(a));
        //eliminar segunda posicion
        Vehicle.remove(1);
        //mostrar segunda posicion
        System.out.println("El segundo elemento es " + Vehicle.get(1));
    }
    public static void ComparadorVehicles(ArrayList <Vehicle> Vehicle){
        
    }
}

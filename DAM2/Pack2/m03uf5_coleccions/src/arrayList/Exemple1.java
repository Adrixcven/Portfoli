/*
 * Classe que defineix un ArrayList on podem guardar qualsevol tipus d'element
 */
package arrayList;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Manel 
 */
public class Exemple1 {
    
    public static void main(String[] args) {
        
        // Definim un ArrayList d'objectes de tipus Avio
        ArrayList<Avio> avions = new ArrayList<>();
        
        // Afegim els elements
        avions.add(new Avio("A001D", "F23", 1, 2254));
        avions.add(new Avio("A023T", "Airbus A380", 350, 233));
        avions.add(new Avio("A323H", "Boeing 737", 150, 11));
        avions.add(new Avio("C454X", "Cessna", 4, 5004));
        avions.add(new Avio("F344A", "Airbus A320", 150, 12905));
        
        //si intentem afegir un element no permès, ens doa un error en temps de compilació
        // avions.add("Hola mundo!!");

        
        System.out.println("Ordenació per Matricula:");
        // Amb el mètode sort i passant la col.lecció i el comparador, ens la ordena
        Collections.sort(avions, new ComparadorAvionsPerMatricula());
        // recorrem la col.lecció amb un foreach (expressió lambda)
        avions.forEach(a -> System.out.println(a));
        
        System.out.println("Ordenació per Model:");
        Collections.sort(avions, new ComparadorAvionsPerModel());
        avions.forEach(a -> System.out.println(a));
        
        System.out.println("Ordenació per Hores Vol:");
        Collections.sort(avions, new ComparadorAvionsPerHoresVol());
        avions.forEach(a -> System.out.println(a));
        
    }
    
    
}

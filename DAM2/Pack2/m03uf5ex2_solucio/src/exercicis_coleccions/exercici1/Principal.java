package exercicis_coleccions.exercici1;

import exercicis_coleccions.exercici1.classes.Avio;
import exercicis_coleccions.exercici1.classes.ComparadorVehicles;
import exercicis_coleccions.exercici1.classes.Cotxe;
import exercicis_coleccions.exercici1.classes.Vaixell;
import exercicis_coleccions.exercici1.classes.Vehicle;
import java.util.ArrayList;
import java.util.Collections;

/***
 * Darrera rev 9/22
 * @author manel
 */
public class Principal {

    public static void main(String[] args) {
        
        
        Utils.separador("Creem llista de vehicles");
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Utilitzant una variable
        Vehicle c1 = new Cotxe("9345DFG", 260, 4);
        vehicles.add(c1);
        Vehicle c2 = new Cotxe("2233ADG", 260, 4);
        vehicles.add(c2);

        Vaixell v1 = new Vaixell("DF-345-TY", 90, 2);
        vehicles.add(v1);
        vehicles.add(new Vaixell("L-001-EK", 400, 0));

        // Utilitzant el constructor directament
        vehicles.add(new Avio("X-9008789", 600, 2));
        vehicles.add(new Avio("A-9008789", 400, 4));
       
        Utils.separador("Mostrem llista sense ordenar:");
        Utils.mostraVehiclesPerPosicio(vehicles);
        
        Utils.separador("Vehicle de posició 0: " + vehicles.get(0));

        Utils.separador("Ordenem usant un comparador específic:");
        //ho podem ordenar amb dos linies de codi equivalents:
        vehicles.sort(new ComparadorVehicles());
        Collections.sort(vehicles, new ComparadorVehicles());
        
        Utils.separador("Mostrem ordenats ");
        Utils.mostraVehiclesPerPosicio(vehicles);
        
        Utils.separador("Vehicle de posició 0: " + vehicles.get(0));
        
        Utils.separador("Eliminem vehicle segona posició");
        vehicles.remove(1);
        
        Utils.separador("Vehicle de posició 1: " + vehicles.get(1));
    }
}

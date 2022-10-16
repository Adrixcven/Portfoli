/***
 * Herència a les excepcions:
 * 
 * En aquest exemple creem excepcions personalitzades que deriven 
 * de la classe Exception per codificar els possibles errors que es volen controlar.
 * Amb aquestes noves categories d'excepcions podem informar a l'usuari amb total 
 * exactitud del problema en funció del tipus d'error
 * 
 */
package uf5.excepcions;

import excepcions.DniFormatException;
import excepcions.DniLletraExcepcion;
import excepcions.DniNullException;
import excepcions.NotesNullException;
import excepcions.QuantitatDeNotesException;
import excepcions.ValorsForaDeRangException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Excepcio08 {
    
    public static void main (String args[]) {
        
        
            
        try {
            Scanner scan = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Dni: ");
            String cmdDni = scan.nextLine();  // Read user input

            System.out.println("Notes (separades per espais): ");
            String cmdNotes = scan.nextLine();  // Read user input

            // llista de notes on desarem les notes entrades per l'usuari
            // "var" ens estalvia definir el tipus de variable i s'inicialitza
            // directament al tipus de retorn del mètode split.
            var llistaNotesString = cmdNotes.split(" ");
            
            List<Integer> llistaNotesInt = new ArrayList<>();

            // convertim notes a enters
            for (String nota : llistaNotesString) {
                llistaNotesInt.add(Integer.parseInt(nota));
            }
            
            // intentem inicialitzar l'objecte
            Alumne a1 = new Alumne(cmdDni, llistaNotesInt);
            
            System.out.println("S'ha creat correctament l'alumne: " + a1);
            
        } catch (DniNullException ex) {
            
            System.out.println("El Dni no pot ser NULL");
            
        } catch (DniFormatException ex) {
            
            System.out.println("El Dni té un format incorrecte");
            
        } catch (DniLletraExcepcion ex) {
            
            System.out.println("La lletra del DNI no correspn amb la part numèrica. Revisar digits,");
            
        } catch (NotesNullException ex) {
            
            System.out.println("S'ha d'informar de les notes");
            
        } catch (ValorsForaDeRangException ex) {
            
            System.out.println("Notes negatives o superiors a 10 no permeses" + ". Hi-ha "+ex.getNumValorsIncorrectes() + " valors incorrectes.");
            
        } catch (QuantitatDeNotesException ex) {
            
            System.out.println("Hi ha menys de 10 notes o més de 20 notes");
        
        } catch (Exception ex) {
            
            System.out.println("Alguna cosa ha passat..." + ex.toString());
            
        }
    }
}

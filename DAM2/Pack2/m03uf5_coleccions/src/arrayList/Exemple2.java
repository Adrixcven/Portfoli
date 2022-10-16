/*
 * Aquesta classe representa una llista de noms manejada amb la classe ArrayList.
 */
package arrayList;

/**
 *
 * @author fta
 * Darrera rev. 10/2020
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Classe que modela una llista de noms
public class Exemple2 {

    /* Els tipus de les col.leccions sempre han de ser classes (objectes),
     * mai poden ser dades primitives.*/
    private ArrayList<String> llistaDeNoms; //ArrayList que conte objectes Strings

    //Constructor: crea una llista de noms buida
    public Exemple2() {
        llistaDeNoms = new ArrayList(); //Instanciem l'objecte de tipus ArrayList
    }

    //Retorna el llistat de noms
    public ArrayList getLlistaDeNoms() {
        return llistaDeNoms;
    }

    //Retorna el total de noms del llistat
    public int getTotalElements() {
        //size() retorna el nombre d'elements del llistat
        return llistaDeNoms.size();
    }

    //Afegim un nom (element de l'ArrayList) al final de la llista ampliant la seva grandaria
    public void addNom(String pNom) {
        llistaDeNoms.add(pNom);
    }

    //Afegim un nom en una posició determinada de la llista. S'afegeix un nou element,
    //desplaçant els demés una posició a la dreta a partir de la posició passada com a paràmetre.
    public void addNomPosicio(int posicio, String pNom) {
        if (posicio >= 0 && posicio < this.getTotalElements()) {
            llistaDeNoms.add(posicio, pNom);
        } else {
            System.out.println("No existeix la posició introduida.");
        }
    }

    //Llegim un nom de la llista segons la seva posició
    public String getNom(int posicio) {
        if (posicio >= 0 && posicio < this.getTotalElements()) {
            //get(posicio) retorna l'element del llistat que ocupa la posició posicio
            return llistaDeNoms.get(posicio);
        } else {
            return "No existeix la posició solicitada";
        }
    }
    
    //Modifiquem un nom de la llista segons la seva posició
    public String setNom(int posicio, String nouNom) {
        if (posicio >= 0 && posicio < this.getTotalElements()) {
            //set(posicio, valor) modifica el contingut de la posició passada com a paràmetre.
            //amb el nou contingut pasat com a segon paràmetre
            return llistaDeNoms.set(posicio, nouNom);
        } else {
            return "No existeix la posició solicitada";
        }
    }

    //Elimina un nom del llistat (element de l'ArrayList) desplaçant els demés una 
    //posició a l'esquerra a partir de la posició passada com a paràmetre.
    public void removeNom(int posicio) { //Método
        if (posicio >= 0 && posicio < this.getTotalElements()) {
            //remove(posicio) l'element de la llista que ocupa la posició posicio
            llistaDeNoms.remove(posicio);
        }
    }

    //Mostra el contingut de la llista de noms
    public void imprimirNoms() {
        int comptador = 0; //Comptador de noms
        for (String element : llistaDeNoms) { //For extés
            comptador++;
            System.out.println("Element: " + element);
        }
        
        System.out.println("Total elements: " + comptador);
    }

    //Busquem en el llistat un nom en concret
    public void buscarNom(String pNom) {

        /* Un objecte iterator fa un recorregut sobre una copia de la col.lecció
         * a recorrer.
         * Iterator és una interficie genèrica.
         * Qualsevol col.lecció té el mètode iterator() què ens retorna un Iterator
         * de la col.lecció, en concret, ens retorna un objecte de tipus Iterator
         * amb una còpia de la col·lecció.
         * hasNext, retorna true si hi ha més elements en la col.lecció
         * next, retorna el següent objecte contingut en la col.lecció*/
        
        //Instanciem un objecte it de tipus iterator
        Iterator<String> it = llistaDeNoms.iterator();
        String elementActual;
        int trobat = 0; //Semàfor per controlar si s'ha trobat el nom o no

        //Comprovem si l'objecte actual no és l'últim de la col.leció mitjançant el mètode hasNext.
        while (it.hasNext() && trobat == 0) {
            //referenciem al següent element de la llista mitjançant el mètode next()
            elementActual = it.next();
            System.out.println("L'element actual és: " + elementActual);
            if (elementActual.contains(pNom)) {
                System.out.println(pNom + " trobat!!!");
                trobat = 1;
            }
        }

        if (trobat == 0) { //Nom no trobat
            System.out.println(pNom + " no és de la col.lecció!!!");
        }
    }

    //Executem principal
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in); //Lector teclat
        
        Exemple2 novaLlista = new Exemple2(); //Creem llista noms

        //Iniciem lectura de dades i construcció del llistat
        System.out.println("Iniciem el programa");
        System.out.println("Introdueix nom 1:");
        String nom = lector.nextLine(); //Llegim nom 1
        novaLlista.addNom(nom); //Afegim nom 1 a llistat
        System.out.println("Introdueix nom 2:");
        nom = lector.nextLine(); //Llegim nom 2
        novaLlista.addNom(nom); //Afegim nom 2 a llistat
        System.out.println("Introdueix nom 3:");
        nom = lector.nextLine(); //Llegim nom 3
        novaLlista.addNom(nom); //Afegim nom 3 a llistat
        System.out.println("Gràcies.");

        System.out.println("La llista està formada per " + novaLlista.getTotalElements() + " elements");
        System.out.println("Element 1: " + novaLlista.getNom(0));
        System.out.println("Element 2: " + novaLlista.getNom(1));
        System.out.println("Element 3: " + novaLlista.getNom(2));

        System.out.println("Introdueix nom 4:");
        nom = lector.nextLine(); //Llegim nom 4
        novaLlista.addNomPosicio(1, nom); //Afegim nom 4 a la posició 2
        System.out.println("Afegit la posició 1 (les col.leccions comencen a la posició zero)");

        //Mostrem el contingut de la llista amb un for normal
        System.out.println("La llista està formada per " + novaLlista.getTotalElements() + " noms");
        for (int i = 0; i < novaLlista.getTotalElements(); i++) {
            System.out.println("Posició " + i + ": " + novaLlista.getNom(i));
        }

        //Imprimi tots els noms per pantalla
        System.out.println("Mostrem tots els noms amb un for extes");
        novaLlista.imprimirNoms();
        
        //Eliminem el nom que ocupa la posició 2
        novaLlista.removeNom(2);
        //Imprimi tots els noms per pantalla
        System.out.println("Mostrem tots els noms un cop eliminat el de la segona posició");
        novaLlista.imprimirNoms();

        //Busquem nom
        System.out.println("Introdueix un nom per cercar en el llistat:");
        nom = lector.nextLine(); //Llegim nom a cercar
        novaLlista.buscarNom(nom);
    }
}

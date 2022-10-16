/***
 * Retropropagació d'excepcions:
 * 
 * Exemple de propagació de l’excepció cap al mètode superior. En aquest cas, abans 
 * d’arribar al main(), es troba un mètode que captura l’excepció.
 */

package uf5.excepcions;

public class Excepcio05 {
    //Mètode executat pel mètode metode02
    public static void metode03() {
        //Declarem el vector
        String vector[]={"Hola","Adéu","Fins demà"};
        for (int i=0; i<=vector.length; i++){
            System.out.println("Posició " + i + " : " + vector[i]);
        }
        //Mai s'executarà
        System.out.println("El mètode metode03 s'ha acabat.");
    }
    
    //Mètode executat pel mètode metode01 
    public static void metode02() {
        System.out.println("Entrem en el mètode metode02 i anem a executar metode03");
        metode03();
        //Mai s'executarà perquè està dins del tray després de produir-se l'excepció
        System.out.println("Tornem a estar en metode02 després de finalitzar metode03");
    }

    //Mètode que executarà el mètode metode02
    public static void metode01() {
        //Captura d'excepció de sobrepassament de límit d'un array
        try {
            System.out.println("Entrem en el mètode metode01 i anem a executar metode02");
            metode02();  //Execució de metode02, on es pot produir l'excepció
            //Mai s'executarà
            System.out.println("Tornem a estar en metode01 després de finalitzar metode02");
        } catch (ArrayIndexOutOfBoundsException e) { //Si s'ha llançat l'excepció...
            //... executem el següent bloc de codi  
            System.out.println("Estem dins el bloc catch que ha capturat l'excepció.");
            System.out.println("Informació que dona el mètode getMessage():");
            System.out.println(e.getMessage()); //Executem mètode getMessage()
            //Executem mètode getMessage()
            System.out.println("Informació que dona el mètode printtStackTrace():");
            //Executem el mètode printStackTrace
            System.out.println("Informació que dona el mètode toString():");
            System.out.println(e);  //Mostrem l'error
        }
    }
 
    public static void main(String args[]) {
        System.out.println("Iniciem el programa i anem a executar metode01");
        metode01(); //execució de metode01, on es troba la capturà d'excepció
        
        //Es mostrarà el missatge perquè abans s'ha capturat l'excepció
        System.out.println("Tornem a estar en el main després de finalitzar metode01");
    }
}

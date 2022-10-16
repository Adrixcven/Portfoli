/***
 * Retropropagació d'excepcions:
 * 
 * Mostra un exemple de retropropagació de l’excepció cap al mètode superior sense 
 * cap tipus de tractament, de manera que la propagació arriba al mètode inicial main().
 */

package uf5.excepcions;

public class Excepcio04 {
    
    //Mètode estàtic utilitzat pel metode01
    public static void metode02() {
        //Declarem vector
        String vector[]={"Hola","Adéu","Fins demà"};
        for (int i=0; i<=vector.length; i++){
            System.out.println("Posició " + i + " : " + vector[i]);
        }
        
        //Aquest missatge no es mostrarà perquè abans s'ha produït l'excepció
            System.out.println("El mètode metode02 s'ha acabat.");
    }
 
    //Mètode estàtic que utilitza el metode02
    public static void metode01() {
        System.out.println("Entrem en el mètode metode01 i anem a executar metode02");
        
        metode02(); //Execució del metode02
        //Aquest missatge no es mostrarà perquè abans s'ha produït l'excepció
        System.out.println("Tornem a estar en metode02 després de finalitzar metode02");
    }
 
    public static void main(String args[]) {
        System.out.println("Iniciem el programa i anem a executar metode01");
        metode01();  //Execució metode01
        
        //Aquest missatge no es mostrarà perquè abans s'ha produït l'excepció
        System.out.println("Tornem a estar en el main després de finalitzar el metode01");
    } 
}

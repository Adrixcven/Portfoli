/***
 * Excepcio mal capturara i clausula "finally":
 * 
 * Programa que captura l'error produit en Excepcio01.java. amb un intent de captura
 * que falla perquè l’excepció que es vol capturar no és adient per a l’excepció que es produeix.
 * Incorpora un bloc finally per demostrar que el codi introduït en aquest bloc semnpre s’executa en qualsevol cas. 
 */

package uf5.excepcions;

public class Excepcio03 {
    public static void main(String args[]) {
        //Declarem el vector
        String vector[]={"Hola","Adéu","Fins demà"};
        
        //Iniciem captura
        try {
            //bloc de codi susceptible de llançar una excepció (produir un error)
            System.out.println("Abans d'executar el for");
            for (int i=0; i<=vector.length; i++){
                System.out.println("Posició " + i + " : " + vector[i]);
            }            
            //Mai es mostrarà aquest missatge perquè es produirà l'error que probocarà
            //que sortim del bloc de codi.
            System.out.println("Després d'executar el for");
            
        //Si s'ha llançat l'excepció StringIndexOutOfBoundsException (s'han sobrepassat
        //els límits del string)...
        } catch (StringIndexOutOfBoundsException e) {
            //... s'executa el següent bloc de codi
            System.out.println("El programador estava a la lluna... S'ha sortir de límits!!!");
        
        // aquest bloc de codi sempre s'executa, tant si es captura l'excepció com si no es captura
        }finally {
            System.out.println("Aquest codi s'executa en tots els casos, tan si es captura l'excepció com si no");
        }
        
        // aquest bloc de codi no s'executa perquè l'execució ha finalitzat de forma no prevista al no haver capturat correctament l'excepció
        System.out.println("Final del programa");
    }
}
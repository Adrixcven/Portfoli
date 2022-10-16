/***
 * Tractament bàsic d'excepcions:
 * 
 *Exemple que captura l'error produit en Excepcio01.java. mitjançant l'estructura try/catch.
 *Aquest tipus d'errors no s'acostumen a capturar i s'han d'evitar codificant correctament.
 *
 * try and catch = tractar de capturar
 *
 * Aquesta captura ens permet continuar amb el programa avisan't de l'error, sense
 * finalitzar-lo de manera repentina.
 */

package uf5.excepcions;

public class Excepcio02 {
    public static void main(String args[]) {
        //Declarem el vector
        String vector[]={"Hola","Adéu","Fins demà"};
        
        /*Llancem l'excepció de manera automàtica en el bloc try, si es produeix*/
        try {
            //bloc de codi susceptible de llançar una excepció
            System.out.println("Abans d'executar el for");
            for (int i=0; i<=vector.length; i++){
                System.out.println("Posició " + i + " : " + vector[i]);
            }            
            //Mai es mostrarà aquest missatge perquè es produirà l'excepció que provocarà
            //que sortim del bloc de codi.
            System.out.println("Després d'executar el for");

         /*capturem excepció en el bloc catch*/

        // Si s'ha llançat l'excepció ArrayIndexOutOfBoundsException (s'han sobrepassat
        // els límits de l'array), es passa per paràmetre del catch l'excepció produida
        // i si coincideix amb el tipus definit com a paràmetre, què en el nostre cas és que sí, llavors es captura al catch
        // en cas contrari, l'excepció l'excepció no es captura i la gestiona el propi entorn d'execució (JRE) finalitzant 
        // el flux d'execució de forma immediata (veure exemple 3)
        } catch (ArrayIndexOutOfBoundsException e) { //
            //... s'executa el següent bloc de codi
            System.out.println("El programador estava a la lluna... S'ha sortir de límits!!!");
        }
        
        //Aquest missatge si es mostrarà perquè hem capturat l'excepció i per tant
        //es continua amb l'execució normal del programa després del bloc tray-catch
        System.out.println("Final del programa");
    }
}

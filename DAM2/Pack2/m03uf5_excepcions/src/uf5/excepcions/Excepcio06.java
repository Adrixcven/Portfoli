/***
 * 
 * Llençament d'una excepció:
 * 
 * Calsse que conté un mètode que avalua si una taula pTaula té n cel·les, provocant,
 * en cas de ser avaluada com a fals, una excepció d'obligada gestió: Exception.
 * Aquesta excepció no es pot generar automàticament, l'hem de crear nosaltres mitjançant
 * el constructor de la classe Exception i llançar-la mitjançant la paraula reservada
 * throw
 */

package uf5.excepcions;

public class Excepcio06 {
    //Mètode per avaluar la quantitat de cel.les d'una taula
    public static void verificaQuantitatCelles (int nCelles, String pTaula[]) throws Exception {
        
        if (pTaula.length!=nCelles){
            /*Exception e=new Exception("La quantitat de cel.les no és la indicada.");
             *throw e;*/
            //Llancem l'excepció amb el nostre missatge
            throw new Exception ("La quantitat de cel.les no és la indicada.");
        }

        System.out.println ("Sortida de verificaQuantitatCelles.");
    }
 
    public static void main (String args[]) {
        try {
            //Correcte
            System.out.println("Punt 1.");
            verificaQuantitatCelles (4, new String[4]);
            //Diferent quantitat de cel.les
            System.out.println("Punt 2.");
            verificaQuantitatCelles (2, new String[4]);
            //No es mostrarà perquè ja s'ha produit l'excepció
            System.out.println("Punt 3.");
        } catch (Exception e) {
            //printStackTrace() escriu la línia de text d'error d'Exception, però a 
            //més ens diu exactament en quina línia de codi es produeix l'error
            e.printStackTrace();
        }
            System.out.println ("Programa finalitzat.");
        }
    }

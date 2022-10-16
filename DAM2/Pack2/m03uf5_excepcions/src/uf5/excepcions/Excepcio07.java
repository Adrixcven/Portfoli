/***
 * Rellançament d'una excepció:
 * 
 * Mètode que avalua si la taula pTaula té n cel·les, provocant, en cas de ser 
 * avaluada com a fals, una excepció RuntimeException, de no obligada gestió
 */
package uf5.excepcions;

public class Excepcio07 {
    //Mètode per verificar nombre de cel.les
    public static void verificaQuantitatCelles (int nCelles, String pTaula[]) {
        if (pTaula.length!=nCelles){
            /*throw new RuntimeException ("La quantitat de cel.les no és la indicada.");*/
            
            //Llancem excepció RuntimeException
            throw new RuntimeException("La quantitat de cel.les no és la indicada.");
        }
        System.out.println ("Sortida de verificaLengthTaula.");
    }
 
    public static void main (String args[]) {
        //Correcte
        System.out.println("Punt 1.");
        verificaQuantitatCelles (4, new String[4]);
        //Diferent quantitat de cel.les
        System.out.println("Punt 2.");
        verificaQuantitatCelles (2, new String[4]);
        //No es mostrarà perquè ja s'ha produit l'error
        System.out.println("Punt 3.");
    }
}

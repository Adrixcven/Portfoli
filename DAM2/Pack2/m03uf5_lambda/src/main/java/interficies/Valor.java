/*
 * Interface funcional amb un únic mètode abstracte que retorna un double. A més
 * també inclou el mètode públic toString de la classe Object. Finalment inclou 
 * un mètode per defecte que imprimeix l'enter passat per paràmetre.
 *
 * Les interfaces funcionals, han de definir un sol mètode abstracte, però tants 
 * mètodes abstractes públics de la classe Object com vulguem, ja que són mètodes 
 * implícits d'una interface. A part d'aixó, funcionen igual que qualsevol interface.
 */
package interficies;

/**
 * Una interfície funcional és aquella que disposa d’un mètode públic i abstracte únic
 * @author manel
 */
// anotació opcional
@FunctionalInterface
public interface Valor {
    
    /***
     * Retorna un double
     * @return 
     */
    public abstract double getValor();

    /***
     * Atès que no és public abstract, podem definir tants mètodes addicionals com vulguem
     * 
     * A partir de Java8, la paraula reservada "default" al mètode d'una interfície
     * defineix que aquest incorpora una implementació per defecte
     * 
     * @param numero 
     */
    public default void imprimirNumero(int numero) {
        System.out.println(numero);
    }    
   
}

/*
 * Interface funcional amb un únic mètode abstracte que no retorna res.
 */
package interficies;

/**
 * Una interfície funcional és aquella que disposa d’un mètode públic i abstracte únic
 * @author manel
 */
// anotació opcional
@FunctionalInterface
public interface RetornBuit {
    
    /***
     * Rep una cadena i no retorna res
     * @param cadena 
     */
    public abstract void imprimir(String cadena);
    
}

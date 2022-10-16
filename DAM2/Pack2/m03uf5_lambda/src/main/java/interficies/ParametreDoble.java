package interficies;

/***
 * Una interfície funcional és aquella que disposa d’un mètode públic i abstracte únic
 * @author manel
 */

// anotació opcional
@FunctionalInterface
public interface ParametreDoble {
    
    /***
     * Rep dos doubles i retirna un double
     * @param valor1
     * @param valor2
     * @return 
     */
    public abstract double operacioDosOperands(double valor1, double valor2);
    
}

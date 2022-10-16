package interficies;

/**
 * Una interfície funcional és aquella que disposa d’un mètode públic i abstracte únic
 * @author manel
 */
// anotació opcional
@FunctionalInterface
public interface Generica<T> {
    
    /***
     * Rep dos valors de tipus genèric (per nant, de qualsevol tipus) i retorna un boolea
     * @param valor1
     * @param valor2
     * @return 
     */
    public abstract boolean es(T valor1, T valor2);
    
}

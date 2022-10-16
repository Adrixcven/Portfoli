package varis;

import interficies.ParametreDoble;

/**
 * Exemple de classe que implementa una interfície que li permet
 * realitzar una determinada operació.
 *
 * @author manel
 */
public class Sumar implements ParametreDoble{

    /***
     * Suma els dos operands
     * @param valor1
     * @param valor2
     * @return 
     */
    @Override
    public double operacioDosOperands(double valor1, double valor2) {
        
        return valor1+valor2;
        
    }
    
}

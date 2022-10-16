package varis;

import interficies.ParametreDoble;

/**
 * Exemple de classe que implementa una interfície que li permet
 * realitzar una determinada operació. En aquest cas, sumar dos valors.
 *
 * @author manel
 */
public class Potencia implements ParametreDoble{

    /***
     * Eleva valor1 a la potencia valor2
     * @param valor1
     * @param valor2
     * @return 
     */
    @Override
    public double operacioDosOperands(double valor1, double valor2) {
        
        return Math.pow(valor2, valor2);
    }
}

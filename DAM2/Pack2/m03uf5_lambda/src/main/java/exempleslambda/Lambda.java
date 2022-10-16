/*
 * 
 */
package exempleslambda;

import interficies.Generica; 
import interficies.ParametreDoble;
import interficies.Parametre;
import interficies.RetornBuit;
import interficies.Valor;
import varis.Multiplicar;
import varis.Potencia;
import varis.Sumar;

/***
 * Classe amb varis exemples d'expressions Lambda, utilitzant interfícies funcionals
 * predefinides 
 * @author manel
 */
public class Lambda {

    public static void main(String args[]) {       
        
        // variable d'àmbit local
        Integer valor = 7;
        
        /*EXPRESSIÓ LAMBDA SENSE PARAMETRES*/
        
        // L'expressió lambda en aquest cas no reb paràmetres i retorna un double.
        // La implementacuió del mètode getValor() és senzillament el retorn 
        // d'un valor constant
        Valor nouValor1 = () -> {
            Double ret = 98.0;
            return ret;
        };
        
        // També es pot simplificar:
        Valor nouValor2 = () -> 99.0;
        
        
        // També podem utilitzar variables de l'ambit local, però no les podem alterar
        Valor nouValor3 = () -> valor;

        // nouValor1 = () -> "three"; // Error! Tipus incompatible amb el tipus de nouValor
        // nouValor1 = (n) -> 68.5; // Error! No admet cap paràmetre 
        // Valor nouValor1 = () -> valor++; //ERROR! No podem alterar variables d'ambit extern a l'expressió lambda
        System.out.println("nouValor1: " + nouValor1.getValor());
        System.out.println("nouValor2: " + nouValor2.getValor());
        System.out.println("nouValor3: " + nouValor3.getValor());
        
        /*EXPRESSIÓ LAMBDA AMB UN PARÀMETRE*/
        
        // L'expressió lambda en aquest cas un paràmetre de tipus Int i un retorn de tipus Double
        Parametre elevatASet = (n) -> {
            Double ret;
            
            ret = Math.pow(n,7);
            
            return ret;
        };
        
        // també podem simplificar les operacions
        Parametre dividitEntreTretze = (n) -> n/13.0;
        
        // nouParametre = () -> 68.5; // Error! cal un paràmetre
        // Cridem getValor(int pValor). 
        System.out.println("4^7= " + elevatASet.getValor(4));
        System.out.println("8/13=" + dividitEntreTretze.getValor(8));

        
        /*EXPRESSIÓ LAMBDA AMB MÉS D'UN PARÀMETRE*/
        ParametreDoble operacio;
        
        //implementem un sumador mitjançant expressió lambda
        operacio = (valor1, valor2) -> valor1 + valor2;
        // usem la interfície funcional per sumar
        System.out.println("La suma de 5 i 9 és: " + operacio.operacioDosOperands(5.0, 9.0));
        System.out.println("La suma de 8 i 10 és: " + operacio.operacioDosOperands(8.0, 10.0));
        
        //implementem un multiplicador mitjançant expressió lambda
        operacio = (valor1, valor2) -> valor1 * valor2;
        // usem la interfície funcional per sumar
        System.out.println("La multiplicació de 5 i 9 és: " + operacio.operacioDosOperands(5.0, 9.0));
        System.out.println("La multiplicació de 8 i 10 és: " + operacio.operacioDosOperands(8.0, 10.0));
        
        //implementem potenciar mitjançant expressió lambda
        operacio = (valor1, valor2) -> Math.pow(valor1, valor2);
        // usem la interfície funcional per sumar
        System.out.println("5 elevat a 9 és: " + operacio.operacioDosOperands(5.0, 9.0));
        System.out.println("8 elevat a 10 és: " + operacio.operacioDosOperands(8.0, 10.0));
        
        // La segona opció sense éxpressió lambda és utilitzar la instància d'una classe
        // que implementi la interfície funcional:
        Sumar s = new Sumar();
        System.out.println("La suma de 5 i 9 és: " + s.operacioDosOperands(5.0, 9.0));
        
        Multiplicar m = new Multiplicar();
        System.out.println("La suma de 5 i 9 és: " + m.operacioDosOperands(5.0, 9.0));
        
        Potencia p = new Potencia();
        System.out.println("8 elevat a 10 és: " + p.operacioDosOperands(5.0, 9.0));
        
        /*EXPRESSIÓ LAMBDA SENSE RETORN*/
        
        //En aquest cas senzillament imprimim per consola el que ens passen com a paràmetre
        RetornBuit nouRetornBuit = (cadena)-> System.out.println(cadena);

        // Cridem imprimir(String cadena).
        nouRetornBuit.imprimir("\nSóc una cadena");
                
        
        /*EXPRESSIONS LAMBDA D'UNA INTERFACE GENÈRICA*/
        
        //En aquest cas el cos de l'expressió lambda comprova si el valor passat com
        //a primer paràmetre és igual que el valor passat com a segon paràmetre.
        Generica novaGenerica= (valor1, valor2) -> valor1.equals(valor2);
        
        //Cridem a boolean es(T valor1, T valor2) per enters
        if(novaGenerica.es(2, 3)){
            System.out.println("Són iguals");
        }else{
            System.out.println("No són iguals");
        }
        
        //Cridem a boolean es(T valor1, T valor2) per dubles
        if(novaGenerica.es(2.0, 3.0)){
            System.out.println("Són iguals");
        }else{
            System.out.println("No són iguals");
        }
        
        //Cridem a boolean es(T valor1, T valor2) per caràcters
        if(novaGenerica.es('a', 'a')){
            System.out.println("Són iguals");
        }else{
            System.out.println("No són iguals");
        }
    }

}

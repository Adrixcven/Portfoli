 /*
 * Classe que defineix un cunjunt d'alumnes. Per cada alumne codi (clau) i edat (valor)
 */
package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author fta
 */
public class Alumnes {
    HashMap<String,Integer> conjuntAlumnes;
    
    //Constructor per crear un conjunt d'alumnes buit
    public Alumnes(){
        conjuntAlumnes=new HashMap<>( );
    }
    
    //Total d'alumnes
    public int totalAlumnes() {
        //size() retorna el nombre d'elements del HashMap
        return conjuntAlumnes.size(); 
    }
    
    //Inserim un alumne en el conjunt d'alumnes
    public void putAlumne(String dni,Integer edat){
        if(!conjuntAlumnes.containsKey(dni)){ //Si no existeix la clau...
            //put(clau,valor) afegeix un nou element al HashMap amb clau=dni perquè no existeix
            conjuntAlumnes.put(dni,edat);
        }else{
            System.out.println("El dni introduit ja existeix.");
        }
    }
       
    //Llegim l'edat d'un alumne determinat
    //Integer per poder retornar null, ja què una dada primitiva no pot ser null, però un objecte si.
    public Integer getEdat(String dni) { 
        if (conjuntAlumnes.containsKey(dni)) {
            //get(clau) retorna el valor associat a la clau
            return conjuntAlumnes.get(dni); 
        }else{
            return null;
        }
    }
    
    //Modifiquem l'edat d'un alumne determinat per l'edat passada com a paràmetre
    //Integer per poder retornar null, ja què una dada primitiva no pot ser null, però un objecte si.
    public void setEdat(String dni, int novaEdat) { 
        if (conjuntAlumnes.containsKey(dni)) { //Si existeix l'edat...
            //put(clau,valor) modifica el valor associat a la clau perquè existeix
            conjuntAlumnes.put(dni,novaEdat); 
        }else{
            System.out.println("L'alumne no existeix!!!");
        }
    }
    
    //Elimina un alumne del conjut d'alumnes
    public void removeAlumne(String dni) {
        if (conjuntAlumnes.containsKey(dni)) {
            //remove(posicio) l'element de la llista que ocupa la posició posicio
            conjuntAlumnes.remove(dni); 
        }
    }
    
    //Imprimim les edats dels alumnes
    public void imprimirEdats(){
        //KeySet() retorna un conjunt amb les claus del HashMap passant a ser una 
        //col.lecció ietrable        
        Set dnis = conjuntAlumnes.keySet(); //Conjunt dels dnis dels alumnes
        //Creem un iterador per recorre els alumnes
        Iterator<String> dni = dnis.iterator();
       
        while(dni.hasNext()){ //Mentres el dni no sigui l'últim...
            String alumneActual=dni.next();
            System.out.println("L'edat de l'alumne amb DNI "+alumneActual+ " és "+getEdat(alumneActual)); 
        }        
        
    }
    
    //Executem principal
    public static void main (String [ ] args) {
        
        Alumnes smix=new Alumnes(); //Nou conjunt d'alumnes
        
        //Inserim alumnes
        smix.putAlumne("00000000",1);
        smix.putAlumne("00000001",2);
        smix.putAlumne("00000002",3);
        smix.putAlumne("00000003",4);
        smix.putAlumne("00000004",1);
        smix.putAlumne("00000005",1);
        
        System.out.println("ALUMNES COPÈRNIC");
        
        System.out.println("El total d'alumnes de SMIX és: "+smix.totalAlumnes());
        
        //Imprimim les edats dels alumnes
        smix.imprimirEdats();
              
        //Eliminem l'alumne amb DNI 00000003
        smix.removeAlumne("00000003");
        
        System.out.println("Ara el total d'alumnes de SMIX és: "+smix.totalAlumnes());
        
        //Imprimim les edats dels alumnes
        smix.imprimirEdats();
        
        //Afegim un nou alumne que ja existeix.
        smix.putAlumne("00000005",5);
        
        //Afegim un nou alumne que no existeix.
        smix.putAlumne("00000007",2);
        
        //Modifiquem l'edat de l'alumne 000000001
        smix.setEdat("00000001",4);
        
        System.out.println("Ara el total d'alumnes de SMIX és: "+smix.totalAlumnes());
        
        //Imprimim les edats dels alumnes
        smix.imprimirEdats();
    }
}

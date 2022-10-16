/*
 * Aquesta classe representa una col.lecció de noms d'alumnes d'un curs determinat,
 * guardats en un HashMap.
 */

package hashMap;

/**
 *
 * @author fta
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import arrayList.Exemple2;


public class LlistatNomsAlumnat {
    HashMap<Curs,Exemple2> noms;
    
    //Constructor per crear un directori d'alumnes buit
    public LlistatNomsAlumnat(){
        noms=new HashMap<>( );
    }
    
    //Total de cursoso guardats en el directori
    public int getTotalCursos() {
        //size() retorna el nombre d'elements del HashMap
        return noms.size(); 
    }
    
    //Insertem un curs amb el nom dels seus alumnes en el directori
    public void putCurs(Curs curs,Exemple2 alumnes){
        if(!noms.containsKey(curs)){ //Si existeix la clau
            noms.put(curs,alumnes);
        }else{
            System.out.println("El curs introduit ja existeix.");
        }
    }
    
    //Llegim els noms d'un curs determinat
    public Exemple2 getNoms(Curs curs) {
        if (noms.containsKey(curs)) {
            //get(clau) retorna el valor associat a la clau
            return noms.get(curs); 
        }else{
            return null;
        }
    }
    
    //Elimina un curs del directori
    public void removeCurs(Curs curs) { //Método
        if (noms.containsKey(curs)) {
            //remove(posicio) l'element de la llista que ocupa la posició posicio
            noms.remove(curs); 
        }
    }
    
    //Imprimim els noms dels cursoso
    public void imprimirNoms(){
        //KeySet() retorna un conjunt amb les claus del HashMap passant a ser una 
        //col.lecció ietrable        
        Set cursos = noms.keySet(); //Conjunt dels cursos del directori
        //Creem un iterador per recorre els cursoso
        Iterator<Curs> curs = cursos.iterator();
        
        System.out.println("ALUMNES COPÈRNIC");
        while(curs.hasNext()){
            Curs cursActual=curs.next();
            System.out.println(cursActual + ": "); 
            getNoms(cursActual).imprimirNoms();
        }        
        
    }
    
      
    //Executem principal
    public static void main (String [ ] args) {
        //Definim llistatNomsAlumnat
        LlistatNomsAlumnat alumnatCopernic=new LlistatNomsAlumnat();
        
        //Definim cursos
        Curs smix1A=new Curs("SMIX-1A","1");
        Curs smix1B=new Curs("SMIX-1B","2");
        Curs smix2A=new Curs("SMIX-2A","3");
        
        //Definim Llistat d'alumnes
        Exemple2 alumnesSmix1A=new Exemple2();
        Exemple2 alumnesSmix1B=new Exemple2();
        Exemple2 alumnesSmix2A=new Exemple2();
        
        //Afegim alumnes als llistats d'alumnes
        alumnesSmix1A.addNom("Pepito");
        alumnesSmix1A.addNom("Anna");
        alumnesSmix1A.addNom("Julia");
        alumnesSmix1B.addNom("Issac");
        alumnesSmix1B.addNom("Alberto");
        alumnesSmix2A.addNom("Pau");
        
        //Afegim els cursoso juntament amb el seus llistat d'alumnes al llistat de noms d'alumnes
        alumnatCopernic.putCurs(smix1A,alumnesSmix1A);
        alumnatCopernic.putCurs(smix1B,alumnesSmix1B);
        alumnatCopernic.putCurs(smix2A,alumnesSmix2A);
            
        //Imprimim alumnat
        alumnatCopernic.imprimirNoms();
        
        //Eliminem el grup de 1r de SMIX A
        alumnatCopernic.removeCurs(smix1A);
        
        //Tornem a imprimir l'alumnat
        alumnatCopernic.imprimirNoms();
    }
}

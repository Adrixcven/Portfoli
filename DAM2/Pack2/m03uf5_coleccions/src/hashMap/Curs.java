/*
 * Aquesta classe representa una curs d'alumnes identificat pel seu nom i la seva aula
 */

package hashMap;

/**
 *
 * @author fta
 */
public class Curs {
    private String nom;
    private String aula;
    
    public Curs(String pNom, String pAula){
        nom=pNom;
        aula=pAula;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String pNom){
        nom=pNom;
    }
    
    public String getAula(){
        return aula;
    }
    
    public void setAula(String pAula){
        aula=pAula;
    }
    
    public String toString(){
        return "Nom: "+nom+" - Aula: "+aula+"\n";
    }
}

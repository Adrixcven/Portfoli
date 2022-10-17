package exercicis_coleccions.exercici1.classes;

import java.util.Objects;

/***
 * Classe d'entitat abstracta que modela un vehicle genèric 
 * 
 * Una classe abstracta no es pot instanciar (no puc fer "new") 
 * Normalment s'utilitzen per modelar superclasses (classes genèriques)
 * 
 * Aquesta classe implementa la interfície Comparable, que defineix que 
 * un objecte vehicle pot ser comparat amb un altre objecte vehicle i determinar si és igual, 
 * menor o mejor. Això es fa mitjançant el mètode CompareTo.
 * 
 *
 * @author manel
 */
public abstract class Vehicle implements Comparable{

    // els atributs d'una classe d'entitat SEMPRE han de ser privats
    private String matricula;
    private int velocitat;

    // mètodes accessors (gettes i setters)
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Vehicle other = (Vehicle) obj;
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString(){
            return "Nom: "+matricula+" Velocitat: "+velocitat;
    }
    
    /***
     * Compares this object with the specified object for order. 
     * Returns a negative integer, zero, or a positive integer as 
     * this object is less than, equal to, or greater than the specified object.
     * (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html)
     * 
     * @param t
     * @return 
     */
    @Override
    public int compareTo(Object t) {
        // retornem directament la comparació entre Strings (matricula)
        return this.matricula.compareTo(((Vehicle)t).getMatricula());
    }
}

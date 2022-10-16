/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;

/**
 *
 * @author manel
 */
public class Avio {
    
    private String matricula;
    private String Model;
    private int capacitat;
    private int horesVol; 

    public Avio(String matricula, String Model, int capacitat, int horesVol) {
        this.matricula = matricula;
        this.Model = Model;
        this.capacitat = capacitat;
        this.horesVol = horesVol;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public int getHoresVol() {
        return horesVol;
    }

    public void setHoresVol(int horesVol) {
        this.horesVol = horesVol;
    }
    
     @Override
    public String toString() {
        return "Avio{" + "matricula=" + matricula + ", Model=" + Model + ", capacitat=" + capacitat + ", horesVol=" + horesVol + '}';
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M03UF5;

/**
 *
 * @author Adrix
 */
public class Vaixell extends Vehicle{
    private int veles;

    public Vaixell(String Matricula, int VelMax, int veles) {
        super(Matricula, VelMax);
        this.veles = veles;
    }

    public int getVeles() {
        return veles;
    }

    public void setVeles(int veles) {
        this.veles = veles;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getVelMax() {
        return VelMax;
    }

    public void setVelMax(int VelMax) {
        this.VelMax = VelMax;
    }

    @Override
    public String toString() {
        return "Esto es un Vaixell con matricula=" + Matricula + " Velocidad Maxima=" + VelMax + " veles=" + veles + '}';
    }
    
    
}

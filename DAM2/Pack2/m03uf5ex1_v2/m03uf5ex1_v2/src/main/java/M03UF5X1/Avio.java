/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M03UF5;

/**
 *
 * @author Adrix
 */
public class Avio extends Vehicle{
    private int ales;

    public Avio(String Matricula, int VelMax, int ales) {
        super(Matricula, VelMax);
        this.ales = ales;
    }

    public int getAles() {
        return ales;
    }

    public void setAles(int ales) {
        this.ales = ales;
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
        return "Esto es un Avion con matricula=" + Matricula + " Velocidad Maxima=" + VelMax + " ales=" + ales + '}';
    }
    
    
    
}

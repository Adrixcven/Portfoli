/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M03UF5;

/**
 *
 * @author Adrix
 */
public class Cotxe extends Vehicle{
    private int ruedas;

    public Cotxe(String Matricula, int VelMax, int ruedas) {
        super(Matricula, VelMax);
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
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

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

   

    @Override
    public String toString() {
        return "Esto es un Cotxe con matricula=" + Matricula + " Velocidad Maxima=" + VelMax + " ruedas=" + ruedas + '}';
    }
    
    
}

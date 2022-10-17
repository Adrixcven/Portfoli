/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package M03UF5;

import java.util.Objects;

/**
 *
 * @author Adrix
 */
public class Vehicle {
    protected String Matricula;
    protected int VelMax;

    public Vehicle(String Matricula, int VelMax) {
        this.Matricula = Matricula;
        this.VelMax = VelMax;
    }

    public String getMatricula() {
        return Matricula;
    }

    public int getVelMax() {
        return VelMax;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setVelMax(int VelMax) {
        this.VelMax = VelMax;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
        return Objects.equals(this.Matricula, other.Matricula);
    }

    
    @Override
    public String toString() {
        return "Vehicle{" + "Matricula=" + Matricula + ", VelMax=" + VelMax + '}';
    }
    
    
    
    
}

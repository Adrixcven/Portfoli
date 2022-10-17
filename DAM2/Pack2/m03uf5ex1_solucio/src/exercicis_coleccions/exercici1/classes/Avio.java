package exercicis_coleccions.exercici1.classes;

public class Avio extends Vehicle {

    private int ales;

    public Avio(String pNom, int pVelocitat, int pAles) {
        super.setMatricula(pNom);
        super.setVelocitat(pVelocitat);
        ales = pAles;
    }

    @Override
    public String toString() {
        return super.toString() + " Ales: " + ales;
    }

   
}

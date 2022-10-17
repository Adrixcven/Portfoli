package exercicis_coleccions.exercici1.classes;

public class Cotxe extends Vehicle {

    private int rodes;

    public Cotxe(String pNom, int pVelocitat, int pRodes) {
        super.setMatricula(pNom);
        super.setVelocitat(pVelocitat);
        rodes = pRodes;
    }

    @Override
    public String toString() {
        return super.toString() + " Rodes: " + rodes;
    }

   
}

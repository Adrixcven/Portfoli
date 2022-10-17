package exercicis_coleccions.exercici1.classes;

public class Vaixell extends Vehicle {
	
	private int veles;
	
	public Vaixell(String pNom, int pVelocitat, int pVeles){
		super.setMatricula(pNom);
		super.setVelocitat(pVelocitat);
		veles = pVeles;
	}
	
        @Override
	public String toString(){
		return super.toString() +" Veles: "+veles;
	}

   
	
}

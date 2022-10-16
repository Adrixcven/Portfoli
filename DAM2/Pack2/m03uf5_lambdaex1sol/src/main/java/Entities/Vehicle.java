package Entities;

import java.util.zip.DataFormatException;

/***
 * Comportament:
* Si la matrícula del vehicle no està en el format correcte de matrícula Espanyola a partir de l’any 2000 s’ha de generar una excepció de tipus DataFormatException
* Si l’any de fabricació no és entre l’any 2000 i l’any 2030 s’ha de generar una excepció de tipus DataFormatException
* Si els grams de CO2 són negatius s’ha de generar una excepció de tipus DataFormatException
 * @author manel
 */
public class Vehicle {
	
    private final Integer minAny = 1990;
    private final Integer maxAny = 2030;
    
    String matricula;
    Integer any;
    Integer emissionsCO2;

    public Vehicle(String matricula, Integer any, Integer emissionsCO2) throws DataFormatException {
        
        this.matricula = matricula;
        this.any = any;
        this.emissionsCO2 = emissionsCO2;
        
        this.validaDades();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws DataFormatException {
        this.matricula = matricula;
        this.validaDades();
    }

    public Integer getAny() {
        return any;
    }

    public void setAny(Integer any) throws DataFormatException {
        this.any = any;
        this.validaDades();
    }

    public Integer getEmissionsCO2() {
        return emissionsCO2;
    }

    public void setEmissionsCO2(Integer emissionsCO2) throws DataFormatException {
        this.emissionsCO2 = emissionsCO2;
        this.validaDades();
    }
    
    /**
     * Valida el format de matricula Espanya
     * @param m matricula
     * @return
     * @throws DataFormatException 
     */
    private boolean validaMatricula(String m)
    {
        return m.matches("^[0-9]{1,4}(?!.*(LL|CH))[BCDFGHJKLMNPRSTVWXYZ]{3}");
    }
    
    /***
     * Validació centralitzada de dades
     * @throws DataFormatException 
     */
    private void validaDades() throws DataFormatException
    {
         if (!validaMatricula(matricula))
            throw new DataFormatException("Format de matricula incorrecte: " + this.matricula);
        
        if (any < minAny || any > maxAny)
            throw new DataFormatException("Any ha d'estar entre " + minAny + " i " + maxAny);
        
        if (emissionsCO2 < 0)
            throw new DataFormatException("Emissions negatives no permeses");
    }

    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", any=" + any + ", emissionsCO2=" + emissionsCO2 + '}';
    }

   
	
}

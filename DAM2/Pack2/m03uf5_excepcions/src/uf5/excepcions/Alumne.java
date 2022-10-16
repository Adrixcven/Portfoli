/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.excepcions;

import excepcions.DniFormatException;
import excepcions.DniLletraExcepcion;
import excepcions.DniNullException;
import excepcions.NotesNullException;
import excepcions.QuantitatDeNotesException;
import excepcions.ValorsForaDeRangException;
import java.util.List;


/**
 *
 * @author manel
 */
class Alumne
{
    String dni;
    List<Integer> notes;

    /***
     * Constructor
     * @param dni: Ha d'estar ben format (8 nombres + lletra correcta)
     * @param notes: Cada nota ha de ser positiva i entre 1 i 10. 
     * L'alumne ha de tenir entre 10 i 20 notes
     */
    public Alumne(String dni, List<Integer> notes) throws DniNullException, DniFormatException, DniLletraExcepcion, NotesNullException, QuantitatDeNotesException, ValorsForaDeRangException {
        this.dni = dni;
        this.notes = notes;

        //verifiquem paràmetres d'entrada:

        //el dni no està informat
        if (dni == null)
            throw new DniNullException();

        //  el format del dni no és el correcte
        if (dni.length() != 9)
            throw new DniFormatException();

        //  la lletra del dni no és la correcta
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicio = Integer.parseInt(dni.substring(0, 7))%23;
        if (! lletres.substring(posicio-1, posicio).equals(dni.substring(8)))
            throw new DniLletraExcepcion();

        // la llista de notes és null
        if (notes == null)
            throw new NotesNullException();

        // la llista de notes excedeix del rang definit
        if (notes.size() < 10 || notes.size() > 20)
            throw new QuantitatDeNotesException();

        // la llista de notes conté valors incorrectes
        int valorsIncorrectes = 0;
        for (Integer nota : notes)
        {
            if (nota<0 || nota >10)
                valorsIncorrectes++;
        }

        // també podem fer que l'excepció "transporti" informació relativa a l'error
        if (valorsIncorrectes > 0)
            throw new ValorsForaDeRangException(valorsIncorrectes);

        // si no ha fallat res, inicialitzem l'objecte
        this.dni = dni;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Alumne{" + "dni=" + dni + " notes= " + notes + '}';
    }

   


   

  


   



}

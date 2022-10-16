/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcions;


   /***
    * Una o més notes conténen valors negatius o estan fora de rang
    * També obtenim el num de valors incorrectes
    */
   public class ValorsForaDeRangException extends NotesExcepcion
   {
       int numValorsIncorrectes;

       public ValorsForaDeRangException(int n) {
           this.numValorsIncorrectes = n;
       }

       public int getNumValorsIncorrectes() {
            return numValorsIncorrectes;
       }
   }

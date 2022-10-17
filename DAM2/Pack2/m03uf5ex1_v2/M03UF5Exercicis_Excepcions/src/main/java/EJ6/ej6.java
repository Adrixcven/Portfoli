
package EJ6;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ej6 {
    public static void main(String args[]){
        try{
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> Vehicle = new ArrayList<>();
            int num = 0;
            System.out.println("Dame de 2 a 10 numeros en una misma linea separados por espacios");
            String numerosjuntos = in.nextLine();
            for (int i = 0; i < numerosjuntos.length(); i++) {
                int carac = numerosjuntos.charAt(i);
                if(carac == '-'||carac == '_'){
                   throw new Excepcion_("Error en el valor", "Hay un - o un _");
               }
            }
            String[] parts = numerosjuntos.split(" ");
            if (parts.length < 2|| parts.length>10) {
                throw new ExcepcionMayInf("Error en la cantidad", "numero mas o menos numeros");
            }
            for (int i = 0; i < parts.length; i++) {
                num = Integer.parseInt(parts[i]);
                Vehicle.add(num);
            }
            int cantidad = Vehicle.size();
            for (int i = 0; i < cantidad; i++) {
                int ej = Vehicle.get(i);
                int solucion = ej*ej;
                System.out.println(ej + " por " + ej  +" = " + solucion);
            }
        }catch(ExcepcionMayInf ex){
            System.out.println("Hay mas o menos numeros en el string");
        }
        catch(Excepcion_ ex){
            System.out.println("Hay un - o un _");
        }
    }
}

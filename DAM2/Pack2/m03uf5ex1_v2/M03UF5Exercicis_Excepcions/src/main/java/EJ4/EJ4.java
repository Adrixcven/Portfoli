/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Adrix
 */
public class EJ4 {
    
    public static void main(String args[]) {
        boolean acaba=false;
        Scanner in = new Scanner(System.in);
        while(!acaba){
            try{
                System.out.println("Dame numero 1 ");
                int num1= in.nextInt();
                System.out.println("Dame numero 2");
                int num2 = in.nextInt();
                int result = Division(num1, num2);
                System.out.println("El resultado es " + result );
                acaba=true;
            }catch(NumberFormatException e){
                System.out.println("No has introducido un int, has introducido un alfanumerico o un vacio");
            }catch(InputMismatchException a){
                System.out.println("El divisor no es un entero");
            }catch(Excepcion0 a){
                System.out.println("El divisor es un 0");
            }
            in.nextLine();
        }
        System.out.println("Final del programa");
        
    }
    public static int Division(int num1, int num2)throws InputMismatchException, Excepcion0 {
        if(num2 == 0){
            throw new Excepcion0("Error en la division", "divisior 0");
        }else{
            int returna = num1%num2;
            return returna;
        }
    }
}

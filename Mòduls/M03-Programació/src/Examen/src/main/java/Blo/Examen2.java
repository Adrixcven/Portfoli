package Blo;

import java.util.HashSet;
import java.util.Scanner;


public class Examen2 {

    public static final int ESTACIONS = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        ClassExam[] estacio = new ClassExam[ESTACIONS];
        estacio[0] = new ClassExam("España", "2", 12, -10);
        estacio[1] = new ClassExam("Andorra", "4", 22, -10);
        estacio[2] = new ClassExam("Belgica", "5", 32, -10);
        estacio[3] = new ClassExam("Francia", "6", 22, -10);
        estacio[4] = new ClassExam("Japon", "7", 44, -10);
        estacio[5] = new ClassExam("Italia", "8", 77, -10);
        estacio[6] = new ClassExam("Jerusalem", "9", 2, -10);
        estacio[7] = new ClassExam("EEUU", "1", -2, -10);
        estacio[8] = new ClassExam("Alemania", "14", -22, -10);
        estacio[9] = new ClassExam("Mexico", "166", 44, -10);
        Ubicació(estacio);
        contar(estacio);
        info(estacio, in, in2);

    }

    public static void Ubicació(ClassExam[] estacio) {
        String PaisMax = estacio[0].getPais();
        String regioMax = estacio[0].getRegio();
        int temperaturaMax = estacio[0].getTemperatura();
        for (int i = 1; i < ESTACIONS; i++) {
            if (temperaturaMax < estacio[i].getTemperatura()) {
                PaisMax = estacio[i].getPais();
                regioMax = estacio[i].getRegio();
                temperaturaMax = estacio[i].getTemperatura();
            }
        }
        System.out.println("La temperatura mas alta la tienen el pais " + PaisMax + " en la region " + regioMax);
    }

    public static void contar(ClassExam[] estacio) {
        String nom = "", nom2 = "", nom3 = "", nom4 = "", nom5 = "", nom6 = "", nom7 = "", nom8 = "", nom9 = "", nom10 = "";
        int var1 = 0, var2 = 0, var3 = 0, var4 = 0, var5 = 0, var6 = 0, var7 = 0, var8 = 0, var9 = 0, var10 = 0;
        for (int i = 0; i < ESTACIONS; i++) {
            if (i == 0) {
                nom = estacio[i].getPais();
                var1++;
            } else if (estacio[i].getPais().equals(nom)) {
                var1++;
            } else {
                if (nom2.equals("")) {
                    nom2 = estacio[i].getPais();
                    var2++;
                } else if (nom2.equals(estacio[i].getPais())) {
                    var2++;
                } else {
                    if (nom3.equals("")) {
                        nom3 = estacio[i].getPais();
                        var3++;
                    } else if (nom3.equals(estacio[i].getPais())) {
                        var3++;
                    } else {
                        if (nom4.equals("")) {
                            nom4 = estacio[i].getPais();
                            var4++;
                        } else if (nom4.equals(estacio[i].getPais())) {
                            var4++;
                        } else {
                            if (nom5.equals("")) {
                                nom5 = estacio[i].getPais();
                                var5++;
                            } else if (nom5.equals(estacio[i].getPais())) {
                                var5++;
                            } else {
                                if (nom6.equals("")) {
                                    nom6 = estacio[i].getPais();
                                    var6++;
                                } else if (nom6.equals(estacio[i].getPais())) {
                                    var6++;
                                } else {
                                    if (nom7.equals("")) {
                                        nom7 = estacio[i].getPais();
                                        var7++;
                                    } else if (nom7.equals(estacio[i].getPais())) {
                                        var7++;
                                    } else {
                                        if (nom8.equals("")) {
                                            nom8 = estacio[i].getPais();
                                            var8++;
                                        } else if (nom8.equals(estacio[i].getPais())) {
                                            var8++;
                                        } else {
                                            if (nom9.equals("")) {
                                                nom9 = estacio[i].getPais();
                                                var9++;
                                            } else if (nom9.equals(estacio[i].getPais())) {
                                                var9++;
                                            } else {
                                                if (nom10.equals("")) {
                                                    nom10 = estacio[i].getPais();
                                                    var10++;
                                                } else if (nom10.equals(estacio[i].getPais())) {
                                                    var10++;
                                                } else {

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(nom + " tiene " + var1 + " estaciones");
        if(nom2.equals("")){
            
        }else{
            System.out.println(nom2 + " tiene " + var2 + " estaciones");
        }
        if(nom3.equals("")){
            
        }else{
            System.out.println(nom3 + " tiene " + var3 + " estaciones");
        }
        if(nom4.equals("")){
            
        }else{
            System.out.println(nom4 + " tiene " + var4 + " estaciones");
        }
        if(nom5.equals("")){
            
        }else{
            System.out.println(nom5 + " tiene " + var5 + " estaciones");
        }
        if(nom6.equals("")){
            
        }else{
            System.out.println(nom6 + " tiene " + var6 + " estaciones");
        }
        if(nom7.equals("")){
            
        }else{
            System.out.println(nom7 + " tiene " + var7 + " estaciones");
        }
        if(nom8.equals("")){
            
        }else{
            System.out.println(nom8 + " tiene " + var8 + " estaciones");
        }if(nom9.equals("")){
            
        }else{
            System.out.println(nom9 + " tiene " + var9 + " estaciones");
        }
        if(nom10.equals("")){
            
        }else{
            System.out.println(nom10 + " tiene " + var10 + " estaciones");
        }
        
        
        
    }

    public static void info(ClassExam[] estacio, Scanner in2, Scanner in) {
        System.out.println("Dame el pais");
        String pais = in2.nextLine();
        System.out.println("Dame la region");
        String regio = in2.nextLine();
        System.out.println("Dame la nueva temperatura");
        int temp = in.nextInt();
        System.out.println("Dame la nueva presion");
        float press = in2.nextFloat();
        for (int i = 0; i < ESTACIONS; i++) {
            if ((pais.equals(estacio[i].getPais())) & (regio.equals(estacio[i].getRegio()))) {
                System.out.println("Esta aqui!");
                estacio[i].setTemperatura(temp);
                estacio[i].setPressio(press);
                break;

            } else if (i == 9) {
                System.out.println("No esta");
            }
        }
    }
}

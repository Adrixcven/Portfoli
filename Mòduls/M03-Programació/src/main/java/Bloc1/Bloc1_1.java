package Bloc1;

import java.util.Scanner;

public class Bloc1_1 {

    public static final String USUARI = "victor";
    public static final String PASSWORD = "21_22";

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
        boolean ok = false;
        String user, pass;
        int intents = 0;

        while ((ok == false) && (intents < 3)) {
            System.out.println("Intro nom usuari");
            user = intro.nextLine();
            System.out.println("Intro contrasenya");
            pass = intro.nextLine();

            if (user.equals(USUARI) && pass.equals(PASSWORD)) {
                System.out.println("OK. Has entrat. Benvingut " + user);
                ok = true;
            } else {
                intents++;
                System.out.println("Hi ha algun error");
                System.out.println("Portes " + intents + " intents");
                if (intents == 3) {
                    System.out.println("No ho pots tornar a intentar. "
                            + "Contacta amb l'administradoir");
                }
            }
        }
    }
}

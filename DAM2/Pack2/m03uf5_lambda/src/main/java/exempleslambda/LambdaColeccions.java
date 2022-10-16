package exempleslambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 *
 * @author manel
 */
public class LambdaColeccions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         List<String> dnis = new ArrayList<>(Arrays.asList("38044133V",
                                                                "85083775J",
                                                                "22936827P",
                                                                "24160616J",
                                                                "53272037N",
                                                                "09018967T",
                                                                "44435352V",
                                                                "28204335X",
                                                                "56894385P",
                                                                "81326504E",
                                                                "76122521B",
                                                                "14296224E",
                                                                "45649062Y",
                                                                "68235160W",
                                                                "14175047B",
                                                                "34727137N",
                                                                "97606406H",
                                                                "58218379A",
                                                                "18919084C",
                                                                "95455815L",
                                                                "54908066M",
                                                                "30424378X",
                                                                "74623590M",
                                                                "02575791Z",
                                                                "06769717L",
                                                                "53797505J",
                                                                "09082864W",
                                                                "97180194S",
                                                                "91082730L",
                                                                "32012285B",
                                                                "25979641Z",
                                                                "95275835Z",
                                                                "10306287X",
                                                                "08790419A",
                                                                "75726075R",
                                                                "24435268E",
                                                                "08457706P",
                                                                "99013517N",
                                                                "53068173C",
                                                                "11131692Z",
                                                                "49321540H",
                                                                "59158201Q",
                                                                "56402661Z",
                                                                "16662993E",
                                                                "39393153H",
                                                                "28123978S",
                                                                "67059178X",
                                                                "86610783M",
                                                                "78308823X",
                                                                "76538939E"));
         
         
         
         System.out.println();
         System.out.println("Extraure els elements que comencin per '1' a una nova llista i mostrar aquesta per consola:");
         Predicate<String> p1 = (x -> x.startsWith("1"));
         List<String> extraccio1 = dnis.stream().filter(p1).collect(Collectors.toList());
         extraccio1.stream().forEach(x -> System.out.println(x));
         
         System.out.println();
         System.out.println("Fer l'anterior directament sobre la llista original i en una sola línia de codi:");
         dnis.stream().filter(dni -> dni.startsWith("1")).forEach(x -> System.out.println(x));
         
         System.out.println();
         System.out.println("Ordenar els elements per la seva lletra, implementant un comparador mitjançant lambda. Finalment, treure-ho per consola:");
         dnis.stream().sorted((s1, s2) -> s1.substring(s1.length() - 1).compareTo(s2.substring(s2.length() - 1))).forEach(x -> System.out.println(x));
         
         // Investiga:
         // Com faries per quedar-te de tota la llista, únicament aquells DNI que siguin correctes a nivell delletra i numeració?
         
    }
    
}

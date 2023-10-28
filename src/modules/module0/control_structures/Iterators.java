package modules.module0.control_structures;
import java.util.Scanner;

public class Iterators {
    public static void execDoWhileLoop() {
        int i = 1;
        System.out.println("Ejemplo de bucle do-while:");
        do {
            System.out.println("Iteración " + i);
            i++;
        } while (i <= 5);
    }

    public static void execWhileLoop() {
        int i = 1;
        System.out.println("Ejemplo de bucle while:");
        while (i <= 5) {
            System.out.println("Iteración " + i);
            i++;
        }
    }

    public static void execForLoop() {
        System.out.println("Ejemplo de bucle for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }
    }

}

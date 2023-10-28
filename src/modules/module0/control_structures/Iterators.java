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

    public static void execForEachLoop() {
        System.out.println("Ejemplo de bucle forEach:");
        Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9};
        for (Integer number : numbers) {
            System.out.println("Iterando los elementos de un array, encontré esto: " + number);
        }
    }

    public static void forEachCalendarioOctubre2023() {
        System.out.println("Calendario de Octubre 2023:");

        // Declaración y creación de un arreglo multidimensional para representar el calendario
        String[][] calendario = new String[5][7];

        // Llenar el calendario con los días del mes de octubre
        String[] diasOctubre = {
                "  ", " 1", " 2", " 3", " 4", " 5", " 6",
                " 7", " 8", " 9", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27",
                "28", "29", "30", "31", "  "
        };

        int dia = 0;

        // Llenar la cuadrícula del calendario con los días de octubre
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                if (dia < diasOctubre.length) {
                    calendario[fila][columna] = diasOctubre[dia];
                } else {
                    calendario[fila][columna] = "  "; // Espacios en blanco para días fuera de octubre
                }
                dia++;
            }
        }

        // Usar un bucle foreach para mostrar el calendario
        for (String[] semana : calendario) {
            for (String diaDelMes : semana) {
                System.out.print(diaDelMes + " ");
            }
            System.out.println(); // Nueva línea para separar las semanas
        }

    }

    public static void main(String[] args) {
        forEachCalendarioOctubre2023();
    }
};

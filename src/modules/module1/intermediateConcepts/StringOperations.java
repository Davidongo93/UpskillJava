package modules.module1.intermediateConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {

    public static void infoString(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa una cadena: ");
        String input = null;
        try {
            // Intentar leer la entrada como una cadena
            input = scanner.nextLine();

            // Imprimir la cadena ingresada
            System.out.println("Ingresaste: " + input);
        } catch (Exception e) {
            // Capturar la excepción en caso de que no sea una cadena
            System.out.println("Error: Debes ingresar una cadena de caracteres.");
        }

        // verify
        System.out.println("A continuacion algunos datos: ");
        //longitud de cadena.
        System.out.println("longitud de cadena: " + input.length());
        // deteccion de palabras
        System.out.println((input.indexOf("de")>0)?"exists":"doesnt estists");
        // conversion de case

        String[] caracteres = input.split("");

        for (int i = 0; i < caracteres.length; i++) {
            String letra = caracteres[i];
            if (letra.equals(letra.toLowerCase())) {
                caracteres[i] = letra.toUpperCase();
            } else {
                caracteres[i] = letra.toLowerCase();
            }
        }
        String str = String.join("", caracteres);
        System.out.println(str);

        // substring de la primera palabra:

        char space = ' ';

        int posicion = 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == space) {
                posicion = i;
                break;
            }
        }

        String substring = input.substring(0,posicion);
        System.out.println(substring);
        // agregar palabas a la fraase
        String phrase = "Hola mundirijillo.";
        String ask = ", como te va?";
        String bye = " Chao con adios";
        int pos1 = phrase.indexOf("mundirijillo") + "mundirijillo".length();
        String parte1 = phrase.substring(0, pos1);
        String parte2 = phrase.substring(pos1);

        String newPhrase = parte1 + ask + parte2 + bye;
        System.out.println(newPhrase);
        //


        scanner.close();
    }

}
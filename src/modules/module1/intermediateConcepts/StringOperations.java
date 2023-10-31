package modules.module1.intermediateConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {

    public static void infoString(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa una cadena: ");
        String input = scanner.nextLine();

        System.out.println("Ingresaste: " + input);
        System.out.println("A continuacion algunos datos: ");
        System.out.println("longitud de cadena: " + input.length());

        System.out.println(Arrays.toString(input.split("")));


        scanner.close();
    }

}
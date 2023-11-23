package modules.module0.control_structures;
import java.util.Scanner;

public class Conditional{
    public static void execIfElse(){
        System.out.println("Tirate un integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number != 2){
            System.out.println("No es el numero dos");
        } else {
            System.out.println("Escribiste un dos, sos un capo");
        };
       // scanner.close();
    };
    public static void execTernary(){
        int number = 7;
        String result = (number % 2 == 0)
                ? "Its pair"
                : "its not pair";
        System.out.println(result + " the numbar");
        };
    public static void execSwitchCase() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 0 al 9: ");
        int number = scanner.nextInt();

        String numberInWords;
        switch (number) {
            case 0:
                numberInWords = "cero";
                break;
            case 1:
                numberInWords = "uno";
                break;
            case 2:
                numberInWords = "dos";
                break;
            case 3:
                numberInWords = "tres";
                break;
            case 4:
                numberInWords = "cuatro";
                break;
            case 5:
                numberInWords = "cinco";
                break;
            case 6:
                numberInWords = "seis";
                break;
            case 7:
                numberInWords = "siete";
                break;
            case 8:
                numberInWords = "ocho";
                break;
            case 9:
                numberInWords = "nueve";
                break;
            default:
                numberInWords = "Número fuera del rango 0-9";
                break;
        }

        System.out.println("El número ingresado en palabras es: " + numberInWords);
    }

}

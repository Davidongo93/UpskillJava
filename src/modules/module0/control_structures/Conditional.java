package modules.module0.control_structures;

public class Conditional{
    public static void execIfElse(){
        int number = 7;
        if (number != 2){
            System.out.println("No es el numero dos");
        } else {
            System.out.println("Escribiste un dos, sos un capo");
        };
    };
    public static void execTernary(){
        int number = 7;
        String result = (number % 2 == 0)
                ? "Its pair"
                : "its not pair";
        System.out.println(result + " the numbar");
        };
    }

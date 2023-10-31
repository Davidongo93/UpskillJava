package modules.module1.intermediateConcepts;
import java.util.Scanner;
public class Constants {

    public static final double PI = 3.141592;

    public static void circleArea(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a circle radius : ");
        double number = scanner.nextInt();

         double square = Math.pow(number,2);

         double area = square * PI;
        System.out.print("the cicle area is: " + area);
    }
}

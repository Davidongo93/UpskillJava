package modules.module0;
import java.util.Scanner;

public class Conditional {

    public static void executeMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Conditionals Module Menu");
        System.out.println("1. Execute If-Else Example");
        System.out.println("2. Execute Ternary Example");
        System.out.println("3. Execute Switch-Case Example");
        System.out.println("0. Back to Module Menu");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Executing If-Else Example:");
                executeIfElse();
                break;
            case 2:
                System.out.println("Executing Ternary Example:");
                executeTernary();
                break;
            case 3:
                System.out.println("Executing Switch-Case Example:");
                executeSwitchCase();
                break;
            case 0:
                System.out.println("Returning to Module Menu...");
                break;
            default:
                System.out.println("Invalid option. Please enter a valid choice.");
        }

        scanner.close();
    }

    public static void executeIfElse() {
        System.out.println("Enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number != 2) {
            System.out.println("It's not the number two");
        } else {
            System.out.println("You wrote two, you're awesome");
        }
        // scanner.close();
    }

    public static void executeTernary() {
        int number = 7;
        String result = (number % 2 == 0)
                ? "It's even"
                : "It's not even";
        System.out.println(result + " the number");
    }

    public static void executeSwitchCase() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 0 to 9: ");
        int number = scanner.nextInt();

        String numberInWords;
        switch (number) {
            case 0:
                numberInWords = "zero";
                break;
            case 1:
                numberInWords = "one";
                break;
            case 2:
                numberInWords = "two";
                break;
            case 3:
                numberInWords = "three";
                break;
            case 4:
                numberInWords = "four";
                break;
            case 5:
                numberInWords = "five";
                break;
            case 6:
                numberInWords = "six";
                break;
            case 7:
                numberInWords = "seven";
                break;
            case 8:
                numberInWords = "eight";
                break;
            case 9:
                numberInWords = "nine";
                break;
            default:
                numberInWords = "Number out of the range 0-9";
                break;
        }

        System.out.println("The number entered in words is: " + numberInWords);
    }
}

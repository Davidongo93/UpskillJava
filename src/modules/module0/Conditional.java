package modules.module0;

import java.util.Scanner;

public class Conditional {

    static String separator = "--------------------------------------------------------\n";

    public static void executeMenu(Scanner scanner) {
        int choice = -1;

        System.out.println("Conditionals Module Menu");
        do {
            try {
                System.out.println(separator);
                System.out.println("1. Execute If-Else Example");
                System.out.println("2. Execute Ternary Example");
                System.out.println("3. Execute Switch-Case Example");
                System.out.println("0. Back to Module Menu");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(separator);
                        System.out.println("Executing If-Else Example:");
                        executeIfElse(scanner);
                        break;
                    case 2:
                        System.out.println(separator);
                        System.out.println("Executing Ternary Example:");
                        executeTernary(scanner);
                        break;
                    case 3:
                        System.out.println(separator);
                        System.out.println("Executing Switch-Case Example:");
                        executeSwitchCase(scanner);
                        break;
                    case 0:
                        System.out.println(separator);
                        System.out.println("Returning to Module Menu...");
                        break;
                    default:
                        System.out.println(separator);
                        System.out.println("Invalid option. Please enter a valid choice.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                choice = -1;
            }

        } while (choice != 0);
    }

    public static void executeIfElse(Scanner scanner) {
        System.out.println("In this If-Else example, you'll learn how to use a basic conditional statement.");
        System.out.println("The program checks if the entered number is equal to 2 and provides feedback accordingly.");

        int number = -1;

        do {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();

                if (number != 2) {
                    System.out.println("It's not the number two.");
                } else {
                    System.out.println("You wrote two. You're awesome!");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                number = -1;
            }

        } while (number == -1);
    }

    public static void executeTernary(Scanner scanner) {
        System.out.println("In this Ternary example, you'll learn how to use a concise conditional expression.");
        System.out.println("The program checks if the entered number is even or odd and provides feedback.");

        int number;
        do {
            try {
                System.out.print("Enter an integer to check if it's even or odd: ");
                number = scanner.nextInt();

                if (number < 0) {
                    System.out.println("Please enter a non-negative integer.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
                number = -1;
            }
        } while (number < 0);

        String result = (number % 2 == 0)
                ? "It's even"
                : "It's odd";
        System.out.println(result + " the number");
    }

    public static void executeSwitchCase(Scanner scanner) {
        System.out.println("In this Switch-Case example, you'll learn how to use a switch statement to handle multiple cases.");
        System.out.println("The program converts the entered number into words (0-9).");

        int number = -1;

        do {
            try {
                System.out.print("Enter a number from 0 to 9: ");
                number = scanner.nextInt();

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
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                number = -1;
            }

        } while (number == -1);
    }
}

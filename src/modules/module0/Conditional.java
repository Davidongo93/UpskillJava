package modules.module0;

import java.util.Scanner;

public class Conditional {

    static String separator = "--------------------------------------------------------\n";

    public static void executeMenu(Scanner scanner) {
        int choice = -1;

        System.out.println("Welcome to Conditionals Module Menu");
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
                scanner.nextLine(); // Consume the invalid input
                choice = -1; // Set choice to an invalid value to continue the loop
            }

        } while (choice != 0);
    }

    public static void executeIfElse(Scanner scanner) {
        System.out.println("This cutting edge technology will tell you if you write a number two '2'");
        int number = -1;

        do {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();

                if (number != 2) {
                    System.out.println("It's not the number two");
                } else {
                    System.out.println("You wrote two, you're awesome");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
                number = -1; // Set number to an invalid value to continue the loop
            }

        } while (number == -1);

    }

    public static void executeTernary(Scanner scanner) {
        System.out.println("Enter an integer to check if it's even or odd:");
        int number;
        do {
            try {
                System.out.print("Enter your choice: ");
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Please enter a non-negative integer.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Consume the invalid input
                number = -1; // Set number to an invalid value to continue the loop
            }
        } while (number < 0);

        String result = (number % 2 == 0)
                ? "It's even"
                : "It's odd";
        System.out.println(result + " the number");
    }

    public static void executeSwitchCase(Scanner scanner) {
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
                scanner.nextLine(); // Consume the invalid input
                number = -1; // Set number to an invalid value to continue the loop
            }

        } while (number == -1);

    }
}

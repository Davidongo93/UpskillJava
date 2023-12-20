package modules.module0;

import java.util.Scanner;

public class RunModule0 {
    static String separator = "--------------------------------------------------------\n";

    public static void main(Scanner scanner) {
        int choice = -1;
        System.out.println("Welcome to Module 0 Console Menu");
        do {
            try {
                System.out.println(separator);
                System.out.println("1. Execute Data Types Example");
                System.out.println("2. Execute Conditionals");
                System.out.println("3. Execute Iterators");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println(separator);
                            System.out.println("Executing Data Types Example...");
                            DataTypesExample.main(scanner);
                            break;
                        case 2:
                            System.out.println(separator);
                            System.out.println("Executing Conditionals...");
                            Conditional.executeMenu(scanner);
                            break;
                        case 3:
                            System.out.println(separator);
                            System.out.println("Executing Iterators...");
                            Iterators.executeMenu(scanner);
                            break;
                        case 0:
                            System.out.println(separator);
                            System.out.println("Exiting the menu. Goodbye!");
                            break;
                        default:
                            System.out.println(separator);
                            System.out.println("Invalid choice. Please enter a valid option.");
                    }
                } else {
                    System.out.println(separator);
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next();
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }

        } while (choice != 0);
    }
}

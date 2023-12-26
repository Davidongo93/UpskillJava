package modules.module1;

import java.util.Scanner;

public class RunModule1 {
    static String separator = "--------------------------------------------------------\n";

    public static void main(Scanner scanner) {
        int choice = -1;
        System.out.println("Welcome to Module 1 Console Menu");
        do {
            try {
                System.out.println(separator);
                System.out.println("1. Execute Classes and Objects Example");
                System.out.println("2. Execute Intermediate Concepts");
                System.out.println("3. Execute Homework");
                System.out.println("0. Exit");

                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println(separator);
                            System.out.println("Executing Classes and Objects Example...");
                           // ClassesAndObjectsExample.main(scanner);
                            break;
                        case 2:
                            System.out.println(separator);
                            System.out.println("Executing Intermediate Concepts...");
                          //  IntermediateConcepts.executeMenu(scanner);
                            break;
                        case 3:
                            System.out.println(separator);
                            System.out.println("Executing Homework...");
                          //  Homework.executeMenu(scanner);
                            break;
                        case 0:
                            System.out.println(separator);
                            System.out.println("Returning to main menu...");
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

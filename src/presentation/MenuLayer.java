package presentation;

import modules.module0.RunModule0;

import java.util.Scanner;

public class MenuLayer {
    static String javaUpskill = "       _                              _    _                 _      _   _   _ \n" +
            "      | |                            | |  | |               | |    (_) | | | |\n" +
            "      | |   __ _  __   __   __ _     | |  | |  _ __    ___  | | __  _  | | | |\n" +
            "  _   | |  / _` | \\ \\ / /  / _` |    | |  | | | '_ \\  / __| | |/ / | | | | | |\n" +
            " | |__| | | (_| |  \\ V /  | (_| |    | |__| | | |_) | \\__ \\ |   <  | | | | | |\n" +
            "  \\____/   \\__,_|   \\_/    \\__,_|     \\____/  | .__/  |___/ |_|\\_\\ |_| |_| |_|\n" +
            "                                              | |                             \n" +
            "                                              |_|                             ";

    static String separator = "--------------------------------------------------------\n";

    public static void showMenu(Scanner scanner) {
        System.out.println(javaUpskill);
        System.out.println("Welcome to my Henry Java Upskill Homework portfolio.");
        int option;

        do {

            System.out.println(separator);

            System.out.println("Please select an option:");
            // modules options
            System.out.println("1. Module 0 -- DataTypes -- Conditionals -- Iterators --");
            System.out.println("2. Module 1 -- OOP -- UML -- Objects, Classes and Interfaces --");
            System.out.println("3. Module 2");
            System.out.println("4. Module 3");
            System.out.println("5. Module 4");
            System.out.println("6. Module 5");
            System.out.println("0. Exit");

            try {
                System.out.print("Enter your choice: ");
                option = scanner.nextInt();

                switch (option) {
                    case 0:
                        System.out.println(separator);
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    case 1:
                        System.out.println(separator);
                        // Call function for Module 0
                        System.out.println("You selected Module 0");
                        RunModule0.main(scanner);
                        break;
                    case 2:
                        System.out.println(separator);
                        // Call function for Module 1
                        System.out.println("You selected Module 1");
                        break;
                    case 3:
                        System.out.println(separator);
                        // Call function for Module 2
                        System.out.println("You selected Module 2");
                        break;
                    case 4:
                        System.out.println(separator);
                        // Call function for Module 3
                        System.out.println("You selected Module 3");
                        break;
                    case 5:
                        System.out.println(separator);
                        // Call function for Module 4
                        System.out.println("You selected Module 4");
                        break;
                    case 6:
                        System.out.println(separator);
                        // Call function for Module 5
                        System.out.println("You selected Module 5");
                        break;
                    default:
                        System.out.println(separator);
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(separator);
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
                option = -1; // Set option to an invalid value to continue the loop
            }

        } while (option != 0);

    }
}

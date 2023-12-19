package presentation;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println(javaUpskill);
            System.out.println("Welcome to my Henry Java Upskill Homework portfolio");
            System.out.println("Please select an option:");
            //modules options
            System.out.println("1. Module 0");
            System.out.println("2. Module 1");
            System.out.println("3. Module 2");
            System.out.println("4. Module 3");
            System.out.println("5. Module 4");
            System.out.println("6. Module 5");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                case 1:
                    // Call function for Module 0
                    System.out.println("You selected Module 0");
                    break;
                case 2:
                    // Call function for Module 1
                    System.out.println("You selected Module 1");
                    break;
                case 3:
                    // Call function for Module 2
                    System.out.println("You selected Module 2");
                    break;
                case 4:
                    // Call function for Module 3
                    System.out.println("You selected Module 3");
                    break;
                case 5:
                    // Call function for Module 4
                    System.out.println("You selected Module 4");
                    break;
                case 6:
                    // Call function for Module 5
                    System.out.println("You selected Module 5");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 0);

        scanner.close();
    }
}

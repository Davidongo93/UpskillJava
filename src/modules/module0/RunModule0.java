package modules.module0;

import java.util.Scanner;

public class RunModule0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Module 0 Console Menu");
        System.out.println("1. Execute Conditionals");
        System.out.println("2. Execute Iterators");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Executing Conditionals...");
                Conditional.executeMenu();
                break;
            case 2:
                System.out.println("Executing Iterators...");
              //  Iterators.execute();
                break;
            case 0:
                System.out.println("Exiting the menu. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}

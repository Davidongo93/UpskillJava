package modules.module0;

import java.util.Scanner;

public class Iterators {

    static String separator = "--------------------------------------------------------\n";

    public static void executeMenu(Scanner scanner) {
        int choice = -1;

        System.out.println("Welcome to Iterators Module Menu");
        do {
            try {
                System.out.println(separator);
                System.out.println("1. Execute Do-While Loop Example");
                System.out.println("2. Execute While Loop Example");
                System.out.println("3. Execute For Loop Example");
                System.out.println("4. Execute For-Each Loop Example");
                System.out.println("5. Execute For-Each Loop (Calendar October 2023) Example");
                System.out.println("0. Back to Module Menu");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(separator);
                        System.out.println("Executing Do-While Loop Example:");
                        execDoWhileLoop(scanner);
                        break;
                    case 2:
                        System.out.println(separator);
                        System.out.println("Executing While Loop Example:");
                        execWhileLoop(scanner);
                        break;
                    case 3:
                        System.out.println(separator);
                        System.out.println("Executing For Loop Example:");
                        execForLoop(scanner);
                        break;
                    case 4:
                        System.out.println(separator);
                        System.out.println("Executing For-Each Loop Example:");
                        execForEachLoop(scanner);
                        break;
                    case 5:
                        System.out.println(separator);
                        System.out.println("Executing For-Each Loop (Calendar October 2023) Example:");
                        forEachCalendarioOctubre2023();
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

    public static void execDoWhileLoop(Scanner scanner) {
        System.out.println("Example of a do-while loop:");
        System.out.println("A do-while loop is a control flow statement that executes a block of code at least once, and then repeatedly executes the block,\n"
                + "or not, depending on a given condition. It is similar to a while loop, but with the test condition at the end of the block.");

        int iteration = 0;
        int continueChoice;

        do {
            iteration++;
            System.out.println("Iteration " + iteration);

            System.out.print("Do you want to continue the loop? (1 for Yes / 0 for No): ");
            continueChoice = scanner.nextInt();

            if (continueChoice != 1 && continueChoice != 0) {
                System.out.println("Exiting the loop.");
                break;
            }

        } while (continueChoice == 1);
    }

    public static void execWhileLoop(Scanner scanner) {
        System.out.println("Example of a while loop:");
        System.out.println("A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.\n"
                + "The loop will continue to run as long as the condition is true.");

        System.out.print("Enter the number of iterations for the while loop: ");
        int maxIterations = scanner.nextInt();

        int i = 1;

        while (i <= maxIterations) {
            System.out.println("Iteration " + i);
            i++;

            System.out.print("Do you want to continue the loop? (1 for Yes / 0 for No): ");
            int continueChoice = scanner.nextInt();

            if (continueChoice != 1 && continueChoice != 0) {
                System.out.println("Invalid choice. Exiting the loop.");
                break;
            }
        }
    }

    public static void execForLoop(Scanner scanner) {
        System.out.println("Example of a for loop:");
        System.out.println("A for loop is a control flow statement for specifying iteration, which allows code to be executed repeatedly.\n"
                + "It consists of three parts: initialization, condition, and iteration expression.");

        System.out.print("Enter the number of iterations for the for loop: ");
        int maxIterations = scanner.nextInt();

        for (int i = 1; i <= maxIterations; i++) {
            System.out.println("Iteration " + i);

            if (i < maxIterations) {
                System.out.print("Do you want to continue the loop? (1 for Yes / 0 for No): ");
                int continueChoice = scanner.nextInt();

                if (continueChoice != 1 && continueChoice != 0) {
                    System.out.println("Invalid choice. Exiting the loop.");
                    break;
                }
            }
        }
    }

    public static void execForEachLoop(Scanner scanner) {
        System.out.println("Example of a for-each loop:");
        System.out.println("A for-each loop is used for iterating over elements of arrays or collections.\n"
                + "It eliminates the need for explicit indexing and simplifies code.");

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        Integer[] numbers = new Integer[size];

        System.out.println("Enter " + size + " integers to populate the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Iterating over the elements of the array:");

        for (Integer number : numbers) {
            System.out.println("Found this: " + number);
        }
    }

    public static void forEachCalendarioOctubre2023() {
        System.out.println("Calendar for October 2023:");

        String[][] calendario = new String[5][7];

        String[] diasOctubre = {
                "  ", " 1", " 2", " 3", " 4", " 5", " 6",
                " 7", " 8", " 9", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27",
                "28", "29", "30", "31", "  "
        };

        int dia = 0;
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                if (dia < diasOctubre.length) {
                    calendario[fila][columna] = diasOctubre[dia];
                } else {
                    calendario[fila][columna] = "  ";
                }
                dia++;
            }
        }
        for (String[] semana : calendario) {
            for (String diaDelMes : semana) {
                System.out.print(diaDelMes + " ");
            }
            System.out.println();
        }

        System.out.println("A for-each loop is used here to iterate over the elements of the 2D array 'calendario'.\n" +
                "It simplifies the code by eliminating the need for explicit indexing.\n" +
                "The loop iterates over each 'semana' (week) in 'calendario',\n" +
                "and then over each 'diaDelMes' (day) in the current 'semana'.\n" +
                "This allows easy traversal and printing of the entire calendar.");
    }
}

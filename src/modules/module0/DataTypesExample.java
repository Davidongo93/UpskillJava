package modules.module0;

import java.util.Scanner;

public class DataTypesExample {
    static String separator = "--------------------------------------------------------\n";

    public static void main(Scanner scanner) {
        int choice = -1;

        do {
            try {
                System.out.println(separator);
                System.out.println("Data Types Example Menu");
                System.out.println("1. int");
                System.out.println("2. double");
                System.out.println("3. float");
                System.out.println("4. long");
                System.out.println("5. short");
                System.out.println("6. byte");
                System.out.println("7. char");
                System.out.println("8. boolean");
                System.out.println("9. String");
                System.out.println("10. Object");
                System.out.println("0. Back to Module Menu");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        explainDataType("int", "integer", "Integer", Integer.MAX_VALUE, Integer.MIN_VALUE);
                        break;
                    case 2:
                        explainDataType("double", "decimal", "Double", Double.MAX_VALUE, Double.MIN_VALUE);
                        break;
                    case 3:
                        explainDataType("float", "floating-point", "Float", Float.MAX_VALUE, Float.MIN_VALUE);
                        break;
                    case 4:
                        explainDataType("long", "long integer", "Long", Long.MAX_VALUE, Long.MIN_VALUE);
                        break;
                    case 5:
                        explainDataType("short", "short integer", "Short", Short.MAX_VALUE, Short.MIN_VALUE);
                        break;
                    case 6:
                        explainDataType("byte", "byte-sized integer", "Byte", Byte.MAX_VALUE, Byte.MIN_VALUE);
                        break;
                    case 7:
                        explainCharDataType();
                        break;
                    case 8:
                        explainBooleanDataType();
                        break;
                    case 9:
                        explainStringDataType();
                        break;
                    case 10:
                        explainObjectDataType();
                        break;
                    case 0:
                        System.out.println("Returning to Module Menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println(separator);
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
                choice = -1; // Set choice to an invalid value to continue the loop
            }
        } while (choice != 0);
    }

    private static void explainDataType(String dataType, String description, String wrapperClass, Number maxValue, Number minValue) {
        System.out.println(separator);
        System.out.println("\nExplanation for " + dataType + ":");
        System.out.println(dataType + " is a primitive data type representing " + description + " values.");
        System.out.println("It has a corresponding wrapper class: " + wrapperClass + ".");
        System.out.println(wrapperClass + " provides useful methods for working with " + dataType + " values.");
        System.out.println("For example, " + wrapperClass + ".MAX_VALUE: " + maxValue);
        System.out.println(wrapperClass + ".MIN_VALUE: " + minValue);
    }

    private static void explainCharDataType() {
        System.out.println(separator);
        System.out.println("\nExplanation for char:");
        System.out.println("char is a primitive data type representing a single character.");
        System.out.println("It has a corresponding wrapper class: Character.");
        System.out.println("Character provides useful methods for working with char values.");
        System.out.println("For example, Character.isDigit('5'): " + Character.isDigit('5'));
        System.out.println("Character.isLetter('A'): " + Character.isLetter('A'));
    }

    private static void explainBooleanDataType() {
        System.out.println(separator);
        System.out.println("\nExplanation for boolean:");
        System.out.println("boolean is a primitive data type representing true or false values.");
        System.out.println("It has a corresponding wrapper class: Boolean.");
        System.out.println("Boolean provides useful methods for working with boolean values.");
        System.out.println("For example, Boolean.TRUE: " + Boolean.TRUE);
        System.out.println("Boolean.FALSE: " + Boolean.FALSE);
    }

    private static void explainStringDataType() {
        System.out.println(separator);
        System.out.println("\nExplanation for String:");
        System.out.println("String is a class representing a sequence of characters.");
        System.out.println("It is not a primitive data type but is widely used to handle and manipulate textual data.");
        System.out.println("String objects are immutable, meaning their values cannot be changed after they are created.");
        System.out.println("Common methods include length(), charAt(), concat(), and more.");
        System.out.println("For example, String str = \"Hello\";");
        System.out.println("str.length(): " + "Hello".length());
        System.out.println("str.charAt(0): " + "Hello".charAt(0));
    }

    private static void explainObjectDataType() {
        System.out.println(separator);
        System.out.println("\nExplanation for Object:");
        System.out.println("Object is the root class for all classes in Java.");
        System.out.println("It can hold any type of object due to polymorphism.");
        System.out.println("It is commonly used when you want to store heterogeneous objects or when the type is unknown at compile time.");
        System.out.println("For example, Object obj = new Integer(5);");
        System.out.println("Object obj2 = \"Hello\";");
    }
}

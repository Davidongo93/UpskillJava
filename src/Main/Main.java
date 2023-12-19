package Main;

import modules.module0.control_structures.Iterators;
import modules.module1.intermediateConcepts.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static modules.module0.control_structures.Conditional.*;
import static modules.module0.control_structures.Iterators.*;
public class Main {
    public static void main(String[] args) {
/*        System.out.println("Conditionals");
        execIfElse();
        execTernary();
        execSwitchCase();
        System.out.println("Iterators");
        execDoWhileLoop();
        execWhileLoop();
        execForLoop();
        execForEachLoop();
        String[][] calendario = new String[5][7];
        Iterators.main(args);
       modules.module1.classes_and_objects.Main.Main.main(args);
       //homework m1 c1
        modules.module1.homework.Main.Main.main(args);
        //homework m1c2 cicle area calculator
        modules.module1.intermediateConcepts.Constants.circleArea();
        // string ops
        modules.module1.intermediateConcepts.StringOperations.infoString();
        //ejemplos melos para entender las listas
        Set<String> hashSet = new HashSet<>();
        Set<String> orderedSet = new TreeSet<>();
        modules.module2.EjercicioSet.execAddCountries(hashSet);
        modules.module2.EjercicioSet.showCountries(orderedSet);*/

        Product[] products = new Product[] {
                new Product("atun lata", 50.0, 1),
                new Product("banano", 25.0, 2),
                new Product("agua mineral", 150.0, 3),
                new Product("aguacate", 5.0, 4),
                new Product("tomate", 10.0, 5)
        };
        // Ordenar productos por precio
        Arrays.sort(products);

        System.out.println("Array de productos ordenado por precio:");
        for (Product product : products) {
            System.out.println(product);
        }

        };
    };
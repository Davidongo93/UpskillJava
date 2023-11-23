import modules.module0.control_structures.Iterators;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static modules.module0.control_structures.Conditional.*;
import static modules.module0.control_structures.Iterators.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Conditionals");
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
       modules.module1.classes_and_objects.Main.main(args);
       //homework m1 c1
        modules.module1.homework.Main.main(args);
        //homework m1c2 cicle area calculator
        modules.module1.intermediateConcepts.Constants.circleArea();
        // string ops
        modules.module1.intermediateConcepts.StringOperations.infoString();
        //ejemplos melos para entender las listas
        Set<String> hashSet = new HashSet<>();
        Set<String> orderedSet = new TreeSet<>();
        modules.module2.EjercicioSet.execAddCountries(hashSet);
        modules.module2.EjercicioSet.showCountries(orderedSet);
    };

};
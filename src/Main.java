import modules.module0.control_structures.Iterators;

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
    };

};
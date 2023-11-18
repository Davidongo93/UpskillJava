package modules.module2;

import java.util.Set;

public class EjercicioSet {
    public static void execAddCountries(Set<String> setCountries) {
        setCountries.add("France");
        setCountries.add("Spain");
        setCountries.add("Andorrea");

        boolean isDuplicate = setCountries.add("Spain");
        System.out.println(isDuplicate);
    }

};

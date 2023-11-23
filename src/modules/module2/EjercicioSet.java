package modules.module2;

import java.util.Set;
import java.util.TreeSet;

public class EjercicioSet {
    public static void execAddCountries(Set<String> setCountries) {
        setCountries.add("France");
        setCountries.add("Spain");
        setCountries.add("Andorrea");

        boolean isDuplicate = setCountries.add("Spain");
        System.out.println("Se Agrego elemento? "+isDuplicate);
        System.out.println("mostrando listado");
        for (String countries : setCountries){
            System.out.println(countries);
        };
    };
    public static void showCountries (Set<String> SetCountries){
Set<String> orderedCountries = new TreeSet<>(SetCountries);
        System.out.println("mostrando listado ordenado");
for (String countries: orderedCountries){
    System.out.println(countries);
}
    };
};

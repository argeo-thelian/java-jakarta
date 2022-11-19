package org.arthe.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicados2 {

    public static void main(String[] args) {

        String[] peces = {"Corvina","Atún", "Lenguado","Pejerrey","Robalo","Lenguado", "Atún"};
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){
            if(!unicos.add(pez)) {
                duplicados.add(pez);
                System.out.println("Elemento duplicado: " + pez );
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Unicos:" + unicos);
        System.out.println("Duplicados: "+ duplicados);
    }
}

package org.arthe.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println(ts);

        Set<Integer> numeros = new TreeSet<>((a,b)->b.compareTo(a));
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);
        numeros.add(2);
        numeros.add(10);
        System.out.println(numeros);
    }
}

package org.arthe.ejemplos.set;

import org.arthe.ejemplos.modelo.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 4));
        sa.add(new Alumno("Cato", 5));
        sa.add(new Alumno("Luci", 6));
        sa.add(new Alumno("Adres", 3));
        sa.add(new Alumno("Zeus", 3));
        sa.add(new Alumno("Zeus", 3));
        //Ordenar
        System.out.println("Ordenar Sort");
        sa.sort((a,b)-> b.getNota().compareTo(a.getNota()));
        sa.forEach(System.out::println);
        //Collection ordenar
        System.out.println("Ordenar Collections Sort");
        Collections.sort(sa, (a,b)-> a.getNombre().compareTo(b.getNombre()));
        sa.forEach(System.out::println);
        //Otra forma de ordenar
        System.out.println("Ordenar Comparator comaparing");
        //sa.sort(Comparator.comparing((Alumno a)-> a.getNota()).reversed());
        sa.sort(comparing(Alumno::getNota).reversed());



        System.out.println("Iterando usando forEach ");
        sa.forEach(System.out::println);
    }
}

package org.arthe.ejemplos.set;

import org.arthe.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
        sa.add(new Alumno("Pato", 4));
        sa.add(new Alumno("Cato", 5));
        sa.add(new Alumno("Luci", 6));
        sa.add(new Alumno("Adres", 3));
        sa.add(new Alumno("Zeus", 3));
        System.out.println(sa);
    }
}

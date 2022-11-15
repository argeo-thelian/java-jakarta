package org.arthe.ejemplos.set;

import org.arthe.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
//        Set<Alumno> sa = new HashSet<>();
//        Set<Alumno> sa = new TreeSet<>();
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 4));
        sa.add(new Alumno("Cato", 5));
        sa.add(new Alumno("Luci", 6));
        sa.add(new Alumno("Adres", 3));
        sa.add(new Alumno("Zeus", 3));
        sa.add(new Alumno("Zeus", 3));
        System.out.println(sa);

        System.out.println("Utilizando un for clásico");
        for (int i = 0; i < sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando haciendo un foreach");
        for (Alumno a: sa){
            System.out.println(a.getNombre());
        }
        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando forEach ");
        sa.forEach(System.out::println);
    }
}

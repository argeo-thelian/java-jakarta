package com.thear.java8.lambda;

import com.thear.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test1 = num -> num >= 10;
        boolean r1 = test1.test(10);
        System.out.println("r = " + r1);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3  =String::equals; //(a,b)-> a.equals(b);
        System.out.println(t3.test("andres", "pepe"));

        BiPredicate<Integer, Integer> t4 = (i,j)-> i < j;
        boolean r2 = t4.test(5,10);
        System.out.println("r = " + r2);

        Usuario a1 = new Usuario();
        Usuario a2 = new Usuario();
        a1.setNombre("maria");
        a2.setNombre("fer");
        BiPredicate<Usuario, Usuario> t5 = (ua1,ua2) -> ua1.getNombre().equals(ua2.getNombre());
        System.out.println(t5.test(a1,a2));
    }
}

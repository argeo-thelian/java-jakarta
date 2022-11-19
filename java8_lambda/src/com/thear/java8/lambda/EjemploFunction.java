package com.thear.java8.lambda;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        Function<String, String> f1 = param -> "Hola que tal! " + param;
        String res1 = f1.apply("andres");
        System.out.println(res1);

        Function<String, String> f2 = String::toUpperCase; //param -> param.toUpperCase();
        System.out.println(f2.apply("argeo"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("argeo","jose");
        System.out.println(r2);

        BiFunction<String, String, Integer> f4 = String::compareTo; //(a,b)->a.compareTo(b);
        System.out.println(f4.apply("andres", "andres"));

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("andres", "andres"));

    }

}

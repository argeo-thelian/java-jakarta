package com.thear.java8.lambda;

import com.thear.java8.lambda.aritmetica.Aritmetica;
import com.thear.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a,b) -> a-b;
        Aritmetica multi = (a,b) -> a*b;
        Aritmetica divis = (a,b) -> a/b;

        Calculadora cal = new Calculadora();

        System.out.println("suma = " + cal.computar(10,5, suma));
        System.out.println("rest = " + cal.computar(10,5, resta));
        System.out.println("mutl = " + cal.computar(10,5, multi));
        System.out.println("divi = " + cal.computar(10,5, divis));
    }
}

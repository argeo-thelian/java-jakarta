package com.arthe.sobrecarga;

public class Calculadora {

    private Calculadora(){

    }
    public static int sumar (int a, int b){
        return a+b;
    }
    public static int sumar (int... argumentos){
        int total = 0;
        for (int argumento: argumentos) {
            total += argumento;
        }
        return total;
    }
    public static float sumar(float a, float... floats){
        float total = a;
        for (float argumento: floats) {
            total += argumento;
        }
        return total;
    }
    public static float sumar (int a, float b){
        return a+b;
    }
    public static float sumar (float a, int b){
        return a+b;
    }
    public static float sumar (float a, float b){
        return a+b;
    }

    public static double sumar (double a, int b){
        return a+b;}

    public static double sumar (int a, double b){
        return a+b;
    }
    public static double sumar (double a, double b){
        return a+b;
    }
}

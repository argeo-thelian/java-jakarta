package com.arthe.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        String valor = JOptionPane.showInputDialog("Ingrese un entero: ");
        String num = JOptionPane.showInputDialog("Ingrese numerador: ");
        String div = JOptionPane.showInputDialog("Ingrese denominador: ");
        int divisor;
        double division;
        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10,divisor);
            System.out.println(division);
            double division2 = cal.dividir(num,div);
            System.out.println("division 2 = " + division2);
        } catch (NumberFormatException nfe){
            System.out.println("Se detecto una excepción: ingrese un valor numérico: " + nfe.getMessage());
            main(args);
        } catch (FormatoNumeroException fne) {
            System.out.println("Se detecto una excepción: ingrese un número validao: " + fne.getMessage());
            fne.printStackTrace(System.out);
            main(args);
        } catch (DivisionPorZeroException de){
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + de.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin!");
        }
        System.out.println("Continuamos con el flujo de la aplicación.");
    }
}

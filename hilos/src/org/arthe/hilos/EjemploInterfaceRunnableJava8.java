package org.arthe.hilos;

import org.arthe.hilos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {

    public static void main(String[] args) {

        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finalmenete me voy de viaje a: " + Thread.currentThread().getName());
        };

        new Thread(viaje, "Paris").start();
        new Thread(new ViajeTarea("Isla de Pauscua")).start();
        new Thread(new ViajeTarea("Robison Cruose")).start();
        new Thread(new ViajeTarea("Juan Fernandez")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();

        System.out.println("Continuando con la ejecución del metrodo main ");
    }
}

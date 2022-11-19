package org.arthe.hilos;

import org.arthe.hilos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Jhoe Doe");

//        System.out.println(hilo.getState());
        hilo.start();
        System.out.println(hilo.getState());
//        Thread.sleep(500);
        System.out.println(hilo.getState());

        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();
        System.out.println(hilo2.getState());

        NombreThread hilo3 = new NombreThread("Pepe");
        hilo3.start();
    }
}

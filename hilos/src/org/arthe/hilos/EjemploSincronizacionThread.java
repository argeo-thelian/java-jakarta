package org.arthe.hilos;

import org.arthe.hilos.runnable.ImprimirFrases;
import org.arthe.hilos.runnable.ViajeTarea;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("Hola", "que tal")).start();
        new Thread(new ImprimirFrases("Quien eres", "tú?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrases("Muchas", "gracias!"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());
    }

    //add synchronized para mantener un orden en la entrada y salida
    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.println(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frase2);
    }
}

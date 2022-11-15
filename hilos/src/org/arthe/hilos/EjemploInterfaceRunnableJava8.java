package org.arthe.hilos;

import org.arthe.hilos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {

    public static void main(String[] args) {
        new Thread(new ViajeTarea("Isla de Pauscua")).start();
        new Thread(new ViajeTarea("Robison Cruose")).start();
        new Thread(new ViajeTarea("Juan Fernandez")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();
    }
}

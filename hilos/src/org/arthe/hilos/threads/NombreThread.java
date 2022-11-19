package org.arthe.hilos.threads;

public class NombreThread extends Thread{

    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el método run del hilo " + getName());
        for (int i =0; i< 10; i++){
            try {
                Thread.sleep(10);
                System.out.println(this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("finaliza el hilo");
    }
}

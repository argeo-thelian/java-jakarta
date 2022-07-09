package com.arthe.compania;

public class EjemploCompania {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Argeo", "Thelian", "132-HF", "Av. Poli", 12.0);
        empleado.aumentarRemuneracion(40);

        Gerente gerente = new Gerente("Juan", "Martiz", 1000000);

        Cliente cliente = new Cliente("Marco" , "Rodriguez", "1122-GF", "Claz. Tico");

        imprimir(empleado);
        imprimir(gerente);
        imprimir(cliente);
    }

    public static void imprimir(Persona persona){
        System.out.println(persona.toString());
        System.out.println("\n\n");
    }
}

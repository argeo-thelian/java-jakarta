package com.arthe.compania;

public class Cliente extends  Persona{

    private int clienteId;

    private static int ultimoId;


    public Cliente(){
        this.clienteId = ++ultimoId;
    }

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
        this.clienteId = ++ultimoId;
    }

    public Cliente(String nombre, String apellido, String numeroFiscal) {
        super(nombre, apellido, numeroFiscal);
        this.clienteId = ++ultimoId;
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++ultimoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nInformacion: " +
                "clienteId=" + clienteId;
    }
}

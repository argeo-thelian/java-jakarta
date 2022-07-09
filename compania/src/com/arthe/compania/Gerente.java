package com.arthe.compania;

public class Gerente extends Empleado{

    private double presupuesto;

    public Gerente() {
    }

    public Gerente(String nombre, String apellido, double presupuesto) {
        super(nombre, apellido);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, double remuneracion, double presupuesto) {
        super(nombre, apellido, remuneracion);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, double presupuesto) {
        super(nombre, apellido, numeroFiscal);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, double remuneracion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, remuneracion);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.presupuesto = presupuesto;
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nInformación de Gerente: " +
                "\npresupuesto=" + presupuesto;
    }
}

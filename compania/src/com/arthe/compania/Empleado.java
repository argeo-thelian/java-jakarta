package com.arthe.compania;

public class Empleado extends Persona{
    private double remuneracion;
    private int empledadoId;
    private static int ultimoId;

    public Empleado() {
        this.empledadoId = ++ultimoId;
    }


    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
        this.empledadoId = ++ultimoId;
    }

    public Empleado(String nombre, String apellido, double remuneracion) {
        this(nombre, apellido);
        this.remuneracion = remuneracion;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal) {
        super(nombre,apellido,numeroFiscal);
        this.empledadoId = ++ultimoId;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal,double remuneracion) {
        this(nombre,apellido,numeroFiscal);
        this.remuneracion = remuneracion;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre,apellido,numeroFiscal,direccion);
        this.empledadoId = ++ultimoId;
    }
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion , double remuneracion) {
        this(nombre,apellido,numeroFiscal,direccion);
        this.remuneracion = remuneracion;
    }


    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpledadoId() {
        return empledadoId;
    }

    public void setEmpledadoId(int empledadoId) {
        this.empledadoId = empledadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        setRemuneracion(remuneracion *((((double)porcentaje)/100) + 1));
    }

    @Override
    public String toString() {
        return super.toString() + "\nInfomación empleado: " +
                "\nempledadoId=" + empledadoId +
                "\nremuneracion=" + getRemuneracion();
    }
}

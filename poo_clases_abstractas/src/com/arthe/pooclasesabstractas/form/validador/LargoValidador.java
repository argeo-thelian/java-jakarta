package com.arthe.pooclasesabstractas.form.validador;

public class LargoValidador extends Validador{

    protected String mensaje = "El campo debe tener mínimo %d caracteres y máximo %d caracteres";
    private int min = 0;
    private int max = Integer.MAX_VALUE;
    public LargoValidador() { }
    public LargoValidador(int min, int max) {
        this();
        this.min = min;
        this.max = max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        this.mensaje = String.format(this.mensaje,this.min,this.max);
        if (valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }
}

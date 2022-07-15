package com.arthe.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "El campo %s tiene un formato de correo inválido";
    //^ valida al comienzo;
    //(.) cualquier caracter;
    //+ se puede repetir n cantidad de veces
    //$ índica el final de la validación
    //@ indida un @
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
        return valor.matches(EMAIL_REGEX);
    }
}

package com.arthe.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectandose algún motor de base de datos");
    }

    //Devuelve solo una instacia en caso de se haya creado al principio,
    //si ya se creo se devuelve la misma instancia.
    public static ConexionBDSingleton getInstance(){
        if (instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }


}

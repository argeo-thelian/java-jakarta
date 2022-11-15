package com.arthe.patrones.observer.ejemplos;

import com.arthe.patrones.observer.Corporacion;
import com.arthe.patrones.observer.UsuarioRepositorio;

public class EjemploObserverUsu {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o,u) -> System.out.println("Enviado un email al usuario: "+ u));
        repo.addObserver((o,u) -> System.out.println("Enviado un email al admin: "+ u));
        repo.addObserver((o,u) -> System.out.println("Enviado un email al logs: " +u ));

        repo.crearUsuario("Andrés");

    }

}

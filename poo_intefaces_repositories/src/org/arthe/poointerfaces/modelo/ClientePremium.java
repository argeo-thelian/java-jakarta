package org.arthe.poointerfaces.modelo;

import org.jetbrains.annotations.NotNull;

public class ClientePremium extends Cliente implements Comparable<ClientePremium>{
    public ClientePremium(String nombre, String apellido){
        super(nombre, apellido);
    }

    @Override
    public int compareTo(@NotNull ClientePremium o) {
        return 0;
    }
}

package org.arthe.genericsclass;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {
    //Camion add T and Iterable<T>
    private List<T> objetos; // Add <T>
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();//add <>
    }

    public void add(T objeto){// Changes Object by T
        if(this.objetos.size() <= max){
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No hay más espacio.");
        }

    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @NotNull
    @Override
    public Iterator<T> iterator() { // add <T>
        return this.objetos.iterator();
    }
}

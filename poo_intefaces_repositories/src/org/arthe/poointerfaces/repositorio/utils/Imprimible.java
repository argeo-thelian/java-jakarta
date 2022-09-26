package org.arthe.poointerfaces.repositorio.utils;

import org.arthe.poointerfaces.modelo.BaseEntity;

import java.util.List;

public class Imprimible {
    public static void imprimir(List<? extends BaseEntity> list){
        System.out.println("\n");
        list.forEach(System.out::println);
    }
}

package org.arthe.generics;

import org.arthe.poointerfaces.modelo.Cliente;
import org.arthe.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes= new ArrayList<>();
        clientes.add(new Cliente("Andres", "Martin"));

//        Cliente andres = (Cliente) clientes.get(0);
        Cliente andres = clientes.iterator().next();
        Cliente[] clientesArreglo = {
                new Cliente("Licio", "Marti"),
                new Cliente("Locano", "Monta")
        };

        Integer[] enteros = {1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enteros);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> stringList = fromArrayToList(
                new String[]{"Andres","Pepe","Luci", "John"},
                enteros);
        stringList.forEach(System.out::println);

        List<ClientePremium> clientePremiumsList = fromArrayToList(new ClientePremium[]{
                new ClientePremium("Jorge", "Villa"),
                new ClientePremium("Roman", "Montes")
        });

        clientePremiumsList.forEach(System.out::println);

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientePremiumsList);
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }


    public static <T,G> List<T> fromArrayToList(T[] c, G[] x){
        for (G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);

    }


    public static void imprimirClientes(List< ? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }
}

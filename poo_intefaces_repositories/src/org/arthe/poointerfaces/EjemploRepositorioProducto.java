package org.arthe.poointerfaces;

import org.arthe.poointerfaces.modelo.Cliente;
import org.arthe.poointerfaces.modelo.Producto;
import org.arthe.poointerfaces.repositorio.Direccion;
import org.arthe.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.arthe.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.arthe.poointerfaces.repositorio.lista.ProductoListRepositorio;
import org.arthe.poointerfaces.repositorio.utils.Imprimible;

import java.util.Arrays;
import java.util.List;

public class EjemploRepositorioProducto extends Imprimible {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Sarten", 140.0));
        repo.crear(new Producto("Tupper", 120.30));
        repo.crear(new Producto("Tallar trastes", 2.20));
        repo.crear(new Producto("Lavador de trastes", 10.0));
        repo.crear(new Producto("Tabla de picar", 123.03));
        repo.crear(new Producto("Pala de madera", 20.20));

        List<Producto> productos = repo.listar();
        imprimir(productos);

        List<Producto> paginable = repo.listar(1, 3);
        imprimir(paginable);

        List<Producto> ordenable = repo.listar("descripcion",Direccion.ASC);
        imprimir(ordenable);

        Producto prodActulizar = new Producto("Mesa", 300);
        prodActulizar.setId(5);
        repo.editar(prodActulizar);
        imprimir(productos);

        repo.eliminar(1);
        imprimir(repo.listar());
        System.out.println("=== Total ===");
        System.out.println("Total registros: " + repo.total());
    }



}

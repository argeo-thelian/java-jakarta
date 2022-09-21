package org.arthe.poointerfaces;

import org.arthe.poointerfaces.modelo.Cliente;
import org.arthe.poointerfaces.repositorio.utils.Imprimible;
import org.arthe.poointerfaces.repositorio.*;
import org.arthe.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio extends Imprimible {
    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Juno", "Piros"));
        repo.crear(new Cliente("Juan", "Roens"));
        repo.crear(new Cliente("Gros", "Risos"));
        repo.crear(new Cliente("Fres", "Neris"));
        repo.crear(new Cliente("Fros", "Miros"));

        List<Cliente> clientes = repo.listar();
        imprimir(clientes);

        List<Cliente> paginable = repo.listar(1, 3);
        imprimir(paginable);

        List<Cliente> ordenable = repo.listar("nombre",Direccion.ASC);
        imprimir(ordenable);

        Cliente junoActualizar = new Cliente("Juno", "Prime");
        junoActualizar.setId(2);
        repo.editar(junoActualizar);
        imprimir(clientes);

        repo.eliminar(1);
        imprimir(repo.listar());
        System.out.println("=== Total ===");
        System.out.println("Total registros: " + repo.total());
    }

}

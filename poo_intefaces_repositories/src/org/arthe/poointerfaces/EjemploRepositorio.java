package org.arthe.poointerfaces;

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;
import org.arthe.poointerfaces.modelo.Cliente;
import org.arthe.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Juno", "Piros"));
        repo.crear(new Cliente("Juan", "Roens"));
        repo.crear(new Cliente("Gros", "Risos"));
        repo.crear(new Cliente("Fres", "Neris"));
        repo.crear(new Cliente("Fros", "Miros"));

        System.out.println(repo.listar());
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("\n\n");

        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("\n\n");
        List<Cliente> ordenable = ((OrdenableRepositorio)repo).listar("nombre",Direccion.ASC);
        ordenable.forEach(System.out::println);

        System.out.println("\n\n");
        Cliente junoActualizar = new Cliente("Juno", "Prime");
        junoActualizar.setId(2);
        repo.editar(junoActualizar);
        clientes.forEach(System.out::println);

        System.out.println("\n\n");
        repo.eliminar(1);
        repo.listar().forEach(System.out::println);

    }

}

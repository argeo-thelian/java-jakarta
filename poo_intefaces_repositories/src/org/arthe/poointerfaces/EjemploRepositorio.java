package org.arthe.poointerfaces;

import org.arthe.poointerfaces.modelo.Cliente;
import org.arthe.poointerfaces.repositorio.exceptions.AccesoDatoException;
import org.arthe.poointerfaces.repositorio.exceptions.EscrituraAccesoDatoException;
import org.arthe.poointerfaces.repositorio.exceptions.LecturaAccesoDatoException;
import org.arthe.poointerfaces.repositorio.exceptions.RegistroDuplicadoAccesoDatoException;
import org.arthe.poointerfaces.repositorio.utils.Imprimible;
import org.arthe.poointerfaces.repositorio.*;
import org.arthe.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio extends Imprimible {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Juno", "Piros"));
            repo.crear(new Cliente("Juan", "Roens"));
            repo.crear(new Cliente("Gros", "Risos"));
            repo.crear(new Cliente("Fres", "Neris"));
            Cliente fros = new Cliente("Fros", "Miros");
            repo.crear(fros);
            repo.crear(fros);

            repo.crear(null);
            List<Cliente> clientes = repo.listar();
            imprimir(clientes);

            List<Cliente> paginable = repo.listar(1, 3);
            imprimir(paginable);

            List<Cliente> ordenable = repo.listar("nombre", Direccion.ASC);
            imprimir(ordenable);

            Cliente junoActualizar = new Cliente("Juno", "Prime");
            junoActualizar.setId(2);
            repo.editar(junoActualizar);
            imprimir(clientes);

            repo.eliminar(50);
            imprimir(repo.listar());
            System.out.println("=== Total ===");
            System.out.println("Total registros: " + repo.total());
        } catch (LecturaAccesoDatoException le) {
            System.out.println("Lectura: " + le.getMessage());
            le.printStackTrace();
        }catch (RegistroDuplicadoAccesoDatoException re){
            System.out.println("Registro Duplicado: " + re.getMessage());
            re.printStackTrace();
        }catch (EscrituraAccesoDatoException de){
            System.out.println("Escritura: " + de.getMessage());
            de.printStackTrace();
        } catch (AccesoDatoException ae) {
            System.out.println("Generica: " + ae.getMessage());
            ae.printStackTrace();
        }
    }

}

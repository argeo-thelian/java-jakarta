package org.arthe.poointerfaces.repositorio.lista;

import org.arthe.poointerfaces.modelo.Cliente;
import org.arthe.poointerfaces.repositorio.AbstractaListRepositorio;
import org.arthe.poointerfaces.repositorio.Direccion;
import org.arthe.poointerfaces.repositorio.exceptions.LecturaAccesoDatoException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listOrdenada = new ArrayList<>(this.dataSource);
        listOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC){
                resultado = getResultado(campo, a, b);
            } else if (dir == Direccion.DESC){
                resultado = getResultado(campo, b, a);
            }
            return resultado;

        });
        return listOrdenada;
    }

    public static int getResultado(@NotNull String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo){
            case "id":
                resultado = a.getId().compareTo(b.getId());
                break;
            case "nombre":
                resultado = a.getNombre().compareTo(b.getNombre());
                break;
            case "apellido":
                resultado = a.getApellido().compareTo(b.getApellido());
                break;
            default:
                break;
        }
        return resultado;
    }
}

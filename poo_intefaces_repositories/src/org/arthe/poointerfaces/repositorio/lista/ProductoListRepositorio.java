package org.arthe.poointerfaces.repositorio.lista;

import org.arthe.poointerfaces.modelo.Cliente;
import org.arthe.poointerfaces.modelo.Producto;
import org.arthe.poointerfaces.repositorio.AbstractaListRepositorio;
import org.arthe.poointerfaces.repositorio.Direccion;
import org.arthe.poointerfaces.repositorio.exceptions.LecturaAccesoDatoException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {
    @Override
    public void editar(Producto producto) throws LecturaAccesoDatoException {
        Producto p = this.porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listOrdenada = new ArrayList<>(this.dataSource);
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

    public static int getResultado(@NotNull String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo){
            case "id":
                resultado = a.getId().compareTo(b.getId());
                break;
            case "descripcion":
                resultado = a.getDescripcion().compareTo(b.getDescripcion());
                break;
            case "precio":
                resultado = a.getPrecio().compareTo(b.getPrecio());
                break;
            default:
                break;
        }
        return resultado;
    }

}

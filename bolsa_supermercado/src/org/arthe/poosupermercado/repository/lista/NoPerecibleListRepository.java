package org.arthe.poosupermercado.repository.lista;

import org.arthe.poosupermercado.models.NoPerecible;
import org.arthe.poosupermercado.repository.AbstractaListRespository;
import org.arthe.poosupermercado.repository.Direccion;

import java.util.ArrayList;
import java.util.List;

public class NoPerecibleListRepository extends AbstractaListRespository<NoPerecible> {

    @Override
    public void editar(NoPerecible noPerecible) {
        super.editar(noPerecible);
        NoPerecible n = this.porId(noPerecible.getId());
        n.setCalorias(noPerecible.getCalorias());
        n.setContenido(noPerecible.getContenido());
    }

    @Override
    public List<NoPerecible> listar(String campo, Direccion dir) {
        List<NoPerecible> listOrdenada = new ArrayList<>(this.dataSource);
        listOrdenada.sort((a,b)-> getResultado(dir, campo, a, b));
        return listOrdenada;
    }

    private static int getResultado(Direccion dir, String campo, NoPerecible a, NoPerecible b) {
        return dir == Direccion.ASC ? getOrderRes(campo, a, b) : getOrderRes(campo, b, a);
    }

    private static int getOrderRes(String campo, NoPerecible a, NoPerecible b) {
        int resultado = 0;
        switch (campo){
            case "id":
                resultado = a.getId().compareTo(b.getId());
                break;
            case "nombre":
                resultado = a.getNombre().compareTo(b.getNombre());
                break;
            case "precio":
                resultado = a.getPrecio().compareTo(b.getPrecio());
                break;
            case "calorias":
                resultado = a.getCalorias().compareTo(b.getCalorias());
                break;
            case "contenido":
                resultado = a.getContenido().compareTo(b.getContenido());
                break;
            default:
                break;
        }
        return resultado;
    }
}

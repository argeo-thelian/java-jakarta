package org.arthe.poosupermercado.repository.lista;

import org.arthe.poosupermercado.models.Lacteo;
import org.arthe.poosupermercado.repository.AbstractaListRespository;
import org.arthe.poosupermercado.repository.Direccion;

import java.util.ArrayList;
import java.util.List;

public class LacteoListRepository extends AbstractaListRespository<Lacteo> {

    @Override
    public void editar(Lacteo lacteo) {
        super.editar(lacteo);
        Lacteo l = this.porId(lacteo.getId());
        l.setCantidad(lacteo.getCantidad());
        l.setProteinas(lacteo.getProteinas());
    }

    @Override
    public List<Lacteo> listar(String campo, Direccion dir) {
        List<Lacteo> listOrdenada= new ArrayList<>(this.dataSource);
        listOrdenada.sort((a,b)-> getResultado(dir,campo,a, b));
        return listOrdenada;
    }

    private static int getResultado(Direccion dir, String campo, Lacteo a, Lacteo b) {
        return dir == Direccion.ASC ? getOrderRes(campo, a, b) : getOrderRes(campo, b, a);
    }

    public static int getOrderRes(String campo, Lacteo a, Lacteo b){
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
            case "cantidad":
                resultado = a.getCantidad().compareTo(b.getCantidad());
                break;
            case "proteinas":
                resultado = a.getProteinas().compareTo(b.getProteinas());
                break;
            default:
                break;
        }
        return resultado;
    }

}

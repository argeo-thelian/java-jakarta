package org.arthe.poosupermercado.repository.lista;

import org.arthe.poosupermercado.models.Limpieza;
import org.arthe.poosupermercado.repository.AbstractaListRespository;
import org.arthe.poosupermercado.repository.Direccion;

import java.util.ArrayList;
import java.util.List;

public class LimpiezaListRepository extends AbstractaListRespository<Limpieza> {
    @Override
    public void editar(Limpieza limpieza) {
        super.editar(limpieza);
        Limpieza l = this.porId(limpieza.getId());
        l.setComponentes(limpieza.getComponentes());
        l.setLitros(limpieza.getLitros());
    }

    @Override
    public List<Limpieza> listar(String campo, Direccion dir) {
        List<Limpieza> listOrdenada = new ArrayList<>(this.dataSource);
        listOrdenada.sort((a,b)->getResultado(dir, campo, a, b));
        return listOrdenada;
    }

    private static int getResultado(Direccion dir, String campo, Limpieza a, Limpieza b) {
        return dir == Direccion.ASC ? getOrderRes(campo, a, b) : getOrderRes(campo, b, a);
    }

    private static int getOrderRes(String campo, Limpieza a, Limpieza b) {
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
            case "componentes":
                resultado = a.getComponentes().compareTo(b.getComponentes());
                break;
            case "litros":
                resultado = a.getLitros().compareTo(b.getLitros());
                break;
            default:
                break;
        }
        return resultado;
    }

}

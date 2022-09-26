package org.arthe.poosupermercado.repository.lista;

import org.arthe.poosupermercado.models.Fruta;
import org.arthe.poosupermercado.repository.AbstractaListRespository;
import org.arthe.poosupermercado.repository.Direccion;

import java.util.ArrayList;
import java.util.List;

public class FrutaListRepository extends AbstractaListRespository<Fruta> {
    @Override
    public void editar(Fruta fruta) {
        super.editar(fruta);
        Fruta f = this.porId(fruta.getId());
        f.setPeso(fruta.getPeso());
        f.setColor(fruta.getColor());
    }

    @Override
    public List<Fruta> listar(String campo, Direccion dir) {
        List<Fruta> listOrdenada = new ArrayList<>(this.dataSource);
        listOrdenada.sort((a,b)-> getResultado(dir, campo, a, b));
        return listOrdenada;
    }

    public static int getResultado(Direccion dir,String campo,Fruta a,Fruta b) {
        return dir == Direccion.ASC ? getOrderRes(campo, a, b) : getOrderRes(campo, b, a);
    }
    public static int getOrderRes(String campo, Fruta a, Fruta b){
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
            case "peso":
                resultado = a.getPeso().compareTo(b.getPeso());
                break;
            case "color":
                resultado = a.getColor().compareTo(b.getColor());
                break;
            default:
                break;
        }
        return resultado;
    }
}

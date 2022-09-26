package org.arthe.poosupermercado.repository;

import org.arthe.poosupermercado.models.Producto;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRespository<T extends Producto> implements OrdenablePaginableCrudRespository<T> {
    protected List<T> dataSource;

    public AbstractaListRespository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {return dataSource;}

    @Override
    public T porId(Integer id) {
        T resultado = null;
        for (T t: dataSource){
            if (t.getId() !=null && t.getId().equals(id)){
                resultado = t;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void crearVarios(T[] t){
        for (T tt : t){
            this.crear(tt);
        }
    }

    @Override
    public void editar(T tEdit) {
        T t = this.porId(tEdit.getId());
        t.setNombre(tEdit.getNombre());
        t.setPrecio(tEdit.getPrecio());
    }

    @Override
    public void eliminar(Integer id) {this.dataSource.remove(this.porId(id));}

    @Override
    public int total() {return this.dataSource.size();}

    @Override
    public List<T> listar(int desde, int hasta) {return dataSource.subList(desde,hasta);}
}

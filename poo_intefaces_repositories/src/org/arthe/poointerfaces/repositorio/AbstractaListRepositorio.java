package org.arthe.poointerfaces.repositorio;

import org.arthe.poointerfaces.modelo.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements  OrdenablePaginableCrudRepositorio<T>{
    protected List<T> dataSource;

    public AbstractaListRepositorio(){
        this.dataSource = new ArrayList<>();

    }
    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id){
        T resultado = null;
        for (T t: dataSource){
            if(t.getId() != null && t.getId().equals(id)){
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
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

}

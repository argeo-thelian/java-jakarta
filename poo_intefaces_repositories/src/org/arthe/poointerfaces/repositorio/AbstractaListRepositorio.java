package org.arthe.poointerfaces.repositorio;

import org.arthe.poointerfaces.modelo.BaseEntity;
import org.arthe.poointerfaces.repositorio.exceptions.EscrituraAccesoDatoException;
import org.arthe.poointerfaces.repositorio.exceptions.LecturaAccesoDatoException;
import org.arthe.poointerfaces.repositorio.exceptions.RegistroDuplicadoAccesoDatoException;

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
    public T porId(Integer id) throws LecturaAccesoDatoException{
        if (id == null || id <= 0){
            throw new LecturaAccesoDatoException("Id inválido debe ser > 0");
        }

        T resultado = null;
        for (T t: dataSource){
            if(t.getId() != null && t.getId().equals(id)){
                resultado = t;
                break;
            }
        }

        if(resultado == null){
            throw new LecturaAccesoDatoException("No existe el registro con id: " + id);
        }
        return resultado;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException{
        if (t == null){
            throw  new EscrituraAccesoDatoException("Error al insertar un objeto null");
        }
        if (this.dataSource.contains(t)){
            throw new RegistroDuplicadoAccesoDatoException("Error el objeto con id: " + t.getId() +
                    " existe en el repositorio");
        }
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
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

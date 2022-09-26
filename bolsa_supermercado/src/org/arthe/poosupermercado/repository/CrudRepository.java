package org.arthe.poosupermercado.repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> listar();
    T porId(Integer id);
    void crear(T t);
    void crearVarios(T[] t);
    void editar(T t);
    void eliminar(Integer id);
}

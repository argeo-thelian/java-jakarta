package org.arthe.poosupermercado.repository;

import java.util.List;

public interface OrdenableRepository<T> {
    List<T> listar(String campo, Direccion dir);
}

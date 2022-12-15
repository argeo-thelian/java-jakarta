package com.arthe.apiservlet.webapp.headers.services;

import com.arthe.apiservlet.webapp.headers.models.Categoria;
import com.arthe.apiservlet.webapp.headers.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    void save(Producto producto);
    void eleminar(Long id);
    List<Categoria> findAllCategoria();
    Optional<Categoria> findByIdCategoria(Long id);

}

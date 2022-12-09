package com.arthe.apiservlet.webapp.headers.services;

import com.arthe.apiservlet.webapp.headers.models.Producto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductoServiceImpl implements ProductoService {
    @Override
    public List<Producto> findAll() {
        return Arrays.asList(
                new Producto(1L, "notebook", "computacion",300),
                new Producto(2L, "mesa", "officina",100),
                new Producto(3L, "silla", "officina",200),
                new Producto(4L, "teclado", "comp   utacion",100),
                new Producto(5L, "mouse", "computacion",120)
        );
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return findAll().stream().filter(p -> p.getId().equals(id)).findAny();
    }
}

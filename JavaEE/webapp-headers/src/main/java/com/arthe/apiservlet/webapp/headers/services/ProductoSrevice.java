package com.arthe.apiservlet.webapp.headers.services;

import com.arthe.apiservlet.webapp.headers.models.Producto;

import java.util.List;

public interface ProductoSrevice {

    List<Producto> findAll();

}

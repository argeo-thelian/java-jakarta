package com.arthe.poointerfaces.respositorio;

import com.arthe.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();
    Cliente porId(Integer id);
}

package org.arthe.poointerfaces.repositorio;

import org.arthe.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente>  listar(int desde, int hasta);
}

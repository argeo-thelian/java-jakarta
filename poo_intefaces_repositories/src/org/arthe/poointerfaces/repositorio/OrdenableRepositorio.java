package org.arthe.poointerfaces.repositorio;

import org.arthe.poointerfaces.modelo.Cliente;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);


}

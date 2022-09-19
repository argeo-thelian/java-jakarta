package org.arthe.poointerfaces.repositorio;

import org.arthe.poointerfaces.modelo.Cliente;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements  OrdenablePaginableCrudRepositorio{
    private List<Cliente> dataSource;

    public ClienteListRepositorio(){
        this.dataSource = new ArrayList<>();

    }
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listOrdenada = new ArrayList<>(this.dataSource);
        listOrdenada.sort((a, b) -> {
                int resultado = 0;
                if (dir == Direccion.ASC){
                    resultado = getResultado(campo, a, b);
                } else if (dir == Direccion.DESC){
                    resultado = getResultado(campo, b, a);
                }
                return resultado;

        });
        return listOrdenada;
    }

    public static int getResultado(@NotNull String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo){
            case "id":
                resultado = a.getId().compareTo(b.getId());
                break;
            case "nombre":
                resultado = a.getNombre().compareTo(b.getNombre());
                break;
            case "apellido":
                resultado = a.getApellido().compareTo(b.getApellido());
                break;
            default:
                break;
        }
        return resultado;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente getClient = null;
        for(Cliente cli : dataSource){
            if (cli.getId()!=null && cli.getId().equals(id)){
                getClient = cli;
                break;
            }
        }
        return getClient;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}

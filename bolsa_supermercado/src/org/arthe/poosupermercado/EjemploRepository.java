package org.arthe.poosupermercado;

import org.arthe.poosupermercado.models.*;
import org.arthe.poosupermercado.repository.OrdenablePaginableCrudRespository;
import org.arthe.poosupermercado.repository.lista.FrutaListRepository;
import org.arthe.poosupermercado.repository.lista.LacteoListRepository;
import org.arthe.poosupermercado.repository.lista.LimpiezaListRepository;
import org.arthe.poosupermercado.repository.lista.NoPerecibleListRepository;
import org.arthe.poosupermercado.repository.utils.Imprimible;

import java.util.List;

public class EjemploRepository extends Imprimible {

    public static void main(String[] args) {
        OrdenablePaginableCrudRespository<Fruta> repoFruta = new FrutaListRepository();
        OrdenablePaginableCrudRespository<Lacteo> repoLacteo = new LacteoListRepository();
        OrdenablePaginableCrudRespository<Limpieza> repoLimpieza = new LimpiezaListRepository();
        OrdenablePaginableCrudRespository<NoPerecible> repoNoPerecible = new NoPerecibleListRepository();

        BolsaSupermercado<Producto> bolsaSupermercado = new BolsaSupermercado<>();

        Fruta[] frutaCrear = {
            new Fruta("Fresa", 2.0, 0.34, "Rojo"),
            new Fruta("Platano", 2.0, 0.34, "Amarillo"),
            new Fruta("Mango", 2.0, 0.34, "Mango"),
            new Fruta("Manzana", 2.0, 0.34, "Rojo"),
            new Fruta("Kiwui", 2.0, 0.34, "Cafe y verde")
        };

        List<Fruta> frutas = repoFruta.listar();
        repoFruta.crearVarios(frutaCrear);
        imprimible(frutas);

        Fruta fresaActua = new Fruta("Fresa", 4.4, 0.45, "Roja y verde");
        fresaActua.setId(1);
        repoFruta.editar(fresaActua);
        imprimible(frutas);

        Lacteo[] lacteoCrear = {
            new Lacteo("Leche",23.0,300,46),
            new Lacteo("Crema",13.0,500,43),
            new Lacteo("Queso",50.0,250,60),
            new Lacteo("Manchego",25.0,125,20)
        };
        List<Lacteo> lacteos = repoLacteo.listar();
        repoLacteo.crearVarios(lacteoCrear);
        imprimible(lacteos);

        Limpieza[] limpiezaCrear = {
            new Limpieza("Frezco", 24.0,"Cloro", 1.0),
            new Limpieza("Bannis", 35.0,"perfume", 2.0),
            new Limpieza("Fabulozo", 18.0,"Cloro, perfume", 1.0),
            new Limpieza("Pino", 23.0,"Olorante", 3.5)
        };
        List<Limpieza> limpiezas = repoLimpieza.listar();
        repoLimpieza.crearVarios(limpiezaCrear);
        imprimible(limpiezas);

        NoPerecible[] noPerecible = {
                new NoPerecible("Nuez",50.0,100,400),
                new NoPerecible("Cacahuate",4.0,100,40),
                new NoPerecible("Avena", 10.0,100,20)
        };

        List<NoPerecible> noPerecibles = repoNoPerecible.listar();
        repoNoPerecible.crearVarios(noPerecible);
        imprimible(noPerecibles);

        bolsaSupermercado.addProducto(new Fruta("Coco",2.0,23.0,"Cafe"))
                .addProducto(new Lacteo("Phidadelfia", 13.0, 3,320));
        bolsaSupermercado.separaArray(frutas)
                .separaArray(lacteos)
                .separaArray(limpiezas)
                .separaArray(noPerecibles);
        imprimible(bolsaSupermercado.getProductos());
    }

    //public static <T extends Producto> OrdenablePaginableCrudRespository<T>
    // crearVarios(T[] p,OrdenablePaginableCrudRespository<T> repo){
    //     for (T pp : p){
    //         repo.crear(pp);
    //     }
    //     return repo;
    // }

}

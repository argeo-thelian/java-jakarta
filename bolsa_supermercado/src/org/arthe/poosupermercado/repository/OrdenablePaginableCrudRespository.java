package org.arthe.poosupermercado.repository;

public interface OrdenablePaginableCrudRespository<T> extends OrdenableRepository<T>,
        PaginableRepository<T>, CrudRepository<T>, ContableRepository {
}

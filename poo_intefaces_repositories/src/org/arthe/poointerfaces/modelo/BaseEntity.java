package org.arthe.poointerfaces.modelo;

import java.util.Objects;

public class BaseEntity {
    protected Integer id;
    private static int ultimoId;

    public BaseEntity() {
        this.id = ++ ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity be = (BaseEntity) o;
        return Objects.equals(id, be.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

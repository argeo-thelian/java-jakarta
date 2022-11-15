package com.arthe.patrones.decorado.cafe.decorador;

import com.arthe.patrones.decorado.cafe.Configurable;

abstract public class CafeDecorador implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }

}

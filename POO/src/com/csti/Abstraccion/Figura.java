package com.csti.Abstraccion;

public abstract class Figura {
    protected Double x;
    protected Double y;

    protected Figura(){
    }

    protected  Figura(Double x, Double y){
        this.x=x;
        this.y=y;
    }
    public abstract Double CalcularArea();
}

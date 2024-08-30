package com.csti.Abstraccion;

public class Circulo extends Figura{
    private Double radio;

    public Circulo(){

    }
    public Circulo(Double radio, Double x, Double y){
        super(x,y);
        this.radio=radio;
    }
    @Override
    public Double CalcularArea() {
        Double pi = 3.14;
        Double Resultado = pi*radio*radio;
        return Resultado;
    }

}

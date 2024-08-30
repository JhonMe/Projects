package com.csti.Abstraccion;

public class Cuadrado extends Figura{
    private Double lado;

    public Cuadrado(){

    }
    public Cuadrado(Double lado, Double x, Double y){
        super(x,y);
        this.lado=lado;

    }
    @Override
    public Double CalcularArea() {
        Double Resultado = lado*lado;
        return Resultado;
    }
}

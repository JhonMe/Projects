package com.csti.calculadora1;

public class calculadora1 {
    public Float operacionSuma(Float num3, Float num4){
        return num3+num4;
    }
    public Float operacionResta(Float num3, Float num4){
        return num3-num4;
    }
    public Float operacionMulti(Float num3, Float num4){
        return num3*num4;
    }
    public Float operacionDivicion(Float num3, Float num4){
        return num3/num4;
    }
    public void menu (){
        System.out.println("Ingrese la operacion que quiere realizar");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Divicion");
    }

}

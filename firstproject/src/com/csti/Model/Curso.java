package com.csti.Model;

public class Curso {
    public int Numero_camiseta;
    public int grado;
    public  String Nombre;
    public  String Apellido;
    public String Nombre_Equipo;

    public  Curso(){

    }
    public Curso(int Nombre_camiseta, int grado, String Nombre, String Apellido, String Nombre_Equipo){
        this.Numero_camiseta = Nombre_camiseta;
        this.grado = grado;
        this.Nombre =Nombre;
        this.Apellido=Apellido;
        this.Nombre_Equipo = Nombre_Equipo;
    }
}

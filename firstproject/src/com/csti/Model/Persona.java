package com.csti.Model;

public class Persona {
    //atributo
    public String Nombre;
    public int edad;
    public String Direccion;
    public String Departamento;

    public Persona(){

    }
    public Persona(/*parametro*/String Nombre, int edad, String Direccion, String Departamento){
        this.Nombre=Nombre;
        this.edad=edad;
        this.Direccion=Direccion;
        this.Departamento=Departamento;

    }
}

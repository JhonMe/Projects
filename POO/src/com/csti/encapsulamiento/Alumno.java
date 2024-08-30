package com.csti.encapsulamiento;

public class Alumno {
    private int Id;
    private  String Nombre;
    private  String Apellido;

    public Alumno(){

    }
    public Alumno(int Id, String Nombre, String Apellido){
        this.Id=Id;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
    }
    public int getId(){
        return Id;
    }
    public  void SetId( int id){
        this.Id=id;
    }
    public String getNombre(){
        return Nombre;
    }
    public  void SetNombre( String nombre){
        this.Nombre=nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public  void SetApellido( String apellido){
        this.Apellido=Apellido;
    }
}

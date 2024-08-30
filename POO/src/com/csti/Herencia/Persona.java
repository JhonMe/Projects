package com.csti.Herencia;

public class Persona {
    int Id;
    int DNI;
    String Nombre;
    String Apellido;
    String Domicilio;
    String Telefono;

    public Persona(){

    }
    public Persona(int Id, int DNI, String Nombre, String Apellido, String Domicilio, String Telefonoo){
        this.Id = Id;
        this.DNI=DNI;
        this.Nombre= Nombre;
        this.Apellido=Apellido;
        this.Domicilio=Domicilio;
        this.Telefono=Telefonoo;
    }
    public int getId(){
      return Id;
    }
    public  void SetId( int id){
        this.Id=id;
    }
    public int getDNI(){
        return DNI;
    }
    public  void SetDNI( int dni){
        this.DNI=dni;
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
        this.Apellido=apellido;
    }
    public String getDomicilio(){
        return Domicilio;
    }
    public  void SetDomicilio( String domicilio){
        this.Domicilio=domicilio;
    }
    public String getTelefono(){
        return Telefono;
    }
    public  void SetId( String telefono){
        this.Telefono=telefono;
    }

}

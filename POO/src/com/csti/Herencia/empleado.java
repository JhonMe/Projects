package com.csti.Herencia;

public class empleado extends Persona{
    int num_legado;
    String Cargo;
    Double Sueldo;

    public empleado(){

    }
    public empleado(int num_legado, String Cargo, Double Sueldo, int Id, int DNI, String Nombre, String Apellido,
                    String Domiciio, String Telefono){
        super(Id, DNI, Nombre, Apellido, Domiciio, Telefono);
        this.num_legado=num_legado;
        this.Cargo=Cargo;
        this.Sueldo=Sueldo;
    }
    public int getNum_legado(){
        return num_legado;
    }
    public  void SetNum_legado( int num_legado){
        this.num_legado=num_legado;
    }
    public String getCargo(){
        return Cargo;
    }
    public  void SetCargo( String Cargo){
        this.Cargo=Cargo;
    }
    public Double getSueldo(){
        return Sueldo;
    }
    public  void SetSueldo( Double Sueldo){
        this.Sueldo=Sueldo;
    }
}

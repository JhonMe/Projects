package com.csti.Poliformismo;

import com.csti.Herencia.Persona;

public class Jefe extends Persona {
    int id_Jefe;
    String Departamento_Jefe;

    public Jefe(){

    }
    public Jefe(int id_Jefe, String Departamento_Jefe, int Id, int DNI, String Nombre, String Apellido,
                String Domiciio, String Telefono){
        super(Id,DNI,Nombre,Apellido,Domiciio,Telefono);
        this.id_Jefe=id_Jefe;
        this.Departamento_Jefe=Departamento_Jefe;
    }
    public int getId_Jefe(){
        return id_Jefe;
    }
    public  void Setid_Jefe( int id_Jefe){
        this.id_Jefe=id_Jefe;
    }
    public String getDepartamento_Jefe(){
        return Departamento_Jefe;
    }
    public  void SetCargo( String Departamento_Jefe){
        this.Departamento_Jefe=Departamento_Jefe;
    }
}

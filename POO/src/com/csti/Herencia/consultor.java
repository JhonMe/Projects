package com.csti.Herencia;

public class consultor extends Persona{
    String Nombre_Consultora;
    int Numero_Consultor;
     public consultor(){

     }
     public consultor(String Nombre_Consultora, int Numero_Consultor, int Id, int DNI, String Nombre, String Apellido,
                      String Domiciio, String Telefono){
         super(Id, DNI, Nombre, Apellido, Domiciio, Telefono);
         this.Numero_Consultor=Numero_Consultor;
         this.Nombre_Consultora=Nombre_Consultora;
     }
    public String getNombre_Consultora(){
        return Nombre_Consultora;
    }
    public  void SetNombre_Consultora( String Nombre_Consultora){
        this.Nombre_Consultora=Nombre_Consultora;
    }
    public int Numero_Consiltor(){
        return Numero_Consultor;
    }
    public  void SetNumero_Consultor( int Numero_Consultor){
        this.Numero_Consultor=Numero_Consultor;
    }
}

package csti.com.domian;

public class Politicos {
    protected String Nombre;
    protected char Genero;
    protected int Edad;

    public  Politicos(){

    }

    public Politicos( String Nombre, char Genero, int Edad){
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Edad = Edad;
    }

    public String getNombre(){
        return this.Nombre;
    }
    public void setEdad(String Nombre){
        this.Nombre = Nombre;
    }

    public  char getGenero(){
        return  this.Genero;
    }
    public  void  setGenero(char Genero){
        this.Genero = Genero;
    }

    public int getEdad(){
        return this.Edad;
    }
    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public String toString(){
        return "Nombre: "+Nombre+" Genero: "+Genero+" Edad: "+Edad;
    }
}

package Herencia;

public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    /**
     * sobre carga de constructores porque twnwmoa 3 constructores de Persona
     */
    //constructor vacio
    public Persona(){

    }
    //constructor con datos
    public Persona(String nombre){
        this.nombre=nombre;
    }
    //constructor con datos
    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre= nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion=direccion;
    }

    /**
     *  metodos set y get de cada atributo
     */

    public String getNombre(){
        return nombre;
    }
    public void setNombre( String nombre){
        this.nombre=nombre;
    }
    public char getGenero(){
        return genero;
    }
    public void setGenero( char genero){
        this.genero=genero;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad( int edad){
        this.edad=edad;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion( String direccion){
        this.direccion= direccion;
    }

    @Override
    public String toString(){
        return "Persona ["+ "Nombre: "+nombre+" Genero: "+genero+" Edad: "+edad+" Direccion; "+direccion+"]";
    }
}

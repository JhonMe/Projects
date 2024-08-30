package csti.com.domian;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;

    public Persona(String Nombre, String Apellido, int Edad){
        this.Nombre = Nombre;
        this.Apellido=Apellido;
        this.Edad=Edad;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellido(){
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public int getEdad(){
        return this.Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString(){
        return "Mi nombre es "+Nombre+" y mi apellido es "+ Apellido + " tengo "+Edad+"años";
    }
}

package arreglos.Domian;

public class Persona {
    private String Nombre;

    public Persona(String Nombre){
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    @Override
    public String toString(){
        return "Nombre es: "+Nombre+"; "+super.toString();
    }
}

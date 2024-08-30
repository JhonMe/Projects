package encapsulamiento.dominio;

public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //recuerda que el constructor tiene el mismo nombre que la clase
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //metodo
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public boolean isEliminado(){
        return this.eliminado;
    }
    public void setEliminado(boolean eliminado){
         this.eliminado = eliminado;
    }

    public String toString() {
        return "Persona [ Nombre: " + this.nombre +
                ", Sueldo " + this.sueldo +
                ", Eliminado "+this.eliminado + "]";
    }
}

package ForEch;

public class NombreObject {
    private String nombre;

    public NombreObject(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return "Nombre:"+nombre;
    }
}

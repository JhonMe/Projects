package Matris.Domian;

public class PersMatriz {
    private String Nombre;

    public PersMatriz(String Nombre){
        this.Nombre=Nombre;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String toString(){
        return "Mi nombre es "+Nombre;
    }
}

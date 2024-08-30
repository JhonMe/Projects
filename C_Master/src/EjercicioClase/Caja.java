package EjercicioClase;

public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja(){
        System.out.println("Constructor vacio");
    }
    public int Caja(int ancho, int alto, int profundo){
        this.ancho =ancho;
        this.alto = alto;
        this.profundo=profundo;
        return ancho*alto*profundo;
    }
}

package csti.corp.com.Domian.ClassPad;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    public Monitor(){
        this.idMonitor=++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamanio){
        this();
        this.marca=marca;
        this.tamanio=tamanio;
    }

    public  int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    public String toString(){
        return "Id es."+idMonitor+" marca: "+marca+" tamaño: "+tamanio;
    }
}

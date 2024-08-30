package csti.com.domian;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;

    public Monitor(){
        this.idMonitor =++Monitor.contadorMonitor;
    }
    public Monitor(String marca, double tamanio){
        this();
        this.marca=marca;
        this.tamanio=tamanio;
    }

    public int getContadoridMonitor() {
        return this.idMonitor;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public double getTamanio(){
        return this.tamanio;
    }
    public void setTamanio(double tamanio){
        this.tamanio=tamanio;
    }

    @Override
    public String toString(){
        return "El Id es "+idMonitor+"y la marca de la compu es: "+marca+" y el tamaño es: "+tamanio;
    }
}

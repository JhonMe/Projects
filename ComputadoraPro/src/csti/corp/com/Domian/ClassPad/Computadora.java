package csti.corp.com.Domian.ClassPad;


import csti.corp.com.Domian.ClassDisE.*;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    public Computadora(){
        this.idComputadora=++Computadora.contadorComputadoras;
    }
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre=nombre;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }



    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Monitor getMonitor() {
        return this.monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public Teclado getTeclado() {
        return this.teclado;
    }
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    public Raton getRaton() {
        return this.raton;
    }
    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public String toString(){
        return "ID: "+idComputadora+" nombre: "+nombre+" Monitor: "+monitor+" teclado: "+teclado+" raton: "+raton;
    }
}

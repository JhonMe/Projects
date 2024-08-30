package csti.com.domian;


public class computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorId;

    private computadora(){
        this.idComputadora =++computadora.contadorId;
    }
    public computadora(String nombre,Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre=nombre;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }


    public int getContadorId() {
        return this.contadorId;
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

    @Override
    public String toString(){
        return "Mi id es: "+idComputadora+" t mi nombre es: "+nombre+
                " monitor: "+monitor+" teclado: "+teclado+" raton: "+raton;
    }
}

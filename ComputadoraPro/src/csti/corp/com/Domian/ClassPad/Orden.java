package csti.corp.com.Domian.ClassPad;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private int contadorOrdenes;
    private static int contadorComputadoras;
    private static int MAX_COMPUTADORAS=10;

    public Orden(){
        this.idOrden=++Orden.contadorComputadoras;
        this.computadoras= new Computadora[MAX_COMPUTADORAS];
    }
    public void agregarComputadora(Computadora computadora){
        if (this.contadorOrdenes<Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorOrdenes++]=computadora;
        }else {
            System.out.println("Exediste el limite de computadpras: "+Orden.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("El id es: "+idOrden);
        System.out.println("Este es el orden: ");
        for (int i=0;i<this.contadorOrdenes; i++){
            System.out.println(computadoras[i]);
        }
    }
}

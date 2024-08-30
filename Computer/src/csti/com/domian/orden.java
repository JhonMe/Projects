package csti.com.domian;

public class orden {
    private final int idOrden;
    private computadora computadoras[];
    private static int contadorComputadora;
    private static final int MAX_COMPUTADORA=10;
    private int ContadorComputadoras;


    public orden(){
        this.idOrden=++orden.contadorComputadora;
        this.computadoras=new computadora[orden.MAX_COMPUTADORA];
    }
    public void agregarComputadora(computadora computadora){
        if (this.ContadorComputadoras<orden.MAX_COMPUTADORA){
            this.computadoras[this.ContadorComputadoras++]=computadora;
        }else {
            System.out.println("Alcansaste el limite: "+orden.MAX_COMPUTADORA);
        }
        return;
    }
    public void mostrarOrden(){
        System.out.println("El numero de orden es: "+this.idOrden);
        System.out.println("El producto add es: ");
        for (int i =0; i<this.ContadorComputadoras; i++){
            System.out.println(this.computadoras[i]);
        }
    }
}

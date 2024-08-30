public class Orden {
    private int idOden;
    private Producto productos[];
    private static int contadorOrden;
    private int contadorProducto;
    private static int MAX_PEODUCTO=10;

    public Orden(){
        this.idOden=++Orden.contadorOrden;
        this.productos=new Producto[MAX_PEODUCTO];
    }
    public void agregarProducto(Producto producto){
        if (this.contadorProducto<Orden.MAX_PEODUCTO){
            this.productos[this.contadorProducto++]=producto;
        }else {
            System.out.println("Has alcanzado el limite de productos"+Orden.MAX_PEODUCTO);
        }
    }
    private double calcularTotal(){
        double total=0;
        for (int i=0; i<this.contadorProducto; i++){
            total+=this.productos[i].getPrecio();
        }
        return total;
    }
    public void mostrarProducto(){
        System.out.println("Id del producto es: "+this.idOden);
        double totalOrden =this.calcularTotal();
        System.out.println("El precio total es: "+totalOrden);
        System.out.println("El orden del preducto es: ");
        for (int i=0; i<this.contadorProducto; i++){
            System.out.println(this.productos[i]);
        }
    }
}

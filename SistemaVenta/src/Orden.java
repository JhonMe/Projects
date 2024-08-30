public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProducto;
    private static final int MAX_PRODUCTOS=10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    public void agregarProductos(Producto producto){
        if (this.contadorProducto<Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProducto++]=producto;
        }else {
            System.out.println("Superaste el limite de producto"+Orden.MAX_PRODUCTOS);
        }
    }
    private double calcularTotal(){
        double total=0;
        for (int i=0; i<this.contadorProducto; i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();

            //total += this.productos[i].getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Id es: "+this.idOrden);
        double totalOrden=this.calcularTotal();
        System.out.println("Total de orden es: "+totalOrden);
        System.out.println("Producto de la orden: ");
        for (int i=0; i<this.contadorProducto; i++){
            System.out.println(this.productos[i]);
        }
    }
}

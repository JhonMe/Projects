public class Producto {
    private final int idProducto;
    private String Nombre;
    private double Precio;
    private static int contadorProducto;

    private Producto(){
        this.idProducto =++Producto.contadorProducto;
    }
    public Producto(String Nombre, double Precio){
        this();
        this.Nombre=Nombre;
        this.Precio=Precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public double getPrecio() {
        return this.Precio;
    }
    public void setPrecio(double precio) {
        this.Precio = precio;
    }
    @Override
    public String toString(){
        return "Id: "+idProducto+" Nombre: "+Nombre+" Precio: "+Precio;
    }
}

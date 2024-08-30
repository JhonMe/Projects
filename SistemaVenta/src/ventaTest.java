public class ventaTest {
    public static void main(String[] args) {
        Producto producto1 = new  Producto("Mango", 13.4);
        Producto producto2 = new Producto("Papaya", 23.4);

        Orden orde1 = new Orden();
        orde1.agregarProductos(producto1);
        orde1.agregarProductos(producto2);
        orde1.mostrarOrden();
    }
}

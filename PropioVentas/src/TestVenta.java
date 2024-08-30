public class TestVenta {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pan",46.5);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.mostrarProducto();
    }
}

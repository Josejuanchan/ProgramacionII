public class Pedido {
    private Producto[] productos;

    public Pedido(Producto[] productos) {
        this.productos = productos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}

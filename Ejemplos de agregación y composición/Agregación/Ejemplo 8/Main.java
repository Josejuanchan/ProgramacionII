public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camiseta", 29.99);
        Producto producto2 = new Producto("Pantalón", 39.99);
        Producto producto3 = new Producto("Zapatos", 59.99);

        Producto[] productos = {producto1, producto2, producto3};

        Pedido pedido = new Pedido(productos);

        System.out.println("Productos en el pedido:");
        for (Producto producto : pedido.getProductos()) {
            System.out.println(producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println("Total: $" + pedido.calcularTotal());
    }
}
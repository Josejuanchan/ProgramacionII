public class Tienda {
    private String nombre;
    private Producto[] productos;

    public Tienda(String nombre, String[] nombresProductos, double[] preciosProductos) {
        this.nombre = nombre;
        this.productos = new Producto[nombresProductos.length];

        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Producto(nombresProductos[i], preciosProductos[i]);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }
}
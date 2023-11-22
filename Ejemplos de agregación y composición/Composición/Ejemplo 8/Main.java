public class Main {
   public static void main(String[] args) {
        String[] nombresProductos = {"Camisa", "Pantalón", "Zapatos"};
        double[] preciosProductos = {29.99, 49.99, 79.99};
        Tienda tienda = new Tienda("Tienda Cuidado Con El Perro", nombresProductos, preciosProductos);

        System.out.println("Información de la tienda:");
        System.out.println("Nombre: " + tienda.getNombre());
        System.out.println("Productos:");

        for (int i = 0; i < tienda.getProductos().length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + tienda.getProductos()[i].getNombre());
            System.out.println("Precio: $" + tienda.getProductos()[i].getPrecio());
        }
    }
}
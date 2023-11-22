public class Vehículo {
    protected String marca;
    protected int año;

    public Vehículo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + año);
    }
}
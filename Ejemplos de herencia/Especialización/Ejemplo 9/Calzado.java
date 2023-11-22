public class Calzado {
    protected String marca;

    public Calzado(String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca de calzado: " + marca);
    }
}
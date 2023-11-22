public class Camiseta extends Ropa {
    private String talla;

    public Camiseta(String color, String talla) {
        super(color);
        this.talla = talla;
    }

    public void mostrarTalla() {
        System.out.println("La talla de la camiseta es: " + talla);
    }
}
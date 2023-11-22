public class Ropa {
    protected String color;

    public Ropa(String color) {
        this.color = color;
    }

    public void mostrarColor() {
        System.out.println("El color de la prenda es: " + color);
    }
}
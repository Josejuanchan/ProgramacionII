public class Manzana extends Fruta {
    private String color;

    public Manzana(String tipo, String color) {
        super(tipo);
        this.color = color;
    }

    public void pelar() {
        System.out.println("Pelando la manzana de color " + color);
    }
}
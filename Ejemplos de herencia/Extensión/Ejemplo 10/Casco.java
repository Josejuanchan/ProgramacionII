public class Casco {
    protected String marca;
    protected String color;

    public Casco(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public void protegerCabeza() {
        System.out.println("El casco protege la cabeza del usuario.");
    }

    public void ajustarCorrea() {
        System.out.println("Se ajusta la correa del casco.");
    }
}
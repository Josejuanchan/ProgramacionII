public class Electrodoméstico {
    protected String marca;

    public Electrodoméstico(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("Encendiendo el electrodoméstico de marca " + marca);
    }
}
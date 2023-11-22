public class Electrodoméstico {
    protected String marca;

    public Electrodoméstico(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("Encendiendo el electrodoméstico.");
    }

    public void apagar() {
        System.out.println("Apagando el electrodoméstico.");
    }
}
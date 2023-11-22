public class Electrodoméstico {
    protected String marca;
    protected String modelo;

    public Electrodoméstico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("Encendiendo el electrodoméstico " + marca + " " + modelo);
    }
}
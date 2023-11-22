public class Computadora {
    protected String marca;
    protected String modelo;
    protected int capacidadRAM;

    public Computadora(String marca, String modelo, int capacidadRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadRAM = capacidadRAM;
    }

    public void encender() {
        System.out.println("Encendiendo la computadora...");
    }

    public void apagar() {
        System.out.println("Apagando la computadora...");
    }
}
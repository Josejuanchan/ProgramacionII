public class Dispositivo {
    protected String marca;

    public Dispositivo(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("Encendiendo el dispositivo: " + marca);
    }
}
public class Vehículo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehículo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void conducir() {
        System.out.println("Conduciendo el vehículo...");
    }
}
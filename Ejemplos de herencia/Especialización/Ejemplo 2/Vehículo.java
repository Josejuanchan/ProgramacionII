public class Vehículo {
    protected String marca;
    protected String modelo;

    public Vehículo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conducir() {
        System.out.println("Conduciendo el vehículo " + marca + " " + modelo);
    }
}

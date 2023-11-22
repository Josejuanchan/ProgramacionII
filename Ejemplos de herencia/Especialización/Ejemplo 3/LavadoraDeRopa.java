public class LavadoraDeRopa extends Electrodoméstico {
    private int capacidad;

    public LavadoraDeRopa(String marca, String modelo, int capacidad) {
        super(marca, modelo);
        this.capacidad = capacidad;
    }

    public void lavarRopa() {
        System.out.println("Lavando ropa con la lavadora de ropa " + marca + " " + modelo + " con capacidad de " + capacidad + " kg.");
    }
}
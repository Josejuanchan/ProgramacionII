public class CamiónDeCarga extends Vehículo {
    protected double capacidadCarga;

    public CamiónDeCarga(String marca, int año, double capacidadCarga) {
        super(marca, año);
        this.capacidadCarga = capacidadCarga;
    }

    public void mostrarCapacidadCarga() {
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}
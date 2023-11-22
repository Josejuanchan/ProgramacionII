public class Garaje extends Hangar {
    private int capacidadAutomoviles;

    public Garaje(int capacidadAviones, int capacidadAutomoviles) {
        super(capacidadAviones);
        this.capacidadAutomoviles = capacidadAutomoviles;
    }

    public void mostrarCapacidad() {
        System.out.println("Capacidad de aviones del hangar: " + capacidadAviones);
        System.out.println("Capacidad de automóviles del garaje: " + capacidadAutomoviles);
    }

    public void realizarMantenimientoAutomoviles() {
        System.out.println("Realizando mantenimiento a los automóviles del garaje.");
    }
}
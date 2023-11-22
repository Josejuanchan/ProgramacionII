public class Hangar {
    protected int capacidadAviones;

    public Hangar(int capacidadAviones) {
        this.capacidadAviones = capacidadAviones;
    }

    public void mostrarCapacidad() {
        System.out.println("Capacidad de aviones del hangar: " + capacidadAviones);
    }

    public void realizarMantenimientoAviones() {
        System.out.println("Realizando mantenimiento a los aviones del hangar.");
    }
}
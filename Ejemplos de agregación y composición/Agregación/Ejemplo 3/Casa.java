public class Casa {
    private String direccion;
    private Habitacion[] habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        habitaciones = new Habitacion[10];
    }

    public void agregarHabitacion(Habitacion habitacion, int posicion) {
        habitaciones[posicion] = habitacion;
    }
}
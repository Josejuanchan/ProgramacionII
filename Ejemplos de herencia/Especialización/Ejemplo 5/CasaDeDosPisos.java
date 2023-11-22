public class CasaDeDosPisos extends Edificio {
    private int númeroHabitaciones;

    public CasaDeDosPisos(String dirección, int númeroHabitaciones) {
        super(dirección);
        this.númeroHabitaciones = númeroHabitaciones;
    }

    public void mostrarHabitaciones() {
        System.out.println("Número de habitaciones de la casa de dos pisos: " + númeroHabitaciones);
    }
}
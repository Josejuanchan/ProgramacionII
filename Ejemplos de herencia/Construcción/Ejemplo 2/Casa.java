public class Casa extends Edificio {
    private int numHabitaciones;

    public Casa(String dirección, int numHabitaciones) {
        super(dirección);
        this.numHabitaciones = numHabitaciones;
    }

    public void mostrarInformación() {
        super.mostrarInformación();
        System.out.println("Es una casa con " + numHabitaciones + " habitaciones.");
    }
}
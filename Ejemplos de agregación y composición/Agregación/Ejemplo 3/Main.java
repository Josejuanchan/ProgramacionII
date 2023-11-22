

public class Main
{
	   public static void main(String[] args) {
        Casa casa = new Casa("Calle 10, Campeche");
        Habitacion habitacion1 = new Habitacion("Sala", 100);
        Habitacion habitacion2 = new Habitacion("Cocina", 50);
        casa.agregarHabitacion(habitacion1, 0);
        casa.agregarHabitacion(habitacion2, 1);
    }
}

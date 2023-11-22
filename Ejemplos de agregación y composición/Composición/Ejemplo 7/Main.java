public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Calle Principal 123", "Paola", 25);

        System.out.println("Información de la casa:");
        System.out.println("Dirección: " + casa.getDirección());
        System.out.println("Habitante: " + casa.getHabitante().getNombre());
        System.out.println("Edad del habitante: " + casa.getHabitante().getEdad());
    }
}
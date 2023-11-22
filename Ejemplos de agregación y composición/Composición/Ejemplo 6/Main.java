public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Dominique", "Calle Emiliano Zapata", "Ciudad de méxico", "País México");

        System.out.println("Información de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Dirección: " + persona.getDireccion().getCalle() + ", " +
                persona.getDireccion().getCiudad() + ", " + persona.getDireccion().getPaís());
    }
}
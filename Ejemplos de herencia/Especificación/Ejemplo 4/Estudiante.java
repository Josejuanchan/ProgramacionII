public class Estudiante extends Persona {
    private String universidad;

    public Estudiante(String nombre, int edad, String universidad) {
        super(nombre, edad);
        this.universidad = universidad;
    }

    public void mostrarUniversidad() {
        System.out.println("Soy estudiante de la universidad " + universidad + ".");
    }
}
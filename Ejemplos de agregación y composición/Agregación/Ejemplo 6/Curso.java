public class Curso {
    private String nombre;
    private Estudiante[] estudiantes;

    public Curso(String nombre, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
}

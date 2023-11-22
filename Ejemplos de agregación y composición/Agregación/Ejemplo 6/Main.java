public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Omar");
        Estudiante estudiante2 = new Estudiante("Luis");
        Estudiante estudiante3 = new Estudiante("Alfonso");

        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3};

        Curso curso = new Curso("Programación Java", estudiantes);

        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : curso.getEstudiantes()) {
            System.out.println(estudiante.getNombre());
        }
    }
}
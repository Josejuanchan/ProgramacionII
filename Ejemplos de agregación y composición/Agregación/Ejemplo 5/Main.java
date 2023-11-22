public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Rodrigo", 19);
        Estudiante estudiante2 = new Estudiante("Hannia", 19);
        Estudiante estudiante3 = new Estudiante("Ricardo", 24);

        Grupo grupo = new Grupo(3,'A', 5);

        grupo.agregarEstudiante(estudiante1);
        grupo.agregarEstudiante(estudiante2);
        grupo.agregarEstudiante(estudiante3);

        grupo.mostrarEstudiantes();
    }
}

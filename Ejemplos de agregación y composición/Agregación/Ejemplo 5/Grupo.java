public class Grupo {
    private int grado;
    private char grupo;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes = 0;

    public Grupo(int grado, char grupo, int capacidad) {
        this.grado = grado;
        this.grupo = grupo;
        estudiantes = new Estudiante[capacidad];
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            System.out.println("El grupo está completo, no se puede agregar más estudiantes.");
        }
    }
    
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en el grado " + grado + " Grupo " + grupo + " :");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            Estudiante estudiante = estudiantes[i];
            System.out.println("- " + estudiante.getNombre() + ", " + estudiante.getEdad() + " años");
        }
    }
}

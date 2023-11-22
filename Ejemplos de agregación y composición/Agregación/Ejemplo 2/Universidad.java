public class Universidad {
    private String nombre;
    private Estudiante[] estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        estudiantes = new Estudiante[10];
    }

    public void agregarEstudiante(Estudiante estudiante, int posicion) {
        estudiantes[posicion] = estudiante;
    }
    
    public Estudiante verDatosDelEstudiante(int posicion){
        
        return estudiantes[posicion];
        
    }

}
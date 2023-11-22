

public class Main
{
	public static void main(String[] args) {
        
        Universidad universidad = new Universidad("Universidad Autónoma de Campeche");
        Estudiante estudiante1 = new Estudiante("Juan", 20);
        Estudiante estudiante2 = new Estudiante("María", 21);
        universidad.agregarEstudiante(estudiante1, 0);
        universidad.agregarEstudiante(estudiante2, 1);
        
        System.out.println(universidad.verDatosDelEstudiante(0));
        
    }
}

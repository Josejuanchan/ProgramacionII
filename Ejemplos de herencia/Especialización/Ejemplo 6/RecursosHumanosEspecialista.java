public class RecursosHumanosEspecialista extends Jefe {
    public RecursosHumanosEspecialista(String nombre, String puesto, String departamento) {
        super(nombre, puesto, departamento);
    }

    public void reclutar() {
        System.out.println(nombre + " es un especialista en recursos humanos y está reclutando personal.");
    }

}
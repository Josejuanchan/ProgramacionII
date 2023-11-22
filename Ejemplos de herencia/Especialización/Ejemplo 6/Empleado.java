public class Empleado {
    protected String nombre;
    protected String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando como " + puesto);
    }
}
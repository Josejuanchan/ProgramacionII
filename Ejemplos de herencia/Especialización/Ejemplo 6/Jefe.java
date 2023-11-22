public class Jefe extends Empleado {
    private String departamento;

    public Jefe(String nombre, String puesto, String departamento) {
        super(nombre, puesto);
        this.departamento = departamento;
    }

    public void gestionar() {
        System.out.println(nombre + " es el jefe del departamento de " + departamento);
    }
}
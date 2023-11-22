public class Departamento {
    private String nombre;
    private Empleado[] empleados;
    private int cantidadEmpleados = 0;

    public Departamento(String nombre, int capacidad) {
        this.nombre = nombre;
        empleados = new Empleado[capacidad];

    }

    public void agregarEmpleado(Empleado empleado) {
        if (cantidadEmpleados < empleados.length) {
            empleados[cantidadEmpleados] = empleado;
            cantidadEmpleados++;
        } else {
            System.out.println("El departamento está completo, no se puede agregar más empleados.");
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        for (int i = 0; i < cantidadEmpleados; i++) {
            Empleado empleado = empleados[i];
            System.out.println("- " + empleado.getNombre() + ", " + empleado.getCargo());
        }
    }

}
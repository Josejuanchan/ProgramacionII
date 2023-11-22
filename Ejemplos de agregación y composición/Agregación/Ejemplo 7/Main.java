public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Leonardo Colli", "Gerente");
        Empleado empleado2 = new Empleado("Jennifer Alonzo", "Analista");
        Empleado empleado3 = new Empleado("Raúl Gónzalez", "Programador");
        Empleado empleado4 = new Empleado("Eduardo Cabrera", "Analista");
        Empleado empleado5 = new Empleado("Saulo Ac", "Programador");


        Departamento departamento = new Departamento("Desarrollo", 10);

        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);
        departamento.agregarEmpleado(empleado3);
        departamento.agregarEmpleado(empleado4);
        departamento.agregarEmpleado(empleado5);
        

        departamento.mostrarEmpleados();
    }
}

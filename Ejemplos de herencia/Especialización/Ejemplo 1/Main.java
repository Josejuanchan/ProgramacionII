public class Main {

    public static void main(String[] args) {
        Desarrollador desarrollador = new Desarrollador("Juan", 2000, 160, 10);
        double salarioDesarrollador = desarrollador.calcularSalario();
        System.out.println("Salario del Desarrollador: $" + salarioDesarrollador);
    }
}
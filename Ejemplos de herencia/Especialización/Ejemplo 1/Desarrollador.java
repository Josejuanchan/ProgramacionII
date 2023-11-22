public class Desarrollador extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public Desarrollador(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * tarifaHora);
    }
}

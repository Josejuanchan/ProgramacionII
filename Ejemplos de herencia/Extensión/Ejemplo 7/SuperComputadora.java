public class SuperComputadora extends Computadora {
    private int numeroDeProcesadores;

    public SuperComputadora(String marca, int memoriaRAM, int numeroDeProcesadores) {
        super(marca, memoriaRAM);
        this.numeroDeProcesadores = numeroDeProcesadores;
    }

    public void realizarCalculoIntensivo() {
        System.out.println("Realizando cálculo intensivo en la supercomputadora...");
    }

    public void mostrarNumeroDeProcesadores() {
        System.out.println("Número de procesadores de la supercomputadora: " + numeroDeProcesadores);
    }
}
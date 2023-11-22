public class Guitarra extends InstrumentoMusical {
    private int numeroCuerdas;

    public Guitarra(String nombre, int numeroCuerdas) {
        super(nombre);
        this.numeroCuerdas = numeroCuerdas;
    }

    public void afinar() {
        System.out.println("Afinando la guitarra de " + numeroCuerdas + " cuerdas.");
    }
}
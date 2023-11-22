public class Libreta extends Libro {
    private int numNotas;

    public Libreta(String titulo, String autor, int numPaginas, int numNotas) {
        super(titulo, autor, numPaginas);
        this.numNotas = numNotas;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de notas: " + numNotas);
    }

    public void tomarNotas() {
        System.out.println("Tomando notas en la libreta...");
    }
}
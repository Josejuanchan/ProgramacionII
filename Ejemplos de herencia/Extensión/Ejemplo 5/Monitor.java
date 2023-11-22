public class Monitor extends Televisor {
    private int resolucion;

    public Monitor(int tamanoPantalla, String marca, int resolucion) {
        super(tamanoPantalla, marca);
        this.resolucion = resolucion;
    }

    public void mostrarResolucion() {
        System.out.println("Resolución del monitor: " + resolucion);
    }

    public void ajustarBrillo(int nivel) {
        System.out.println("Ajustando el brillo del monitor al nivel " + nivel);
    }
}
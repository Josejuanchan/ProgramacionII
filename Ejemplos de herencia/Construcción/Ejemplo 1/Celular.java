public class Celular extends Computadora {
    private String numeroTeléfono;

    public Celular(String marca, String modelo, int capacidadRAM, String numeroTeléfono) {
        super(marca, modelo, capacidadRAM);
        this.numeroTeléfono = numeroTeléfono;
    }

    public void hacerLlamada(String número) {
        System.out.println("Realizando una llamada al número: " + número);
    }
}
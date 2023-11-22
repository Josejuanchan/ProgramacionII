public class InstrumentoMusical {
    protected String nombre;

    public InstrumentoMusical(String nombre) {
        this.nombre = nombre;
    }

    public void tocar() {
        System.out.println("Tocando el instrumento musical: " + nombre);
    }
}
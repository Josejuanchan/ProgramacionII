public class Puerta {
    protected String material;
    protected int altura;
    protected int ancho;

    public Puerta(String material, int altura, int ancho) {
        this.material = material;
        this.altura = altura;
        this.ancho = ancho;
    }

    public void abrir() {
        System.out.println("La puerta se ha abierto.");
    }

    public void cerrar() {
        System.out.println("La puerta se ha cerrado.");
    }
}
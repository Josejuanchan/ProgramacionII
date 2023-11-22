public class Escritorio {
    protected String material;
    protected int altura;
    protected int ancho;

    public Escritorio(String material, int altura, int ancho) {
        this.material = material;
        this.altura = altura;
        this.ancho = ancho;
    }

    public void trabajar() {
        System.out.println("El escritorio es un lugar adecuado para trabajar.");
    }

    public void almacenar() {
        System.out.println("El escritorio proporciona espacio para almacenar objetos.");
    }
}
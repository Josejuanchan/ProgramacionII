public class Sillon extends Mueble {
    protected int numPatas;

    public Sillon(String material, int altura, int numPatas) {
        super(material, altura);
        this.numPatas = numPatas;
    }

    public void describir() {
        super.describir();
        System.out.println("Este sillón tiene " + numPatas + " patas.");
    }

    public void sentarse() {
        System.out.println("Sentándose en el sillón.");
    }
}
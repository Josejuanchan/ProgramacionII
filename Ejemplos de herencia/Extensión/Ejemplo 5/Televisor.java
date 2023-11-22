public class Televisor {
    protected int tamanoPantalla;
    protected String marca;

    public Televisor(int tamanoPantalla, String marca) {
        this.tamanoPantalla = tamanoPantalla;
        this.marca = marca;
    }

    public void encender() {
        System.out.println("Encendiendo el televisor...");
    }

    public void apagar() {
        System.out.println("Apagando el televisor...");
    }

    public void cambiarCanal(int canal) {
        System.out.println("Cambiando al canal " + canal);
    }
}
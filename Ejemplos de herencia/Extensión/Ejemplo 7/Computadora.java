public class Computadora {
    protected String marca;
    protected int memoriaRAM;

    public Computadora(String marca, int memoriaRAM) {
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
    }

    public void encender() {
        System.out.println("Encendiendo la computadora...");
    }

    public void apagar() {
        System.out.println("Apagando la computadora...");
    }

    public void ejecutarPrograma(String programa) {
        System.out.println("Ejecutando programa: " + programa);
    }
}
public class Ventilador extends Electrodoméstico {
    private int numAspas;

    public Ventilador(String marca, int numAspas) {
        super(marca);
        this.numAspas = numAspas;
    }

    public void encender() {
        super.encender();
        System.out.println("Encendiendo el ventilador.");
    }

    public void cambiarVelocidad(int velocidad) {
        System.out.println("Cambiando la velocidad del ventilador a " + velocidad + ".");
    }
}
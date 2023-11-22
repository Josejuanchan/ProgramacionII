public class Joystick extends ControlDeTelevisión {
    private String tipo;

    public Joystick(String marca, String modelo, String tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    public void moverDerecha() {
        System.out.println("El joystick se mueve hacia la derecha.");
    }

    public void moverIzquierda() {
        System.out.println("El joystick se mueve hacia la izquierda.");
    }
}
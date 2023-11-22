public class Main
{
     public static void main(String[] args) {
        Joystick joystick = new Joystick("Logitech", "ModeloX", "Inalámbrico");
        joystick.encender();
        joystick.apagar();
        joystick.moverDerecha();
        joystick.moverIzquierda();
    }

}
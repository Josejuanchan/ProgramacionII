public class ControlDeTelevisión {
    protected String marca;
    protected String modelo;

    public ControlDeTelevisión(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("El control de televisión enciende la televisión.");
    }

    public void apagar() {
        System.out.println("El control de televisión apaga la televisión.");
    }

    public void cambiarCanal(int canal) {
        System.out.println("El control de televisión cambia al canal " + canal + ".");
    }
}
public class VentiladorPortatil extends Ventilador {
    private int numBaterias;

    public VentiladorPortatil(String marca, int numAspas, int numBaterias) {
        super(marca, numAspas);
        this.numBaterias = numBaterias;
    }

    public void encender() {
        super.encender();
        System.out.println("Encendiendo el ventilador portátil.");
    }

    public void cambiarVelocidad(int velocidad) {
        super.cambiarVelocidad(velocidad);
        System.out.println("El ventilador portátil está funcionando a velocidad " + velocidad + ".");
    }

    public void cargarBaterias() {
        System.out.println("Cargando las baterías del ventilador portátil.");
    }
}
public class Main {

    
    public static void main(String[] args) {
        VentiladorPortatil ventiladorPortatil = new VentiladorPortatil("Mytek", 3, 2);
        ventiladorPortatil.encender();
        ventiladorPortatil.cambiarVelocidad(2);
        ventiladorPortatil.cargarBaterias();
        ventiladorPortatil.apagar();
    }
}
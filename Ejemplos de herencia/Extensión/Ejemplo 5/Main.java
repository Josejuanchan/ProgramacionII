public class Main
{
	 public static void main(String[] args) {
        Monitor monitor = new Monitor(24, "Samsung", 1920);
        monitor.encender(); 
        monitor.mostrarResolucion(); 
        monitor.cambiarCanal(5);
        monitor.ajustarBrillo(80); 
        monitor.apagar(); 
    }
}

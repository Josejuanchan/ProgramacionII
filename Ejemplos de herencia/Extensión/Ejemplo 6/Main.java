public class Main
{
	 public static void main(String[] args) {
        ContenedorDeCargaDePesoPesado contenedor = new ContenedorDeCargaDePesoPesado(100, 5000);
        contenedor.cargar(); 
        contenedor.mostrarPesoMaximo(); 
        contenedor.descargar(); 
        contenedor.reforzarEstructura(); 
    }
}

public class Main
{
	 public static void main(String[] args) {
        SuperComputadora superComputadora = new SuperComputadora("IBM", 128, 64);
        superComputadora.encender(); 
        superComputadora.mostrarNumeroDeProcesadores(); 
        superComputadora.ejecutarPrograma("Simulación de clima"); 
        superComputadora.realizarCalculoIntensivo(); 
        superComputadora.apagar(); 
    }
}

public class Main
{
	public static void main(String[] args) {
        CamiónDeTransporte camiónDeTransporte = new CamiónDeTransporte("Volvo", 2022, 20.5);
        camiónDeTransporte.mostrarDatos();
        camiónDeTransporte.mostrarCapacidadCarga();
        camiónDeTransporte.transportarMercancías();
    }
}

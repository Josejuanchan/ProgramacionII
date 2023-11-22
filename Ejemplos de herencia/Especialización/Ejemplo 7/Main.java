public class Main
{
	public static void main(String[] args) {
        HornoMicroondas microondas = new HornoMicroondas("Samsung", 200);
        microondas.encender();
        microondas.ajustarTemperatura();
        microondas.calentar();
    }
}

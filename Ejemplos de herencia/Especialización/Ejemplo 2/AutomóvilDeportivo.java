public class AutomóvilDeportivo extends Vehículo {
    private int caballosFuerza;

    public AutomóvilDeportivo(String marca, String modelo, int caballosFuerza) {
        super(marca, modelo);
        this.caballosFuerza = caballosFuerza;
    }

    public void acelerar() {
        System.out.println("Acelerando el automóvil deportivo " + marca + " " + modelo + " con " + caballosFuerza + " caballos de fuerza.");
    }
}
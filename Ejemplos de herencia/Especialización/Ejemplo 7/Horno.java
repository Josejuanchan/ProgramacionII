public class Horno extends Electrodoméstico {
    private int temperatura;

    public Horno(String marca, int temperatura) {
        super(marca);
        this.temperatura = temperatura;
    }

    public void ajustarTemperatura() {
        System.out.println("Ajustando la temperatura del horno a " + temperatura + " grados Celsius");
    }
}
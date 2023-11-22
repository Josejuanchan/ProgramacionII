public class Automóvil extends Vehículo {
    private int cilindrada;

    public Automóvil(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    public void encenderLuces() {
        System.out.println("Encendiendo las luces del automóvil...");
    }
}
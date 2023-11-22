public class CamiónDeTransporte extends CamiónDeCarga {
    public CamiónDeTransporte(String marca, int año, double capacidadCarga) {
        super(marca, año, capacidadCarga);
    }

    public void transportarMercancías() {
        System.out.println("El camión de transporte está transportando mercancías.");
    }
}
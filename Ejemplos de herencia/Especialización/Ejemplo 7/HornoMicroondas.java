public class HornoMicroondas extends Horno {
    public HornoMicroondas(String marca, int temperatura) {
        super(marca, temperatura);
    }

    public void calentar() {
        System.out.println("Calentando en el horno microondas de marca " + marca);
    }
}
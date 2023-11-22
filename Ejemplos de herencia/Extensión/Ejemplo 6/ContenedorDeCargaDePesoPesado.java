public class ContenedorDeCargaDePesoPesado extends ContenedorDeCarga {
    private int pesoMaximo;

    public ContenedorDeCargaDePesoPesado(int capacidad, int pesoMaximo) {
        super(capacidad);
        this.pesoMaximo = pesoMaximo;
    }

    public void mostrarPesoMaximo() {
        System.out.println("Peso máximo del contenedor de carga de peso pesado: " + pesoMaximo);
    }

    public void reforzarEstructura() {
        System.out.println("Reforzando la estructura del contenedor de carga de peso pesado...");
    }
}
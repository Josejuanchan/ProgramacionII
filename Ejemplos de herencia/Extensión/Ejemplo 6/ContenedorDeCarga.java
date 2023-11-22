public class ContenedorDeCarga {
    protected int capacidad;

    public ContenedorDeCarga(int capacidad) {
        this.capacidad = capacidad;
    }

    public void cargar() {
        System.out.println("Cargando el contenedor de carga...");
    }

    public void descargar() {
        System.out.println("Descargando el contenedor de carga...");
    }
}
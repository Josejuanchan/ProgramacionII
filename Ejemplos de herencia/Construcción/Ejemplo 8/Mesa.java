public class Mesa extends Escritorio {
    private boolean plegable;

    public Mesa(String material, int altura, int ancho, boolean plegable) {
        super(material, altura, ancho);
        this.plegable = plegable;
    }

    public void utilizar() {
        System.out.println("La mesa se puede utilizar para diversas actividades.");
    }
}
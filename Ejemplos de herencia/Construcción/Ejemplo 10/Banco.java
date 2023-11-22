public class Banco extends Sofa {
    private int capacidad;

    public Banco(String material, String color, int capacidad) {
        super(material, color);
        this.capacidad = capacidad;
    }
    @Override
    public void sentarse() {
        System.out.println("El banco es cómodo para sentarse.");
    }
    @Override
    public void descansar() {
        System.out.println("El banco es ideal para descansar.");
    }

    public void sentarseEnBanco() {
        System.out.println("El banco ofrece espacio para sentarse.");
    }
}
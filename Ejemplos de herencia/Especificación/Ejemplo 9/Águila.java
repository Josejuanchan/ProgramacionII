public class Águila extends Ave {
    private double envergadura;

    public Águila(String especie, double envergadura) {
        super(especie);
        this.envergadura = envergadura;
    }

    public void cazar() {
        System.out.println("El águila de especie " + especie + " está cazando.");
    }
}
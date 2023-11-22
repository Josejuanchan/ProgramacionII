public class Sofa {
    protected String material;
    protected String color;

    public Sofa(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void sentarse() {
        System.out.println("El sofá es cómodo para sentarse.");
    }

    public void descansar() {
        System.out.println("El sofá es ideal para descansar.");
    }
}
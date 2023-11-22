public class Ave {
    protected String especie;

    public Ave(String especie) {
        this.especie = especie;
    }

    public void volar() {
        System.out.println("El ave de especie " + especie + " está volando.");
    }
}

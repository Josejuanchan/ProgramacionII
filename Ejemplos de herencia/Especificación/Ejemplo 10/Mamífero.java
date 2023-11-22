public class Mamífero {
    protected String especie;

    public Mamífero(String especie) {
        this.especie = especie;
    }

    public void amamantar() {
        System.out.println("El mamífero de especie " + especie + " está amamantando a sus crías.");
    }
}

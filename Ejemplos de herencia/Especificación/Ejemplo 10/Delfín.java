public class Delfín extends Mamífero {
    private int velocidadNado;

    public Delfín(String especie, int velocidadNado) {
        super(especie);
        this.velocidadNado = velocidadNado;
    }

    public void nadar() {
        System.out.println("El delfín de especie " + especie + " está nadando a una velocidad de " + velocidadNado + " km/h.");
    }
}
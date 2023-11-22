public class Teléfono extends Dispositivo {
    private String número;

    public Teléfono(String marca, String número) {
        super(marca);
        this.número = número;
    }

    public void llamar(String destinatario) {
        System.out.println("Llamando al número " + destinatario + " desde el teléfono " + número);
    }
}
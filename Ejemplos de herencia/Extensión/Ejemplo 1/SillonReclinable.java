public class SillonReclinable extends Sillon {
    private boolean reclinado;

    public SillonReclinable(String material, int altura, int numPatas) {
        super(material, altura, numPatas);
        this.reclinado = false;
    }

    public void describir() {
        super.describir();
        System.out.println("Este sillón reclinable está " + reclinado + "reclinado." + " : "  + "en posición vertical.");
    }

    public void reclinar() {
        if (reclinado) {
            System.out.println("El sillón ya está reclinado.");
        } else {
            System.out.println("Reclinando el sillón.");
            reclinado = true;
        }
    }

    public void incorporarse() {
        if (reclinado) {
            System.out.println("Incorporándose del sillón.");
            reclinado = false;
        } else {
            System.out.println("El sillón ya está en posición vertical.");
        }
    }
}
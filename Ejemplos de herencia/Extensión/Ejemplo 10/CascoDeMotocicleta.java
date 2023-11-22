public class CascoDeMotocicleta extends Casco {
    private boolean visera;

    public CascoDeMotocicleta(String marca, String color, boolean visera) {
        super(marca, color);
        this.visera = visera;
    }

    public void usarVisera() {
        if (visera) {
            System.out.println("El casco de motocicleta utiliza la visera.");
        } else {
            System.out.println("El casco de motocicleta no tiene visera.");
        }
    }
}
public class CascoDeCarreras extends Casco {
    private boolean aprobadoFIA;

    public CascoDeCarreras(String marca, String color, boolean aprobadoFIA) {
        super(marca, color);
        this.aprobadoFIA = aprobadoFIA;
    }

    public void usarVisera() {
        System.out.println("El casco de carreras utiliza una visera especial.");
    }

    public void mostrarAprobacionFIA() {
        if (aprobadoFIA) {
            System.out.println("El casco de carreras está aprobado por la FIA.");
        } else {
            System.out.println("El casco de carreras no está aprobado por la FIA.");
        }
    }
}
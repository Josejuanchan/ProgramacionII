public class RelojDigital extends Reloj {
    private String formato;

    public RelojDigital(int hora, int minuto, int segundo, String formato) {
        super(hora, minuto, segundo);
        this.formato = formato;
    }
    
    public void mostrarHora() {
        if (formato.equalsIgnoreCase("12h")) {
            int hora12h = hora % 12;
            String periodo = (hora < 12) ? "AM" : "PM";
            System.out.printf("%02d:%02d:%02d %s%n", hora12h, minuto, segundo, periodo);
        } else {
            System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
        }
    }
}
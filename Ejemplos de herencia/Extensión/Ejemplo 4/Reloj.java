public class Reloj {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
    }    
     
    public void ajustarHora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
}
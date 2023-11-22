public class Main
{
	public static void main(String[] args) {
        RelojDigital relojDigital = new RelojDigital(15, 30, 45, "12h");
        relojDigital.mostrarHora(); 
        relojDigital.ajustarHora(9, 45, 0); 
        relojDigital.mostrarHora(); 
    }
}

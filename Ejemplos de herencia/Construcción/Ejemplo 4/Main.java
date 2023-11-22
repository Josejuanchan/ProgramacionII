public class Main
{
	 public static void main(String[] args) {
        Libreta libreta = new Libreta("Mi libreta", "Yo mismo", 100, 50);
        libreta.mostrarInformacion(); 
        libreta.leer(); 
        libreta.tomarNotas();
    }
}

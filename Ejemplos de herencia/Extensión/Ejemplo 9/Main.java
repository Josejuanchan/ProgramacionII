public class Main
{
	public static void main(String[] args) {
        
        CascoDeCarreras cascoCarreras = new CascoDeCarreras("Bell", "Rojo", true);
        cascoCarreras.protegerCabeza(); 
        cascoCarreras.ajustarCorrea(); 
        cascoCarreras.usarVisera(); 
        cascoCarreras.mostrarAprobacionFIA();
    }
}
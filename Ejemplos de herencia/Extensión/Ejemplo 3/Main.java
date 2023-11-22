public class Main
{
	public static void main(String[] args) {
        PuertaConCodigo puertaConCodigo = new PuertaConCodigo("Madera", 200, 80, "1234");
        puertaConCodigo.abrirConCodigo("1234"); 
        puertaConCodigo.abrirConCodigo("5678"); 
    }
}

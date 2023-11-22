public class PuertaConCodigo extends Puerta {
    private String codigo;

    public PuertaConCodigo(String material, int altura, int ancho, String codigo) {
        super(material, altura, ancho);
        this.codigo = codigo;
    }

    public void abrirConCodigo(String codigoIngresado) {
        if (codigoIngresado.equals(codigo)) {
            System.out.println("La puerta se ha abierto con éxito.");
        } else {
            System.out.println("Código incorrecto. La puerta no se puede abrir.");
        }
    }
}

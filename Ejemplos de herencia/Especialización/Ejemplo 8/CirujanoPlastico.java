public class CirujanoPlastico extends Cirujano {
    public CirujanoPlastico(String nombre) {
        super(nombre, "plástico");
    }

    public void realizarCirugiaEstetica() {
        System.out.println(nombre + " está realizando una cirugía estética como cirujano plástico");
    }
}
public class Cirujano extends Persona {
    protected String especialidad;

    public Cirujano(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public void realizarCirugia() {
        System.out.println(nombre + " está realizando una cirugía como cirujano " + especialidad);
    }
}
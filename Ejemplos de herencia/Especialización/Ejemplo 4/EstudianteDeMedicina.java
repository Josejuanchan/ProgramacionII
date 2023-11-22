public class EstudianteDeMedicina extends Persona {
    private String universidad;

    public EstudianteDeMedicina(String nombre, int edad, String universidad) {
        super(nombre, edad);
        this.universidad = universidad;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando medicina en la universidad " + universidad);
    }
}
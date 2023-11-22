public class Casa {
    private String dirección;
    private Habitante habitante;

    public Casa(String dirección, String nombreHabitante, int edadHabitante) {
        this.dirección = dirección;
        this.habitante = new Habitante(nombreHabitante, edadHabitante);
    }

    public String getDirección() {
        return dirección;
    }

    public Habitante getHabitante() {
        return habitante;
    }
}
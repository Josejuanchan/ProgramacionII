public class CuentaRedSocial {
    private String nombreUsuario;
    private String email;
    private Usuario usuario;

    public CuentaRedSocial(String nombreUsuario, String email, String nombre, int edad) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.usuario = new Usuario(nombre, edad);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
public class Main {
    public static void main(String[] args) {
        CuentaRedSocial cuenta = new CuentaRedSocial("jose123", "jose.chan@gmail.com", "Jose Juan", 25);

        System.out.println("Información de la cuenta de la red social:");
        System.out.println("Nombre de usuario: " + cuenta.getNombreUsuario());
        System.out.println("Email: " + cuenta.getEmail());
        System.out.println("Información del usuario asociado:");
        System.out.println("Nombre: " + cuenta.getUsuario().getNombre());
        System.out.println("Edad: " + cuenta.getUsuario().getEdad());
    }
}
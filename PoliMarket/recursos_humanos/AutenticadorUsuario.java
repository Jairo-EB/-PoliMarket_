package recursos_humanos;

public class AutenticadorUsuario {

    public boolean autenticar(String usuario, String contrasena) {
        // Lógica de autenticación simulada
        return usuario.equalsIgnoreCase("usuario") && contrasena.equals("admin");
    }
}

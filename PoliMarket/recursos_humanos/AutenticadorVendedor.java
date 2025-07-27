package recursos_humanos;

public class AutenticadorVendedor {

    public boolean autenticar(String usuario, String contrasena) {
        
        return usuario.equalsIgnoreCase("vendedor") && contrasena.equals("1234");
    }
}

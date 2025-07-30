package autenticacion_autorizacion;

public class Autenticacion {
    public boolean autenticar(String usuario, String clave) {
        return "vendedor".equals(usuario) && "1234".equals(clave);
    }
}

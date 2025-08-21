package acceso;

import autenticacion_autorizacion.Autenticacion;

public class Acceso {
    private final Autenticacion auth = Autenticacion.getInstancia();

    public boolean loginVendedor(String user, String pass) {
        return auth.autenticar(user, pass);
    }
}

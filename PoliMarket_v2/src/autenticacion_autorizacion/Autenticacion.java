package autenticacion_autorizacion;

public class Autenticacion {
    private static volatile Autenticacion instancia;

    private Autenticacion() {}

    public static Autenticacion getInstancia() {
        if (instancia == null) {
            synchronized (Autenticacion.class) {
                if (instancia == null) {
                    instancia = new Autenticacion();
                }
            }
        }
        return instancia;
    }

    public boolean autenticar(String usuario, String clave) {
        if (usuario == null || clave == null) return false;
        return "vendedor".equals(usuario) && "1234".equals(clave);
    }
}

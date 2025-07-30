package recursos_humanos;

public class Vendedor {
    private String id;
    private String nombre;
    private boolean autorizado;

    public Vendedor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.autorizado = false;
    }

    public void autorizar() {
        this.autorizado = true;
    }

    public boolean estaAutorizado() {
        return autorizado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
}

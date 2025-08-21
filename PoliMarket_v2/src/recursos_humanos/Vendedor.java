package recursos_humanos;

public class Vendedor {
    private final String id;
    private final String nombre;

    public Vendedor(String id, String nombre) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("ID vendedor inválido");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre inválido");
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() { return nombre + " (" + id + ")"; }
}

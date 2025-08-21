package proveedores;

public class Proveedor {
    private final String id;
    private final String nombre;

    public Proveedor(String id, String nombre) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("ID proveedor inválido");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre proveedor inválido");
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}

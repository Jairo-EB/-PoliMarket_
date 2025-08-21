package ventas;

public class Cliente {
    private final String id;
    private final String nombre;

    public Cliente(String id, String nombre) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("Id de cliente inválido");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre de cliente inválido");
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}

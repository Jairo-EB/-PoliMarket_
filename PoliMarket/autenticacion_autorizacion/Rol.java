package autenticacion_autorizacion;

public class Rol {
    private String id;
    private String nombre;

    public Rol(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }
}

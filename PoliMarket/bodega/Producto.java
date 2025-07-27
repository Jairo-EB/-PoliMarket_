package bodega;

public class Producto {
    private String id;
    private String nombre;
    private int stock;

    public Producto(String id, String nombre, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }
}

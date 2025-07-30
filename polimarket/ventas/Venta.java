package ventas;

public class Venta {
    private Producto producto;
    private Cliente cliente;

    public Venta(Producto producto, Cliente cliente) {
        this.producto = producto;
        this.cliente = cliente;
    }

    public void registrarVenta() {
        System.out.println("Venta registrada: " + producto.getNombre() + " para cliente " + cliente.getNombre());
    }
}

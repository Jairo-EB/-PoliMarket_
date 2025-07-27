package ventas;

public class Cotizacion {
    public void generarCotizacion(Cliente cliente, Producto producto, int cantidad) {
        System.out.println("Cotización generada para " + cliente.getNombre() +
                " por " + cantidad + " unidades del producto " + producto.getNombre());
    }
}

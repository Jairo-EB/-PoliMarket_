package ventas;

public class CrearVenta {
    public void crearVenta(String idVendedor, Cliente cliente, Producto producto) {
        System.out.println("Venta creada por " + idVendedor + " al cliente " + cliente.getNombre()
                + " del producto " + producto.getNombre());
    }
}

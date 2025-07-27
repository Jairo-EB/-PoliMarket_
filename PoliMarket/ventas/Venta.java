package ventas;

public class Venta {
    private String idVenta;
    private Cliente cliente;
    private Producto producto;
    private String idVendedor;
    private boolean finalizada;

    public Venta(String idVenta, Cliente cliente, Producto producto, String idVendedor) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.producto = producto;
        this.idVendedor = idVendedor;
        this.finalizada = false;
    }

    public String getIdVenta() { return idVenta; }
    public Cliente getCliente() { return cliente; }
    public Producto getProducto() { return producto; }
    public String getIdVendedor() { return idVendedor; }
    public boolean isFinalizada() { return finalizada; }

    public void finalizarVenta() {
        this.finalizada = true;
    }
}

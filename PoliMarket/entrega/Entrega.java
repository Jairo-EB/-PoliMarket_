package entrega;

public class Entrega {
    private String idEntrega;
    private String productoId;
    private String clienteId;

    public Entrega(String idEntrega, String productoId, String clienteId) {
        this.idEntrega = idEntrega;
        this.productoId = productoId;
        this.clienteId = clienteId;
    }

    public String getIdEntrega() { return idEntrega; }
    public String getProductoId() { return productoId; }
    public String getClienteId() { return clienteId; }
}

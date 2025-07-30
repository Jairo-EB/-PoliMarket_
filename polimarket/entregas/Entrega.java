package entregas;

public class Entrega {
    private String producto;
    private String cliente;

    public Entrega(String producto, String cliente) {
        this.producto = producto;
        this.cliente = cliente;
    }

    public void realizarEntrega() {
        System.out.println("Entregado " + producto + " a " + cliente);
    }
}

package ventas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Venta implements Iterable<Producto> {
    private final List<Producto> productos = new ArrayList<>();
    private final Cliente cliente;

    public Venta(Cliente cliente) {
        if (cliente == null) throw new IllegalArgumentException("Cliente requerido");
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        if (producto == null) throw new IllegalArgumentException("Producto requerido");
        productos.add(producto);
    }

    public BigDecimal total() {
        BigDecimal total = BigDecimal.ZERO;
        for (Producto p : productos) {
            total = total.add(p.getPrecio());
        }
        return total;
    }

    public void registrarVenta() {
        System.out.println("Venta registrada para: " + cliente.getNombre() + " (ID: " + cliente.getId() + ")");
        for (Producto p : productos) {
            System.out.println(" - " + p.getNombre() + "  $" + p.getPrecio());
        }
        System.out.println("TOTAL: $" + total());
    }

    @Override
    public Iterator<Producto> iterator() {
        return productos.iterator();
    }
}

package bodega;

import ventas.Producto;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class KardexRegistro {
    public enum Tipo { ENTRADA, SALIDA }

    private final LocalDateTime fecha = LocalDateTime.now();
    private final Producto producto;
    private final int cantidad;
    private final Tipo tipo;
    private final BigDecimal costoUnitario;

    public KardexRegistro(Producto producto, int cantidad, Tipo tipo, BigDecimal costoUnitario) {
        if (producto == null) throw new IllegalArgumentException("Producto requerido");
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad > 0");
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.costoUnitario = costoUnitario;
    }

    public LocalDateTime getFecha() { return fecha; }
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public Tipo getTipo() { return tipo; }
    public BigDecimal getCostoUnitario() { return costoUnitario; }
}

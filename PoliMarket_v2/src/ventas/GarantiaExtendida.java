package ventas;

import java.math.BigDecimal;

public class GarantiaExtendida extends ProductoDecorador {
    private static final BigDecimal COSTO_GARANTIA = new BigDecimal("5000");

    public GarantiaExtendida(Producto producto) {
        super(producto);
    }

    @Override
    public BigDecimal getPrecio() {
        return super.getPrecio().add(COSTO_GARANTIA);
    }

    @Override
    public String getNombre() {
        return super.getNombre() + " + Garantía";
    }
}

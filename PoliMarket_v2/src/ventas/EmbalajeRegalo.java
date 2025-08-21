package ventas;

import java.math.BigDecimal;

public class EmbalajeRegalo extends ProductoDecorador {
    private static final BigDecimal COSTO_EMBALAJE = new BigDecimal("2000");

    public EmbalajeRegalo(Producto producto) {
        super(producto);
    }

    @Override
    public BigDecimal getPrecio() {
        return super.getPrecio().add(COSTO_EMBALAJE);
    }

    @Override
    public String getNombre() {
        return super.getNombre() + " + Embalaje";
    }
}

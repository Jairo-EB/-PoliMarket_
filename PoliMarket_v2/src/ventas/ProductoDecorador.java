package ventas;

import java.math.BigDecimal;

public abstract class ProductoDecorador extends Producto {
    protected final Producto producto;

    public ProductoDecorador(Producto producto) {
        super(producto.getCodigo(), producto.getNombre(), producto.getPrecio());
        this.producto = producto;
    }

    @Override
    public String getNombre() {
        return producto.getNombre();
    }

    @Override
    public BigDecimal getPrecio() {
        return producto.getPrecio();
    }
}

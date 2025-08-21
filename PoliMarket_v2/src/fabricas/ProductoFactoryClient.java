package fabricas;

import ventas.Producto;
import java.math.BigDecimal;

public class ProductoFactoryClient {
    private final ProductoAbstractFactory factory;

    public ProductoFactoryClient(ProductoAbstractFactory factory) {
        this.factory = factory;
    }

    public Producto construirProducto(String codigo, String nombre, BigDecimal precio) {
        return factory.crearProducto(codigo, nombre, precio);
    }
}

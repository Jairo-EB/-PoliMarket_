package fabricas;

import ventas.Producto;
import java.math.BigDecimal;

public interface ProductoAbstractFactory {
    Producto crearProducto(String codigo, String nombre, BigDecimal precio);
}

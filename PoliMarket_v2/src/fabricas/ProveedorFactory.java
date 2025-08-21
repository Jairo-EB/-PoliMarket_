package fabricas;

import ventas.Producto;
import java.math.BigDecimal;

public class ProveedorFactory implements ProductoAbstractFactory {
    @Override
    public Producto crearProducto(String codigo, String nombre, BigDecimal precio) {
        System.out.println("[Factory] Producto creado desde Proveedor");
        return new Producto(codigo, nombre, precio);
    }
}

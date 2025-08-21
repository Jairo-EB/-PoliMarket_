package main;

import autenticacion_autorizacion.Autenticacion;
import fabricas.ProductoFactoryClient;
import fabricas.ProveedorFactory;
import ventas.Cliente;
import ventas.EmbalajeRegalo;
import ventas.Producto;
import ventas.Venta;

import java.math.BigDecimal;
import java.util.Iterator;

public class Cliente2 {
    public static void main(String[] args) {
        Autenticacion auth = Autenticacion.getInstancia();
        if (!auth.autenticar("vendedor", "1234")) {
            System.out.println("Acceso DENEGADO");
            return;
        }
        System.out.println("Acceso OK - Cliente2");

        ProductoFactoryClient facProv = new ProductoFactoryClient(new ProveedorFactory());
        Producto pantalon = facProv.construirProducto("P99", "Pantalón", new BigDecimal("60000"));
        Producto pantalonRegalo = new EmbalajeRegalo(pantalon);

        Cliente cliente = new Cliente("C-200", "Pedro López");
        Venta venta = new Venta(cliente);
        venta.agregarProducto(pantalon);
        venta.agregarProducto(pantalonRegalo);

        System.out.println("Detalle (iteración manual):");
        Iterator<Producto> it = venta.iterator();
        while (it.hasNext()) {
            System.out.println(" * " + it.next());
        }

        venta.registrarVenta();
    }
}

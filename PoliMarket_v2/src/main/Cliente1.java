package main;

import autenticacion_autorizacion.Autenticacion;
import fabricas.BodegaFactory;
import fabricas.ProductoFactoryClient;
import ventas.Cliente;
import ventas.EmbalajeRegalo;
import ventas.GarantiaExtendida;
import ventas.Producto;
import ventas.Venta;

import java.math.BigDecimal;

public class Cliente1 {
    public static void main(String[] args) {
        Autenticacion auth = Autenticacion.getInstancia();
        if (!auth.autenticar("vendedor", "1234")) {
            System.out.println("Acceso DENEGADO");
            return;
        }
        System.out.println("Acceso OK - Cliente1");

        ProductoFactoryClient facBodega = new ProductoFactoryClient(new BodegaFactory());
        Producto camiseta = facBodega.construirProducto("B01", "Camiseta", new BigDecimal("30000"));

        Producto camisetaCopia = camiseta.clone();
        camisetaCopia.setCodigo("B01-COPIA");

        Producto camisetaFull = new GarantiaExtendida(new EmbalajeRegalo(camiseta));

        Cliente cliente = new Cliente("C-100", "Ana García");
        Venta venta = new Venta(cliente);
        venta.agregarProducto(camisetaFull);
        venta.agregarProducto(camisetaCopia);

        venta.registrarVenta();
    }
}

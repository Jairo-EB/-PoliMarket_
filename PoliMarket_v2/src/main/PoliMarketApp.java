package main;

import acceso.Acceso;
import empresa.Empresa;
import recursos_humanos.Vendedor;
import proveedores.Proveedor;

import fabricas.BodegaFactory;
import fabricas.ProductoFactoryClient;
import fabricas.ProveedorFactory;

import ventas.Cliente;
import ventas.EmbalajeRegalo;
import ventas.GarantiaExtendida;
import ventas.Producto;
import ventas.Venta;

import bodega.Inventario;
import entregas.Entrega;

import java.math.BigDecimal;
import java.util.Iterator;

public class PoliMarketApp {

    public static void main(String[] args) {
        System.out.println("=== INICIO POLIMARKET (con diagrama + patrones) ===");

        Acceso acceso = new Acceso();
        if (!acceso.loginVendedor("vendedor", "1234")) {
            System.out.println("Acceso DENEGADO");
            return;
        }
        System.out.println("Acceso OK\n");

        Empresa empresa = new Empresa("901234567-8", "PoliMarket S.A.S.");
        Vendedor vend = new Vendedor("V-01", "Laura Vendedora");
        empresa.agregarVendedor(vend);

        Cliente cliente1 = new Cliente("C-100", "Ana García");
        Cliente cliente2 = new Cliente("C-200", "Pedro López");
        empresa.agregarCliente(cliente1);
        empresa.agregarCliente(cliente2);

        Proveedor prov = new Proveedor("PR-77", "Mayorista Centro");

        ProductoFactoryClient facBodega = new ProductoFactoryClient(new BodegaFactory());
        ProductoFactoryClient facProv   = new ProductoFactoryClient(new ProveedorFactory());

        Producto camiseta = facBodega.construirProducto("B01", "Camiseta", new BigDecimal("30000"));
        Producto pantalon = facProv.construirProducto("P99", "Pantalón", new BigDecimal("60000"));

        Producto camisetaCopia = camiseta.clone();
        camisetaCopia.setCodigo("B01-COPIA");

        Producto camisetaFull  = new GarantiaExtendida(new EmbalajeRegalo(camiseta));
        Producto pantalonGift  = new EmbalajeRegalo(pantalon);

        Inventario inv = new Inventario();
        inv.entrada(camiseta, 10, new BigDecimal("28000"));
        inv.entrada(pantalon, 5, new BigDecimal("55000"));
        inv.salida(camiseta, 2, new BigDecimal("28000"));

        Venta venta1 = new Venta(cliente1);
        venta1.agregarProducto(camisetaFull);
        venta1.agregarProducto(camisetaCopia);
        venta1.registrarVenta();

        Entrega e1 = new Entrega(venta1);
        e1.despachar();
        e1.entregar();

        System.out.println();

        Venta venta2 = new Venta(cliente2);
        venta2.agregarProducto(pantalon);
        venta2.agregarProducto(pantalonGift);

        System.out.println("Detalle Venta 2 (iteración manual):");
        Iterator<Producto> it = venta2.iterator();
        while (it.hasNext()) {
            System.out.println(" * " + it.next());
        }
        venta2.registrarVenta();

        System.out.println("\n=== FIN ===");
    }
}

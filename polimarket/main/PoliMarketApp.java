package main;

import autenticacion_autorizacion.Autenticacion;
import recursos_humanos.Vendedor;
import ventas.*;
import bodega.DisponibilidadInventario;
import proveedores.DisponibilidadProveedor;
import entregas.Entrega;

public class PoliMarketApp {
    public static void main(String[] args) {
        // Autenticación y autorización
        Autenticacion auth = new Autenticacion();
        if (auth.autenticar("vendedor", "1234")) {
            Vendedor vendedor = new Vendedor("001", "Carlos");
            vendedor.autorizar();

            if (vendedor.estaAutorizado()) {
                // Simulación de venta
                Producto producto = new Producto("P001", "Café", 12.5);
                Cliente cliente = new Cliente("C001", "Laura");
                Venta venta = new Venta(producto, cliente);
                venta.registrarVenta();

                // Verificar disponibilidad en bodega
                if (DisponibilidadInventario.disponible(producto.getNombre())) {
                    // Verificar proveedor
                    System.out.println(DisponibilidadProveedor.consultarProveedor(producto.getNombre()));

                    // Entrega
                    Entrega entrega = new Entrega(producto.getNombre(), cliente.getNombre());
                    entrega.realizarEntrega();
                } else {
                    System.out.println("Producto no disponible en inventario");
                }
            }
        } else {
            System.out.println("Autenticación fallida");
        }
    }
}

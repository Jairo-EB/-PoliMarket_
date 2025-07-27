package main;

import recursos_humanos.AutenticadorVendedor;
import ventas.Cliente;
import ventas.Producto;
import ventas.CrearVenta;
import ventas.CargarDisponibilidad;
import ventas.Cotizacion;
import ventas.CrearTarea;
import ventas.VentaFinal;
import ventas.Venta;

import entrega.RegistrarEntrega;
import entrega.ConsultarVentas;

import bodega.HacerCompra;
import bodega.ConsultaExistencia;
import proveedor.Empresa;

public class ClienteSistema {
    public static void main(String[] args) {
        System.out.println(" Iniciando simulación del sistema PoliMarket...");

        // Recursos Humanos - Autenticación
        AutenticadorVendedor auth = new AutenticadorVendedor();
        boolean acceso = auth.autenticar("vendedor", "1234");

        if (!acceso) {
            System.out.println("Autenticación fallida. Fin del programa.");
            return;
        }

        System.out.println("Vendedor autenticado exitosamente.\n");

        // Ventas - Cliente y Producto
        Cliente cliente = new Cliente("C001", "Ana Torres", "ana@correo.com");
        Producto producto = new Producto("P001", "Teclado Gamer", 20);

        // Crear venta
        CrearVenta creador = new CrearVenta();
        creador.crearVenta("V001", cliente, producto);

        // Mostrar disponibilidad
        CargarDisponibilidad disponibilidad = new CargarDisponibilidad();
        disponibilidad.mostrarDisponibilidad(producto);

        // Cotizar
        Cotizacion cotizacion = new Cotizacion();
        cotizacion.generarCotizacion(cliente, producto, 2);

        // Tarea
        CrearTarea tarea = new CrearTarea();
        tarea.asignarTarea("V001", "Llamar al cliente para confirmar pago");

        // Finalizar venta
        Venta venta = new Venta("V001", cliente, producto, "V001");
        venta.finalizarVenta();

        VentaFinal vf = new VentaFinal();
        vf.finalizarVenta(venta.getIdVenta());

        // Entregas
        RegistrarEntrega entrega = new RegistrarEntrega();
        entrega.registrar(producto.getId(), cliente.getId());

        ConsultarVentas consultar = new ConsultarVentas();
        consultar.consultarPorCliente(cliente.getId());

        // Bodega y proveedor
        HacerCompra compra = new HacerCompra();
        compra.procesarCompra(producto.getId(), 10);

        ConsultaExistencia existencia = new ConsultaExistencia();
        existencia.consultarExistencia(producto.getId(), producto.getStock());

        // Proveedor
        Empresa proveedor = new Empresa("E001", "Distribuidora Central");
        System.out.println(" Compra hecha al proveedor: " + proveedor.getNombre());

        System.out.println("\\n Simulación finalizada correctamente.");
    }
}

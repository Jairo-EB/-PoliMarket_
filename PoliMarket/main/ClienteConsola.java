package main;

import recursos_humanos.AutenticadorVendedor;
import ventas.Cliente;
import ventas.Producto;
import ventas.CrearVenta;
import ventas.CargarDisponibilidad;

public class ClienteConsola {
    public static void main(String[] args) {
        AutenticadorVendedor auth = new AutenticadorVendedor();
        boolean acceso = auth.autenticar("vendedor", "1234");

        if (acceso) {
            System.out.println("Vendedor autenticado");

            Producto p = new Producto("P001", "Teclado", 12);
            Cliente c = new Cliente("C001", "Ana Torres", "ana@correo.com");

            CrearVenta crearVenta = new CrearVenta();
            crearVenta.crearVenta("V001", c, p);

            CargarDisponibilidad cd = new CargarDisponibilidad();
            cd.mostrarDisponibilidad(p);
        } else {
            System.out.println("Autenticación fallida");
        }
    }
}

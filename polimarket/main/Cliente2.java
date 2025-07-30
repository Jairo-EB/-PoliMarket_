package main;

import recursos_humanos.Vendedor;
import ventas.Producto;
import ventas.Cliente;
import ventas.Venta;
import java.util.Scanner;

public class Cliente2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Cliente 2 - Java ===");

            System.out.print("Nombre del vendedor: ");
            String nombreVendedor = sc.nextLine();

            // Simulación: el vendedor Carlos está autorizado
            Vendedor vendedor = new Vendedor("V001", nombreVendedor);
            if (nombreVendedor.equalsIgnoreCase("Carlos")) {
                vendedor.autorizar();
            }

            if (!vendedor.estaAutorizado()) {
                System.out.println("  Vendedor no autorizado.");
                return;
            }

            System.out.println(" Vendedor autorizado.");

            System.out.print("Ingrese ID del producto: ");
            String idProducto = sc.nextLine();
            System.out.print("Ingrese nombre del producto: ");
            String nombreProducto = sc.nextLine();
            System.out.print("Ingrese precio del producto: ");
            double precio = Double.parseDouble(sc.nextLine());

            Producto producto = new Producto(idProducto, nombreProducto, precio);

            System.out.print("Ingrese ID del cliente: ");
            String idCliente = sc.nextLine();
            System.out.print("Ingrese nombre del cliente: ");
            String nombreCliente = sc.nextLine();

            Cliente cliente = new Cliente(idCliente, nombreCliente);

            Venta venta = new Venta(producto, cliente);
            venta.registrarVenta(); // simulado por consola
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }
    }
}

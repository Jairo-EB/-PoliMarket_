package main;

import bodega.DisponibilidadInventario;
import proveedores.DisponibilidadProveedor;
import java.util.Scanner;

public class Cliente1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Cliente 1 - Java ===");
            System.out.print("Ingrese nombre del producto: ");
            String producto = sc.nextLine();

            if (DisponibilidadInventario.disponible(producto)) {
                System.out.println(" Producto disponible en bodega.");
            } else {
                System.out.println(" Producto agotado.");
            }

            String proveedor = DisponibilidadProveedor.consultarProveedor(producto);
            System.out.println("Proveedor sugerido: " + proveedor);
        }
    }
}

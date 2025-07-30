package bodega;

public class DisponibilidadInventario {
    public static boolean disponible(String nombreProducto) {
        // Simulación de productos en memoria
        String[][] productos = {
            {"P001", "Café", "10.0", "20"},
            {"P002", "Azúcar", "8.0", "0"},
            {"P003", "Leche", "12.0", "15"}
        };

        for (String[] prod : productos) {
            if (prod[1].equalsIgnoreCase(nombreProducto)) {
                int cantidad = Integer.parseInt(prod[3]);
                return cantidad > 0;
            }
        }
        return false;
    }
}

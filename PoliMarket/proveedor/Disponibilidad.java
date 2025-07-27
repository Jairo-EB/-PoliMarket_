package proveedor;

public class Disponibilidad {
    public void verificarDisponibilidad(String productoId, int stock) {
        System.out.println("El proveedor tiene disponible " + stock + " unidades del producto " + productoId);
    }
}

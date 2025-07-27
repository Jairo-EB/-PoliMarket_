package ventas;


public class CargarDisponibilidad {
    public void mostrarDisponibilidad(Producto producto) {
        System.out.println("Producto: " + producto.getNombre() + " | Stock: " + producto.getStock());
    }
}

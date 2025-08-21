package entregas;

import ventas.Venta;

public class Entrega {
    public enum Estado { PENDIENTE, DESPACHADA, ENTREGADA }
    private final Venta venta;
    private Estado estado = Estado.PENDIENTE;

    public Entrega(Venta venta) {
        if (venta == null) throw new IllegalArgumentException("Venta requerida");
        this.venta = venta;
    }

    public Venta getVenta() { return venta; }
    public Estado getEstado() { return estado; }
    public void despachar() { estado = Estado.DESPACHADA; }
    public void entregar()  { estado = Estado.ENTREGADA; }
}

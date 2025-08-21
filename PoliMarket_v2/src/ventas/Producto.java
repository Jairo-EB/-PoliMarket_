package ventas;

import java.math.BigDecimal;
import java.util.Objects;

public class Producto implements Cloneable {
    private String codigo;
    private String nombre;
    private BigDecimal precio;

    public Producto(String codigoProducto, String nombreProducto, BigDecimal precioProducto) {
        if (codigoProducto == null || codigoProducto.isBlank()) throw new IllegalArgumentException("Código inválido");
        if (nombreProducto == null || nombreProducto.isBlank()) throw new IllegalArgumentException("Nombre inválido");
        if (precioProducto == null || precioProducto.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("Precio inválido");
        this.codigo = codigoProducto;
        this.nombre = nombreProducto;
        this.precio = precioProducto;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public BigDecimal getPrecio() { return precio; }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) throw new IllegalArgumentException("Código inválido");
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre inválido");
        this.nombre = nombre;
    }
    public void setPrecio(BigDecimal precio) {
        if (precio == null || precio.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("Precio inválido");
        this.precio = precio;
    }

    @Override
    public Producto clone() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clonación no soportada", e);
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ") - $" + precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

package bodega;

import ventas.Producto;
import java.util.*;
import java.math.BigDecimal;

public class Inventario {
    private final Map<Producto, Integer> stock = new HashMap<>();
    private final List<KardexRegistro> kardex = new ArrayList<>();

    public int getStock(Producto p) { return stock.getOrDefault(p, 0); }

    public void entrada(Producto p, int cantidad, BigDecimal costoUnitario) {
        stock.put(p, getStock(p) + cantidad);
        kardex.add(new KardexRegistro(p, cantidad, KardexRegistro.Tipo.ENTRADA, costoUnitario));
    }

    public boolean salida(Producto p, int cantidad, BigDecimal costoUnitario) {
        int actual = getStock(p);
        if (actual < cantidad) return false;
        stock.put(p, actual - cantidad);
        kardex.add(new KardexRegistro(p, cantidad, KardexRegistro.Tipo.SALIDA, costoUnitario));
        return true;
    }

    public List<KardexRegistro> getKardex() { return Collections.unmodifiableList(kardex); }
}

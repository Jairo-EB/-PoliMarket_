package empresa;

import java.util.ArrayList;
import java.util.List;
import recursos_humanos.Vendedor;
import ventas.Cliente;

public class Empresa {
    private final String nit;
    private final String nombre;
    private final List<Vendedor> vendedores = new ArrayList<>();
    private final List<Cliente> clientes = new ArrayList<>();

    public Empresa(String nit, String nombre) {
        if (nit == null || nit.isBlank()) throw new IllegalArgumentException("NIT inválido");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre de empresa inválido");
        this.nit = nit;
        this.nombre = nombre;
    }

    public String getNit() { return nit; }
    public String getNombre() { return nombre; }
    public List<Vendedor> getVendedores() { return vendedores; }
    public List<Cliente> getClientes() { return clientes; }

    public void agregarVendedor(Vendedor v) { if (v != null) vendedores.add(v); }
    public void agregarCliente(Cliente c) { if (c != null) clientes.add(c); }
}

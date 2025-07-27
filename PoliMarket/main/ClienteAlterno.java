package main;

import entrega.RegistrarEntrega;
import entrega.ConsultarVentas;

public class ClienteAlterno {
    public static void main(String[] args) {
        String productoId = "P003";
        String clienteId = "C003";

        RegistrarEntrega entrega = new RegistrarEntrega();
        entrega.registrar(productoId, clienteId);

        ConsultarVentas consulta = new ConsultarVentas();
        consulta.consultarPorCliente(clienteId);
    }
}

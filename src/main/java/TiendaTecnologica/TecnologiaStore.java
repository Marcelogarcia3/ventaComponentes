package TiendaTecnologica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TecnologiaStore {
    private List<Cliente> clientes;
    private List<Dispositivo> dispositivos;

    public TecnologiaStore() {
        this.clientes = new ArrayList<>();
        this.dispositivos = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
            System.out.println("Cliente agregado con éxito.");
        } else {
            System.out.println("El cliente ya existe en la tienda.");
        }
    }

    public Venta realizarVenta(Cliente cliente, List<Dispositivo> dispositivos) {
        Venta venta = new Venta(cliente, dispositivos, new Date());
        // Lógica para descontar del stock y otras operaciones relacionadas con la venta
        System.out.println("Venta realizada con éxito.");
        return venta;
    }

    public String obtenerInformacion(Dispositivo dispositivo) {
        return dispositivo.toString();
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
        System.out.println("Dispositivo agregado con éxito.");
    }

    public List<Dispositivo> buscarDispositivos(String criterio) {
        List<Dispositivo> resultados = new ArrayList<>();
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getModelo().equalsIgnoreCase(criterio) ||
                    dispositivo.getMarca().equalsIgnoreCase(criterio) ||
                    dispositivo.getClass().getSimpleName().equalsIgnoreCase(criterio)) {
                resultados.add(dispositivo);
            }
        }
        return resultados;
    }
}

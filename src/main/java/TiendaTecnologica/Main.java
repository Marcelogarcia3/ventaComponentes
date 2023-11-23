package TiendaTecnologica;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TecnologiaStore tienda = new TecnologiaStore();

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "Perez", "juan@example.com", "123456789", "Soltero", "Ciudad A");
        Cliente cliente2 = new Cliente("Maria", "Gomez", "maria@example.com", "987654321", "Casado", "Ciudad B");

        // Agregar clientes a la tienda
        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        // Crear dispositivos
        ComputadoraEscritorio pc1 = new ComputadoraEscritorio();
        pc1.setMarca("Dell");
        pc1.setModelo("Inspiron");
        pc1.setAñoFabricacion(2021);
        pc1.setPrecio(1200.00);
        pc1.setStock(10);
        pc1.setTarjetaVideo("NVIDIA GeForce GTX 1660");
        pc1.setFuentePoder("500W");
        pc1.setChasis("ATX");

        Notebook notebook1 = new Notebook();
        notebook1.setMarca("HP");
        notebook1.setModelo("Pavilion");
        notebook1.setAñoFabricacion(2022);
        notebook1.setPrecio(800.00);
        notebook1.setStock(15);
        notebook1.setResolucionPantalla("Full HD");
        notebook1.setTipoTeclado("QWERTY");
        notebook1.setBateria(5000);

        // Agregar dispositivos a la tienda
        tienda.agregarDispositivo(pc1);
        tienda.agregarDispositivo(notebook1);

        // Realizar una venta
        List<Dispositivo> dispositivosVenta = new ArrayList<>();
        dispositivosVenta.add(pc1);
        dispositivosVenta.add(notebook1);

        tienda.realizarVenta(cliente1, dispositivosVenta);

        // Mostrar información de dispositivos
        System.out.println("Información del PC 1:\n" + tienda.obtenerInformacion(pc1));
        System.out.println("Información del Notebook 1:\n" + tienda.obtenerInformacion(notebook1));

        // Buscar dispositivos por modelo
        String criterioBusqueda = "Pavilion";
        List<Dispositivo> resultadosBusqueda = tienda.buscarDispositivos(criterioBusqueda);

        System.out.println("Resultados de la búsqueda para '" + criterioBusqueda + "':");
        for (Dispositivo dispositivo : resultadosBusqueda) {
            System.out.println(tienda.obtenerInformacion(dispositivo));
        }
    }
}


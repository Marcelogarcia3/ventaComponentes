package TiendaTecnologica;

import java.util.Date;
import java.util.List;

class Venta {
    private Cliente cliente;
    private List<Dispositivo> dispositivos;
    private Date fecha;

    public Venta(Cliente cliente, List<Dispositivo> dispositivos, Date fecha) {
        this.cliente = cliente;
        this.dispositivos = dispositivos;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(List<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta: Cliente=" + cliente +
                ", Dispositivos=" + dispositivos +
                ", Fecha=" + fecha;
    }
}

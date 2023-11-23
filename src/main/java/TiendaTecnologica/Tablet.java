package TiendaTecnologica;

import java.util.List;

class Tablet extends Dispositivo {
    private String resolucionPantalla;
    private List<String> accesorios;

    public Tablet(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, double precio, int stock) {
        super();
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public List<String> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(List<String> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Resolución de Pantalla=" + resolucionPantalla +
                ", Accesorios=" + accesorios;
    }
}

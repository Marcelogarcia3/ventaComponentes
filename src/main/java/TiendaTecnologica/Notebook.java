package TiendaTecnologica;

class Notebook extends Dispositivo {
    private String resolucionPantalla;
    private String tipoTeclado;
    private int bateria;

    public Notebook(String marca, int memoriaRAM, int almacenamiento, String procesador, String modelo, int añoFabricacion, double precio, int stock) {
        super();
    }

    public Notebook() {
        super();
    }


    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Resolución de Pantalla=" + resolucionPantalla +
                ", Tipo de Teclado=" + tipoTeclado +
                ", Batería=" + bateria;
    }
}

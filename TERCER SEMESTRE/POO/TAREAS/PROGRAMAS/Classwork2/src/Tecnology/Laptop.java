public class Laptop extends Tecnologia {
    private String procesador;
    private String tarjetaGrafica;
    private int tamanioBateria;

    public Laptop(String marca, String modelo, double tamanio, String procesador, String tarjetaGrafica, int tamanioBateria) {
        super(marca, modelo, tamanio);
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanioBateria = tamanioBateria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getTamanioBateria() {
        return tamanioBateria;
    }

    public void setTamanioBateria(int tamanioBateria) {
        this.tamanioBateria = tamanioBateria;
    }

    @Override
    public String toString(){
        return "Marca >> "+getMarca()+"\nModelo >> "+getModelo()+"\nTamanio >> "+getTamanio()+"\nProcesador >> "+getProcesador()+"\nTarjeta Grafica >> "+getTarjetaGrafica()+"\nTamanio de Bateria >> "+getTamanioBateria();
    }
}

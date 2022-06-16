public class Pc extends Tecnologia{
    private String procesador;
    private String tarjetaGrafica;

    public Pc(String marca, String modelo, double tamanio, String procesador, String tarjetaGrafica) {
        super(marca, modelo, tamanio);
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
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

    @Override
    public String toString(){
        return "Marca >> "+getMarca()+"\nModelo >> "+getModelo()+"\nTamanio >> "+getTamanio()+"\nProcesador >> "+getProcesador()+"\nTarjeta Grafica >> "+getTarjetaGrafica();
    }
}

public class Tecnologia {
    private String marca;
    private String modelo;
    private double tamanio;

    public Tecnologia(String marca, String modelo, double tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    @Override
    public String toString(){
        return "\nMarca >> "+marca+"\nModelo >> "+modelo+"\nTamanio >> "+tamanio;
    }

}

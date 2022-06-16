public class Impresora extends Tecnologia{
    private String tipo;

    public Impresora(String marca, String modelo, double tamanio, String tipo) {
        super(marca, modelo, tamanio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString(){
        return "Marca >> "+getMarca()+"\nModelo >> "+getModelo()+"\nTamanio >> "+getTamanio();
    }
}

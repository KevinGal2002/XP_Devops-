public class Television extends Tecnologia{
    private String definicion;

    public Television(String marca, String modelo, double tamanio, String definicion) {
        super(marca, modelo, tamanio);
        this.definicion = definicion;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String toString(){
        return "Marca >> "+getMarca()+"\nModelo >> "+getModelo()+"\nTamanio >> "+getTamanio()+"\nDefinicion >> "+getDefinicion();
    }
}

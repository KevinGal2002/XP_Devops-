public class ConsolaVideojuegos extends Celular{
    private String generacion;

    public ConsolaVideojuegos(String marca, String modelo, double tamanio, int almacenamiento, int ram, String generacion) {
        super(marca, modelo, tamanio, almacenamiento, ram);
        this.generacion = generacion;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    @Override
    public String toString(){
        return "Marca >> "+getMarca()+"\nModelo >> "+getModelo()+"\nGeneracion >> "+getGeneracion()+"\nTamanio >> "+getTamanio()+"\nAlmacenamiento >> "+getAlmacenamiento()+"\nRam >> "+getRam();
    }
}

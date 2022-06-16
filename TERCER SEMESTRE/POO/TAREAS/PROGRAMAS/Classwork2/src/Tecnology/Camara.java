public class Camara extends Tecnologia{
    private int lentes;
    private String resolucion;

    public Camara(String marca, String modelo, double tamanio, int lentes, String resolucion) {
        super(marca, modelo, tamanio);
        this.lentes = lentes;
        this.resolucion = resolucion;
    }

    public int getLentes() {
        return lentes;
    }

    public void setLentes(int lentes) {
        this.lentes = lentes;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    @Override
    public String toString(){
        return "Marca >> "+getMarca()+"\nModelo >> "+getModelo()+"\nTamanio >> "+getTamanio()+"\nNumero de Lentes >> "+getLentes()+"\nResolucion >> "+getResolucion();
    }
}

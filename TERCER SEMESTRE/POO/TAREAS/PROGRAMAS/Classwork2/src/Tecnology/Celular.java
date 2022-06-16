public class Celular extends  Tecnologia {
    private int almacenamiento;
    private int ram;

    public Celular(String marca, String modelo, double tamanio, int almacenamiento, int ram) {
        super(marca, modelo, tamanio);
        this.almacenamiento = almacenamiento;
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String toString(){
        return "Marca >> "+getMarca()+"\nModelo >> "+getModelo()+"\nTamanio >> "+getTamanio()+"\nAlmacenamiento >> "+getAlmacenamiento()+"\nRam >> "+getRam();
    }
}

public class Parlantes extends Tecnologia{
    private String potencia;

    public Parlantes(String marca, String modelo, double tamanio, String potencia) {
        super(marca, modelo, tamanio);
        this.potencia = potencia;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    @Override
    public String toString(){
        return "Marca >> "+getMarca()+"\nModelo >> "+getModelo()+"\nTamanio >> "+getTamanio()+"\nPotencia >> "+getPotencia();
    }
}

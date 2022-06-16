public abstract class FigurasGeometricas {
    private int numLados;
    private double lado;

    public FigurasGeometricas(int numLados, double lado) {
        this.numLados = numLados;
        this.lado = lado;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double Perimetro(){
        return getLado()+getLado()+getLado();
    }
    private double Area(){
        return getLado()*getLado();
    }
    @Override
    public String toString(){
        return "La figura de "+numLados+" lados es un "+getClass()+" tiene : \nPerimetro >> "+Perimetro()+"\nArea >> "+Area();
    }
}

public class Rectangul extends FigurasGeometricas{
    private double lado2;

    public Rectangul(int numLados, double lado, double lado2) {
        super(numLados, lado);
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    private double Perimetro(){
        return 2*getLado()+2*getLado2();
    }
    private double Area(){
        return getLado()*getLado2();
    }

}

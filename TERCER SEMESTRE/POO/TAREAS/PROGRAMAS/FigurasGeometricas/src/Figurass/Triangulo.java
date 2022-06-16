public class Triangulo extends FigurasGeometricas{
    private double base;
    private double altura;

    public Triangulo(int numLados, double lado, double base, double altura) {
        super(numLados, lado);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    private double Perimetro(){
        return getLado()+getLado()+getLado();
    }
    private double Area(){
        return (getBase()*getAltura())/2;
    }
}

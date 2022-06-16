public class Cuadrado  extends  FigurasGeometricas{
    public Cuadrado(int numLados, double lado) {
        super(numLados, lado);
    }
    private double Perimetro(){
        return 4*getLado();
    }
    private double Area(){
        return getLado()*getLado();
    }
}

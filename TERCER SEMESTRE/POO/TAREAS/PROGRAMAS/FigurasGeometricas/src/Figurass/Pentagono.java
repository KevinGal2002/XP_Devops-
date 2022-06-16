public class Pentagono extends FigurasGeometricas {
    private double apotema;

    public Pentagono(int numLados, double lado, double apotema) {
        super(numLados, lado);
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    private double Perimetro(){
        return 5*getLado();
    }
    private double Area(){
        return (Perimetro()*getApotema())/2;
    }

}

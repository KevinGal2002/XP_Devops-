package Seleccion;

public class futbolista extends SeleccionFutbol{

    private int velocidad;
    private int resistencia;



    public futbolista(int id, String nombre, String apellido, int edad, int velocidad, int resistencia) {
        super(id, nombre, apellido, edad);
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public void jugarPartido(){
        System.out.println("jugar partido");
    };
    public void Entrenar(){
        System.out.println("Entrenar");
    };

}

package Seleccion;

public class entrenador extends SeleccionFutbol{

    private String idFederacion;
    private int experiencia;



    public entrenador(int id, String nombre, String apellido, int edad, String idFederacion, int experiencia) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
        this.experiencia = experiencia;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public void dirigirPartido(){
        System.out.println("Dirigir Partido");
    };
}

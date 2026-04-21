package EquipoFutbol;

public class Entrenador extends SeleccionFutbol{
    protected String idFederacion;

    //constructor
    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion=idFederacion;
    }

    //getters y setters
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    //metodos propios
    public void dirigirPartido(){
        System.out.println("Metodo dirigir partido");
    }

    public void dirigirEntrenamiento(){
        System.out.println("Metodo dirigir entrenamiento");
    }

    //toString

    @Override
    public String toString() {
        return "Entrenador{" +
                "idFederacion='" + idFederacion + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    //TOCO CODIGO DE VIAJAR
    @Override
    public void viajar(){
        super.viajar();
        System.out.println("El entrenador viaja en clase bussines");
    }
}
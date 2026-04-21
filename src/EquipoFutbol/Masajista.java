package EquipoFutbol;

public class Masajista extends SeleccionFutbol{
    protected String Titulacion;
    protected int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String Titulacion,
                     int aniosExperiencia){
        super(id, nombre, apellidos, edad);
        this.Titulacion=Titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }

    //getters y setters
    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //metodos propios
    public void darMasaje(){
        System.out.println("Metodo dar masaje");
    }

    //toString
    @Override
    public String toString() {
        return "Masajista{" +
                "Titulacion='" + Titulacion + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
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
        System.out.println("El masajista viaja en la bodega");
    }
}

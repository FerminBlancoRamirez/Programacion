package EquipoFutbol;

public class Futbolista extends SeleccionFutbol{
    protected int dorsal;
    protected String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal,
                      String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    //getters y setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    //metodos propios
    public void jugarPartido(){
        System.out.println("Metodo jugar partido");
    }

    public void entrenar(){
        System.out.println("Metodo entrenar");
    }

    //toString
    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", demarcacion='" + demarcacion + '\'' +
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
        System.out.println("El futbolista viaja en clase turista");
    }
}

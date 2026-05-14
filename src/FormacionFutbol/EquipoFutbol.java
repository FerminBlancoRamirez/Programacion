package FormacionFutbol;

import java.util.ArrayList;

public class EquipoFutbol {
    private String nombre;
    private String pais;
    private Portero portero;
    private ArrayList<Defensas> defensas;
    private ArrayList<Mediocentros> mediocentros;
    private Entrenador entrenador;
    private ArrayList<Delanteros> delanteros;


    public EquipoFutbol(String nombre, String pais,
                        Portero portero, ArrayList<Defensas> defensas,
                        ArrayList<Mediocentros> mediocentros, Entrenador entrenador, ArrayList<Delanteros>
                                delanteros) {
        this.nombre=nombre;
        this.pais=pais;
        this.portero = portero;
        this.defensas = defensas;
        this.mediocentros = mediocentros;
        this.entrenador = new Entrenador(entrenador.getNombre(), entrenador.getEdad(),
                entrenador.getAñosExperiencia(), entrenador.isNacional());
        this.delanteros =delanteros;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "EquipoFutbol{" +
                "nombre='" + nombre + '\'' +"\n"+
                ", pais='" + pais + '\'' +"\n"+
                ", portero=" + portero +"\n"+
                ", defensas=" + defensas +"\n"+
                ", mediocentros=" + mediocentros +"\n"+
                ", entrenador=" + entrenador +"\n"+
                ", delanteros=" + delanteros +"\n"+
                '}';
    }
}

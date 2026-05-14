package FormacionFutbol;

public class Entrenador extends Persona{
    private int añosExperiencia=0;
    private boolean nacional=true;

    public Entrenador(String nombre, int edad, int añosExperiencia, boolean nacional) {
        super(nombre, edad);
        this.añosExperiencia = añosExperiencia;
        this.nacional = nacional;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "añosExperiencia=" + añosExperiencia +
                ", nacional=" + nacional +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

package FormacionFutbol;

public class Mediocentros extends Jugador{
    private int numeroAsistencias=0;

    public Mediocentros(String nombre, int edad, boolean titular, int numeroAsistencias) {
        super(nombre, edad, titular);
        this.numeroAsistencias = numeroAsistencias;
    }

    public int getNumeroAsistencias() {
        return numeroAsistencias;
    }

    public void setNumeroAsistencias(int numeroAsistencias) {
        this.numeroAsistencias = numeroAsistencias;
    }

    @Override
    public String toString() {
        return "Mediocentros{" +
                "numeroAsistencias=" + numeroAsistencias +
                ", titular=" + titular +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

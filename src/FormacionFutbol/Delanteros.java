package FormacionFutbol;

public class Delanteros  extends Jugador{

    private int goles =0;

    public Delanteros(String nombre, int edad, boolean titular, int goles) {
        super(nombre, edad, titular);
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Delanteros{" +
                "delantero=" + goles +
                ", titular=" + titular +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

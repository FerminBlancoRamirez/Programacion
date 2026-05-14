package FormacionFutbol;

public class Portero extends Jugador{
    private int cantidadGoles=0;

    public Portero(String nombre, int edad, boolean titular, int cantidadGoles) {
        super(nombre, edad, titular);
        this.cantidadGoles = cantidadGoles;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    @Override
    public String toString() {
        return "Portero{" +
                "cantidadGoles=" + cantidadGoles +
                ", titular=" + titular +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

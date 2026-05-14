package FormacionFutbol;

public class Defensas extends Jugador{

    public Defensas(String nombre, int edad, boolean titular) {
        super(nombre, edad, titular);
    }

    @Override
    public String toString() {
        return "Defensas{" +
                "titular=" + titular +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

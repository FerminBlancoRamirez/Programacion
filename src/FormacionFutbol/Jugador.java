package FormacionFutbol;

public abstract class Jugador extends Persona{
    protected boolean titular=true;

    public Jugador(String nombre, int edad, boolean titular) {
        super(nombre, edad);
        this.titular = titular;
    }
}

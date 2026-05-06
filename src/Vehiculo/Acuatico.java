package Vehiculo;

public class Acuatico extends vehiculo implements Vela{
    enum tipo{
        SUPERFICIE, SUBMARINO
    }
    private tipo tipo;
    private int capacidadPasajeros;

    public Acuatico(int velocidadActual, int velocidadMaxima, tipo tipo, int capacidadPasajeros){
        super(velocidadActual, velocidadMaxima);
        this.tipo=tipo;
        this.capacidadPasajeros=capacidadPasajeros;
    }

    //getters y setters
    public tipo getTipo() {
        return tipo;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    //metodos abstractos heredados
    @Override
    public void acelerar(int velocidad){
        if (getVelocidadActual()+velocidad>getVelocidadMaxima()){
            this.velocidadActual=getVelocidadMaxima();
        }else {
            int nuevaVelocidad=getVelocidadActual()+velocidad;
            this.velocidadActual=nuevaVelocidad;
        }
    }

    @Override
    public void frenar(int velocidad){
        if (getVelocidadActual()==0){
            this.velocidadActual=0;
        } else if (getVelocidadActual()-velocidad<0) {
            this.velocidadActual=0;
        }else {
            int nuevaVelocidad= getVelocidadActual()-velocidad;
            this.velocidadActual=nuevaVelocidad;
        }
    }

    //Metodo de la interfaz
    @Override
    public void recomendarVelocidad(int velocidadViento){
        if (velocidadViento>80){
            System.out.println("La velocidad del viento es demasiado fuerte" +
                    " para salir a navegar hoy");
            this.velocidadActual=0;
        } else if (velocidadViento<10) {
            System.out.println("La velocidad del viento de hoy es demasiado bajara " +
                    "para salir a navegar");
            this.velocidadActual=0;
        }
    }

    @Override
    public String toString() {
        return "Acuatico{" +
                "tipo=" + tipo +
                ", capacidadPasajeros=" + capacidadPasajeros +
                ", velocidadActual=" + velocidadActual +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}

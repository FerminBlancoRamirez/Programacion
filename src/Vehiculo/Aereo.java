package Vehiculo;

import java.util.Random;

public class Aereo extends vehiculo implements Reactor, Alas{
    private String nombre;

    public Aereo(int velocidadActual, int velocidadMaxima, String nombre){
        super(velocidadActual, velocidadMaxima);
        this.nombre=nombre;
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos propios de la clase
    public void despegar(){
        System.out.println("El "+nombre+" esta despegando");
    }

    public void aterrizar(){
        System.out.println("El "+nombre+" se dispone a aterrizar en pista");
    }

    public void volar(){
        Random random=new Random();
        int horasVuelo= random.nextInt(24);
        System.out.println("El "+nombre+" se encuentra en pleno vuelo aun quedan "+ horasVuelo+
                "horas de vuelo");
    }

    //metodos heredados
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

    //metodos de las interfaces
    @Override
    public void encender(){
        System.out.println("El reactor esta encendido");
    }

    @Override
    public void apagar(){
        System.out.println("El reactor esta apagado");
    }

    @Override
    public void soltarTren(){
        System.out.println("Bajando el tren de aterrizaje");
    }

    @Override
    public void subirTren(){
        System.out.println("Subiendo tren de aterrizaje");
    }

    @Override
    public String toString() {
        return "Aereo{" +
                "nombre='" + nombre + '\'' +
                ", velocidadActual=" + velocidadActual +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}

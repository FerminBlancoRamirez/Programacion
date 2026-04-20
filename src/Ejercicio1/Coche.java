package Ejercicio1;

public class Coche extends Vehiculo{
    private static int numeroPuertas;

    //constructor con extension de la clase padre
    public Coche(String marca, String modelo, int velocidadMaxima, int numeroPuertas){
        super(marca, modelo, velocidadMaxima);//usa los atributos heredados de la clase padre
        this.numeroPuertas=numeroPuertas;
    }

    //getter setters
    public static int getNumeroPuertas() {
        return numeroPuertas;
    }

    public static void setNumeroPuertas(int numeroPuertas) {
        Coche.numeroPuertas = numeroPuertas;
    }

    //metodo sobreescribido
    @Override
    public void describe(){
        super.describe();
        System.out.println("El numero de puertas es de: "+numeroPuertas);
    }
}

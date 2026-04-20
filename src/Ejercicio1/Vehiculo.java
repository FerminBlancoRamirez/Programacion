package Ejercicio1;
//Ejercicio 1: Vehículos
//Crea una clase base Vehiculo con atributos marca, modelo y velocidadMaxima, y un método describir().
// Luego crea las subclases Coche y Moto, cada una con un atributo propio (numeroPuertas y tieneSidecar respectivamente).
// Sobreescribe describir() en cada subclase para mostrar también el atributo propio.


public class Vehiculo {
    protected  String marca;
    protected  String modelo;
    protected  int velocidadMaxima;

    //constructor
    public Vehiculo(String marca, String modelo, int velocidadMaxima){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //metodos
    public void describe(){
        System.out.println("El modelo es: "+modelo);
        System.out.println("La marca es: "+marca);
        System.out.println("La velocidad maxima que puede alcanzar es de: "+velocidadMaxima);
    }
}

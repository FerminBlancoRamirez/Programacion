package bucle;

import java.util.Random;

public class ContraRelojista extends Ciclista{
    protected double velocidadMaxima;

    public ContraRelojista(int dorsal, String nombre, double velocidadMaxima){
        super(dorsal, nombre);
        this.velocidadMaxima=velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "ContraRelojista{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", dorsal=" + dorsal +
                ", tiempo=" + tiempo +
                ", nombre='" + nombre + '\'' +
                ", tiempoAcumulado=" + tiempoAcumulado +
                '}';
    }

     @Override
     public void correrEtapa() {
         Random rd = new Random();
         // Random rd = new Random();
         int tiempoEtapa = rd.nextInt(21600 - 7200) + 1 + 7200;
         double tiempoRestado=tiempoEtapa -(10*this.velocidadMaxima);
         this.tiempo = (int)tiempoRestado;
         this.tiempoAcumulado += tiempoEtapa;
     }
}

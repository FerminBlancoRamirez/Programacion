package bucle;

import java.util.Random;

public class Velocista extends Ciclista{
    protected double potenciaPromedio;
    protected double velocidadPromedio;

    public Velocista(int dorsal, String nombre, double potenciaPromedio, double velocidadPromedio){
        super(dorsal, nombre);
        this.potenciaPromedio=potenciaPromedio;
        this.velocidadPromedio=velocidadPromedio;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String toString() {
        return "Velocista{" +
                "potenciaPromedio=" + potenciaPromedio +
                ", velocidadPromedio=" + velocidadPromedio +
                ", dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                ", tiempoAcumulado=" + tiempoAcumulado +
                '}';
    }


   /* @Override
    public void correrEtapa(){
       Random rd = new Random();
        int tiempoEtapa= rd.nextInt(21600-7200)+1+7200-5*(int)potenciaPromedio;
        this.tiempo=tiempoEtapa;
        this.tiempoAcumulado+=tiempoEtapa;
    }*/
}


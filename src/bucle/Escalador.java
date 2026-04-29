package bucle;

import java.util.Random;

public class Escalador extends Ciclista{
    protected double aceleracionPromedio;
    protected double gradoRampa;

    public Escalador(int dorsal, String nombre, double aceleracionPromedio, double gradoRampa){
        super(dorsal, nombre);
        this.aceleracionPromedio=aceleracionPromedio;
        this.gradoRampa=gradoRampa;
    }

    public double getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(double aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public double getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String toString() {
        return "Escalador{" +
                "aceleracionPromedio=" + aceleracionPromedio +
                ", gradoRampa=" + gradoRampa +
                ", dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                ", tiempoAcumulado=" + tiempoAcumulado +
                '}';
    }


     @Override
     public void correrEtapa() {
         Random rd = new Random();

         // Random rd = new Random();
         int tiempoEtapa = rd.nextInt(21600 - 7200) + 1 + 7200;
         int tiempoRestado= tiempoEtapa-(5*(int)this.aceleracionPromedio +4*(int)this.gradoRampa);
         this.tiempo = tiempoRestado;
         this.tiempoAcumulado += tiempoEtapa;
     }
}

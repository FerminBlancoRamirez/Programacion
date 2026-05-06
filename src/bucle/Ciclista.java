package bucle;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Ciclista implements Comparable<Ciclista> {
    protected int dorsal;
    protected String nombre;
    protected int tiempo=0;//segundos
    protected int tiempoAcumulado=0;
    protected int posicionGen;

    public Ciclista(int dorsal, String nombre) {
        this.dorsal = dorsal;
        this.nombre = nombre;
    }

    //Herencia y polimorfismo
    //public abstract String imprimirTipo(); //velo, crono y escala

    //getters y setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected int getPosicionGen(){
        return posicionGen;
    }

    protected void setPosicionGen(int posicionGen){
        this.posicionGen = posicionGen;
    }

    public void correrEtapa(){
        Random rd = new Random();
        int tiempoEtapa= rd.nextInt(21600-7200)+1+7200;
        this.tiempo=tiempoEtapa;
        this.tiempoAcumulado+=tiempoEtapa;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                ", tiempoAcumulado=" + tiempoAcumulado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ciclista ciclista = (Ciclista) o;
        return tiempo == ciclista.tiempo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tiempo);
    }

    @Override
    public int compareTo(Ciclista otro) {
        return Integer.compare(this.tiempo, otro.tiempo);
    }
}

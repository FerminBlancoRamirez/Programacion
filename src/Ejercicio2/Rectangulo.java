package Ejercicio2;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    //constructor
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double area(){
        double area= this.base*this.altura;
        return area;
    }
}

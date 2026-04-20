package Ejercicio2;

public class Circulo extends Figura{
    private double radio;

    //constructor
    public Circulo(double radio){
        this.radio=radio;
    }

    //metodo de area
    public double area(){
        double area=3.1416*(this.radio*this.radio);
        return area;
    }
}

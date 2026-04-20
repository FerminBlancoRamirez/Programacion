package Ejercicio4;

public class Pajaro extends Animal{
    public Pajaro(String nombre){
        super(nombre);
    }

    @Override
    public String hacerSonido(){
        return "PIO PIO PIO";
    }
}

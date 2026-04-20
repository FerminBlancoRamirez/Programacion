package Ejercicio3;
//Ejercicio 3: Empleados
//Crea una clase Empleado con nombre y salarioBase.
// Añade una subclase Gerente que tenga un bonus adicional.
// En el constructor de Gerente usa super(...) para inicializar los campos heredados.
// Añade un método calcularSalarioTotal() en ambas clases.

public class Empleado {
    protected String nombre;
    protected int salarioBase;

    //constructor
    public Empleado(String nombre, int salarioBase){
        this.nombre=nombre;
        this.salarioBase=salarioBase;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    //metodo
    public int calcularSalarioTotal(){
        return this.salarioBase;
    }
}

package Ejercicio3;

public class Gerente extends Empleado{
    private int bonus;

    //constructor
    public Gerente(String nombre, int salarioBase, int bonus){
        super(nombre, salarioBase);
        this.bonus=bonus;
    }

    //getter y setter
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    //metodo sobreescribido para adaptarlo
    @Override
    public int calcularSalarioTotal(){
        int salarioFinal=super.calcularSalarioTotal()+this.bonus;
        return salarioFinal;
    }
}

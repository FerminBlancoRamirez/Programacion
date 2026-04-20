package Ejercicio3;

public class Testeo {
    public static void main(String[] args) {
        Empleado e1=new Empleado("Juan", 1500);
        System.out.println("El empleado "+e1.getNombre()+" tiene un salario de: "+ e1.calcularSalarioTotal()+" euros");
        Gerente g1=new Gerente("Ramon", 2000, 200);
        System.out.println("El gerente "+g1.getNombre()+ " tiene un salario total de: "+ g1.calcularSalarioTotal()+" euros");
    }
}

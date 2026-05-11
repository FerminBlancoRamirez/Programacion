package peaje;

import java.util.ArrayList;

public class TesteoPeaje {
    public static void main(String[] args) {
        Peaje peaje=new Peaje("Vigo-Santiago", "Avenida Constitucion 42");
        peaje.anadirVehiculo(new Carro("ABC4242"));
        peaje.anadirVehiculo(new Camion("AB1212AB", 6));
        peaje.anadirVehiculo(new Moto("1234CV"));
        ArrayList<Vehiculo> coches=peaje.getVehiculos();
        for (Vehiculo vehiculo: coches){
            if (vehiculo instanceof Carro){
                System.out.println("El carro: ");
                vehiculo.imprimir();
                System.out.println("Tiene que pagar un peaje de: ");
                System.out.println(peaje.calcularPeaje(vehiculo)+" euros");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
            } else if (vehiculo instanceof Camion) {
                System.out.println("El camion: ");
                vehiculo.imprimir();
                System.out.println("Tiene que pagar un peaje de: ");
                System.out.println(peaje.calcularPeaje(vehiculo)+" euros");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
            }else if (vehiculo instanceof Moto){
                System.out.println("La moto: ");
                vehiculo.imprimir();
                System.out.println("Tiene que pagar un peaje de: ");
                System.out.println(peaje.calcularPeaje(vehiculo)+" euros");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
            }else {
                System.out.println("Vehiculo no identificado");
                System.out.println("-------------------------------------------------------");
                System.out.println("");
            }
        }
        peaje.imprimir();
    }
}
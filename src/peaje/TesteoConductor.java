package peaje;

public class TesteoConductor {
    public static void main(String[] args) {
        Peaje peaje=new Peaje("Vigo-Santiago", "Avenida Constitucion 42");
        Conductor Pepe= new Conductor("Pepe", 55662233, "1978-04-09");

        Pepe.agregarVehiculo(new Camion("AB55BXC", 4));
        Pepe.agregarVehiculo(new Carro("CMC435656"));
        Pepe.agregarVehiculo(new Moto("CMI225656"));
        peaje.costeConductor(Pepe);
    }
}

package peaje;

public abstract class Vehiculo {
    //No instanciable
    protected String placa; //Atributo que define la placa de un vehiculo

    public Vehiculo(String placa){
        this.placa=placa;
    }
}

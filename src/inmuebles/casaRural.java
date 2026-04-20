package inmuebles;

public class casaRural extends casa{
    protected int distanciaCentro;
    protected int altitud;

    //constructor
    public casaRural(int id, int area, String direccion, int numHabitaciones, int numBaños, int numPisos, int distanciaCentro,
    int altitud){
        super(id, area, direccion, numHabitaciones, numBaños, numPisos);
        this.distanciaCentro=distanciaCentro;
        this.altitud=altitud;
    }

    //metodo heredado para saber el nombre del inmueble
    @Override
    public String nombreInmueble(){
        return "Casa rural";
    }

    @Override
    public String toString() {
        return "casaRural{" +
                "distanciaCentro=" + distanciaCentro +
                ", altitud=" + altitud +
                ", numPisos=" + numPisos +
                ", numHabitaciones=" + numHabitaciones +
                ", numBaños=" + numBaños +
                ", id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta()  +
                '}';
    }
}

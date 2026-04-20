package inmuebles;

public class CasaIndependiente extends CasaUrbana{
    public CasaIndependiente(int id, int area, String direccion, int numHabitaciones, int numBaños, int numPisos){
        super(id, area, direccion, numHabitaciones, numBaños, numPisos);
    }

    @Override
    public String nombreInmueble(){
        return "Casa independiente";
    }

    @Override
    public String toString() {
        return "CasaIndependiente{" +
                "precioVenta=" + getPrecioVenta() +
                ", direccion='" + direccion + '\'' +
                ", area=" + area +
                ", id=" + id +
                ", numBaños=" + numBaños +
                ", numHabitaciones=" + numHabitaciones +
                ", numPisos=" + numPisos +
                '}';
    }
}

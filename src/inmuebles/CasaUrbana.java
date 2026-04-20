package inmuebles;

public abstract class CasaUrbana extends casa{
    //constructor
    public CasaUrbana(int id, int area, String direccion, int numHabitaciones, int numBaños, int numPisos){
        super(id, area, direccion, numHabitaciones, numBaños, numPisos);
    }

    //toString
    @Override
    public String toString() {
        return "CasaUrbana{" +
                "numPisos=" + numPisos +
                ", numHabitaciones=" + numHabitaciones +
                ", numBaños=" + numBaños +
                ", id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + precioVenta +
                '}';
    }
}

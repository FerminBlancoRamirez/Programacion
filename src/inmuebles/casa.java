package inmuebles;


public abstract class casa extends vivienda{
    protected int numPisos;

    //constructor
    public casa(int id, int area, String direccion, int numHabitaciones, int numBaños, int numPisos){
        super(id, area, direccion, numHabitaciones, numBaños);
        this.numPisos=numPisos;
    }

    //toString
    @Override
    public String toString() {
        return "casa{" +
                "numPisos=" + numPisos +
                ", numHabitaciones=" + numHabitaciones +
                ", numBaños=" + numBaños +
                ", area=" + area +
                ", id=" + id +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                '}';
    }
}
package inmuebles;

public abstract class vivienda extends inmueble{
    protected int numHabitaciones;
    protected int numBaños;

    //constructor
    public vivienda(int id, int area, String direccion, int numHabitaciones, int numBaños){
        super(id, area, direccion);
        this.numHabitaciones=numHabitaciones;
        this.numBaños=numBaños;
    }

    //metodo heredado que dice el nombre del inmueble
    // no hace falta ya que no es una clase la cual tenga valor en la lista


    //metodo toString
    @Override
    public String toString() {
        return "vivienda{" +
                "numHabitaciones=" + numHabitaciones +
                ", numBaños=" + numBaños +
                ", id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + precioVenta +
                '}';
    }
}
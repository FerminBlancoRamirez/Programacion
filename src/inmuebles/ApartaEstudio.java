package inmuebles;

public class ApartaEstudio extends apartamento{

    public ApartaEstudio(int id, int area, String direccion,int numHabitaciones, int numBaños){
        super(id, area, direccion, numHabitaciones, numBaños);
    }

    @Override
    public String nombreInmueble(){
        return "Apartamento estudio";
    }

    @Override
    public String toString() {
        return "ApartaEstudio{" +
                "precioVenta=" + getPrecioVenta()+
                ", direccion='" + direccion + '\'' +
                ", area=" + area +
                ", id=" + id +
                ", numBaños=" + numBaños +
                ", numHabitaciones=" + numHabitaciones +
                '}';
    }
}

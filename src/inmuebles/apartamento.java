package inmuebles;

public class apartamento extends vivienda{
    //no hay atributos nuevos
    public apartamento(int id, int area, String direccion,int numHabitaciones, int numBaños){
        super(id, area, direccion, numHabitaciones, numBaños);
    }

    //metodo heredado que dice el nombre del inmueble
    @Override
    public String nombreInmueble(){
        return "Apartamento";
    }


    //toString
    @Override
    public String toString() {
        return "apartamento{" +
                "precioVenta=" + getPrecioVenta()+
                ", direccion='" + direccion + '\'' +
                ", area=" + area +
                ", id=" + id +
                '}';
    }
}

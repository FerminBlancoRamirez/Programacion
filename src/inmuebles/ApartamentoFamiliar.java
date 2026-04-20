package inmuebles;

public class ApartamentoFamiliar extends apartamento{
    protected int valorAdministracion;

    //constructor
    public ApartamentoFamiliar(int id, int area, String direccion,int numHabitaciones, int numBaños, int valorAdministracion){
        super(id,area,direccion,numHabitaciones,numBaños);
        this.valorAdministracion=valorAdministracion;
    }

    @Override
    public String nombreInmueble(){
        return "Apartamento familiar";
    }

    @Override
    public String toString() {
        return "ApartamentoFamiliar{" +
                "valorAdministracion=" + valorAdministracion +
                ", numHabitaciones=" + numHabitaciones +
                ", numBaños=" + numBaños +
                ", id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                '}';
    }
}

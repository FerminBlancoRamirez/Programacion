package inmuebles;

public class CasaUrbanizacion extends CasaUrbana{
    protected int valorAdministracion;
    protected boolean tienePiscina=true;
    protected boolean tieneCampoDeportivo=true;

    //constructor
    public CasaUrbanizacion(int id, int area, String direccion, int numHabitaciones, int numBaños, int numPisos,
                            int valorAdministracion, boolean tienePiscina, boolean tieneCampoDeportivo){
        super(id, area, direccion, numHabitaciones, numBaños, numPisos);
        this.valorAdministracion=valorAdministracion;
        this.tienePiscina=tienePiscina;
        this.tieneCampoDeportivo=tieneCampoDeportivo;
    }

    //metodo heredado para saber el nombre del inmuebleç
    @Override
    public String nombreInmueble(){
        return "Casa en conjunto cerrado";
    }

    //toString
    @Override
    public String toString() {
        return "CasaUrbanizacion{" +
                "valorAdministracion=" + valorAdministracion +
                ", tienePiscina=" + tienePiscina +
                ", tieneCampoDeportivo=" + tieneCampoDeportivo +
                ", numPisos=" + numPisos +
                ", numHabitaciones=" + numHabitaciones +
                ", numBaños=" + numBaños +
                ", id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                '}';
    }
}

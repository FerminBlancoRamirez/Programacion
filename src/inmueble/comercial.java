package inmueble;

public class comercial extends local{
    public comercial(int id, int area, String direccion){
        super(id, area, direccion);
    }

    //metodo heredado que dice el nombre del inmueble
    @Override
    public String nombreInmueble(){
        return "Comercial";
    }


    //toString
    @Override
    public String toString() {
        return "comercial{" +
                "id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                '}';
    }
}

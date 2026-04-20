package inmueble;

public class local extends inmueble{
    public local(int id, int area, String direccion){
        super(id, area, direccion);
    }

    //metodo heredado que dice el nombre del inmueble
    @Override
    public String nombreInmueble(){
        return "Local";
    }

    //toString
    @Override
    public String toString() {
        return "local{" +
                "id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                '}';
    }
}

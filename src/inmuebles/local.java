package inmuebles;

public abstract class local extends inmueble{
    public enum tipo{
        INERNO, EXTERNO;
    }
    public local(int id, int area, String direccion){
        super(id, area, direccion);
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

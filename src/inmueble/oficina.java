package inmueble;

public class oficina extends local{
    public oficina(int id, int area, String direccion){
        super(id, area, direccion);
    }

    //metodo heredado que dice el nombre del inmueble
    @Override
    public String nombreInmueble(){
        return "Oficina";
    }

    //toString
    @Override
    public String toString() {
        return "oficina{" +
                "precioVenta=" + getPrecioVenta() +
                ", area=" + area +
                ", id=" + id +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

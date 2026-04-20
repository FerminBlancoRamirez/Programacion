package inmueble;

public class vivienda extends inmueble{
    public vivienda(int id, int area, String direccion){
        super(id, area, direccion);
    }

    //metodo heredado que dice el nombre del inmueble
    @Override
    public String nombreInmueble(){
        return "vivienda";
    }



    //metodo toString
    @Override
    public String toString() {
        return "vivienda{" +
                "precioVenta=" + getPrecioVenta() +
                ", direccion='" + direccion + '\'' +
                ", area=" + area +
                ", id=" + id +
                '}';
    }
}

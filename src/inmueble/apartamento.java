package inmueble;

public class apartamento extends vivienda{
    public apartamento(int id, int area, String direccion){
        super(id, area, direccion);
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

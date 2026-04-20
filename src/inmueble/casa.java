package inmueble;

public class casa extends vivienda{
    protected int habitaciones;

    //constructor
    public casa(int id, int area, String direccion, int habitaciones){
        super(id, area, direccion);
        this.habitaciones=habitaciones;
    }

    //metodo heredado con el que decimos que tipo de vivienda es
    @Override
    public String nombreInmueble(){
        return "Casa rural";
    }


    //toString

    @Override
    public String toString() {
        return "casa{" +
                "habitaciones=" + habitaciones +
                ", id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                '}';
    }
}

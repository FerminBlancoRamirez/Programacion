package inmuebles;

public class LocalComercial extends local{
    protected String centroComercial;
    public LocalComercial(int id, int area, String direccion, tipo tipoLocal, String centroComercial){
        super(id, area, direccion);
        this.centroComercial=centroComercial;
    }

    @Override
    public String nombreInmueble(){
        return "Local comercial";
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "centroComercial='" + centroComercial + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                ", direccion='" + direccion + '\'' +
                ", area=" + area +
                ", id=" + id +
                '}';
    }
}

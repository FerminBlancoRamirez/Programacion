package inmuebles;

public class oficina extends local{
    private boolean esPublica;
    public oficina(int id, int area, String direccion, tipo tipo, boolean esPublica){
        super(id, area, direccion);
        this.esPublica=esPublica;
    }

    //metodo heredado que dice el nombre del inmueble
    @Override
    public String nombreInmueble(){
        return "Oficina";
    }

    @Override
    public String toString() {
        return "oficina{" +
                "esPublica=" + esPublica +
                ", id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                '}';
    }
}

package inmuebles;

import java.util.HashMap;
import java.util.Map;

public abstract class inmueble {

    //HashMap con los precios por unidad
    public static final Map<String, Double> precios_area=new HashMap<>();
    public static final void poblar() {
        precios_area.put("Casa rural", 1500.0);
        precios_area.put("Casa en conjunto cerrado", 2500.0);
        precios_area.put("Casa independiente", 3000.0);
        precios_area.put("Apartamento estudio", 1500.0);
        precios_area.put("Apartamento familiar", 2000.0);
        precios_area.put("Local comercial", 3000.0);
        precios_area.put("Oficina", 3500.0);
    }


    protected int id;
    protected int area;
    protected String direccion;
    //atributo que identifca el precio de venta del inmueble
    protected double precioVenta=0d;//no hay precio de venta hasta llegar a algun objeto de la tabla

    //metodo abstracto con el que las clases hijas podran decir su nombre y asi sirva de key para acceder al hashmap y traer su valor unitario por metro cuadrado
    //este metodo sera heredado por las clases hijas para que todas introduzcan el tipo de inmueble que son
    public abstract String nombreInmueble();

    //constructor
    public inmueble(int id, int area, String direccion){
        this.id=id;
        this.area=area;
        this.direccion=direccion;
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //moificamos el metodo getPrecioVenta para que calcule el area de los inmuebles
    public double getPrecioVenta() {
        double valorUnitario = precios_area.get(nombreInmueble());
        return area * valorUnitario;

    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "inmueble{" +
                "id=" + id +
                ", area=" + area +
                ", direccion='" + direccion + '\'' +
                ", precioVenta=" + getPrecioVenta() +//traemos aqui el valor del inmueble
                '}';
    }
}
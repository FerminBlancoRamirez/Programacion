package TiendaMascotas;

public class Mascotas {
    //Atributos
    protected String nombre;
    protected int edad;
    protected String color;
    protected double precioMascota;

    //constructor
    public Mascotas(String nombre, int edad, String color){
        this.nombre=nombre;
        this.edad=edad;
        this.color=color;
    }

    //Getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public double getPrecioMascota() {
        return precioMascota;
    }

    public void setPrecioMascota(double precioMascota) {
        this.precioMascota = precioMascota;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodo precioMascotas
    public void calcularPrecio(){
        this.precioMascota=500.00;
    }
}

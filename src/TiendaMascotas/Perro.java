package TiendaMascotas;

public class Perro extends Mascotas{
    //atributos
    protected double peso;
    protected boolean muerde;
    protected double precioPerro=200;

    //constructor
    public Perro(String nombre, int edad, String color, double peso, boolean muerde){
        super(nombre, edad, color);
        this.peso=peso;
        this.muerde=muerde;
    }

    //getters y setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    public double getPrecioPerro() {
        return precioPerro;
    }

    public void setPrecioPerro(double precioPerro) {
        this.precioPerro = precioPerro;
    }

    //metodos propios y heredados

    public void sonidoPerro(){
        System.out.print("Todos los perros ladran pero mas si lo hace un ");
    }

    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        this.precioMascota+=precioPerro;
    }

    //toString
    @Override
    public String toString() {
        return "Perro{" +
                "peso=" + peso +
                ", muerde=" + muerde +
                ", precioPerro=" + precioPerro +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", precioMascota=" + precioMascota +
                '}';
    }
}

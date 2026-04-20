package TiendaMascotas;

public class Gato extends Mascotas{
    //atributos
    protected double alturaSalto;
    protected double longitudSalto;
    protected double precioGato=200.00;
    //constructo
    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto){
        super(nombre, edad, color);
        this.alturaSalto=alturaSalto;
        this.longitudSalto=longitudSalto;
    }

    //getters y setters
    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(double longitudSalto) {
        this.longitudSalto = longitudSalto;
    }

    public double getPrecioGato() {
        return precioGato;
    }

    public void setPrecioGato(double precioGato) {
        this.precioGato = precioGato;
    }

    //metodos propios y heredados
    public void sonidoGato(){
        System.out.print("Todos los gatos maullan pero mas si es un ");
    }

   @Override
   public void calcularPrecio(){
        super.calcularPrecio();
        this.precioMascota+=precioGato;
   }

   //toString
    @Override
    public String toString() {
        return "Gato{" +
                "alturaSalto=" + alturaSalto +
                ", longitudSalto=" + longitudSalto +
                ", precioGato=" + precioGato +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", precioMascota=" + precioMascota +
                '}';
    }
}

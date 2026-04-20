package TiendaMascotas;

public class PerroPequeño extends Perro{
    //atributos
    protected enum razaPequeño{
        caniche, yorkshire_terrier, schnauzer, chihuahua
    }
    private razaPequeño razaPequeño;

    //constructor
    public PerroPequeño(String nombre, int edad, String color, double peso, boolean muerde, razaPequeño razaPequeño){
        super(nombre, edad, color, peso, muerde);
        this.razaPequeño=razaPequeño;
    }

    //getters y setters
    public razaPequeño getRazaPequeño() {
        return razaPequeño;
    }

    public void setRazaPequeño(razaPequeño razaPequeño) {
        this.razaPequeño = razaPequeño;
    }

    //metodos heredados
    @Override
    public void sonidoPerro(){
        super.sonidoPerro();
        System.out.println(razaPequeño);
    }

    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        double porcentaje=this.precioMascota*0.10;
        this.precioMascota+=porcentaje;
    }

    //toString
    @Override
    public String toString() {
        return "PerroPequeño{" +
                "razaPequeño=" + razaPequeño +
                ", peso=" + peso +
                ", muerde=" + muerde +
                ", precioPerro=" + precioPerro +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", precioMascota=" + precioMascota +
                '}';
    }
}

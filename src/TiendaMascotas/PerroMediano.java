package TiendaMascotas;

public class PerroMediano extends Perro{
    //atributos
    protected enum razaMediano{
        collie, dálmata, bulldog, galgo, sabueso
    }
    private razaMediano razaMediano;

    //constructor
    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, razaMediano razaMediano){
        super(nombre, edad, color, peso, muerde);
        this.razaMediano=razaMediano;
    }

    //getters y setters
    public razaMediano getRazaMediano() {
        return razaMediano;
    }

    public void setRazaMediano(razaMediano razaMediano) {
        this.razaMediano = razaMediano;
    }

    //metodos heredados
    @Override
    public void sonidoPerro(){
        super.sonidoPerro();
        System.out.println(razaMediano);
    }

    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        double porcentaje=this.precioMascota*0.20;
        this.precioMascota+=porcentaje;
    }

    //toString
    @Override
    public String toString() {
        return "PerroMediano{" +
                "razaMediano=" + razaMediano +
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

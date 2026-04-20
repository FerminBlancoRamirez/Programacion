package TiendaMascotas;

public class PerroGrande extends Perro{
    //atributos
    protected enum razaGrande{
        pastor_alemán, doberman, rotweiller
    }
    private razaGrande razaGrande;

    //constructor
    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, razaGrande razaGrande){
        super(nombre, edad, color, peso, muerde);
        this.razaGrande=razaGrande;
    }

    //getters y setters
    public razaGrande getRazaGrande() {
        return razaGrande;
    }

    public void setRazaGrande(razaGrande razaGrande) {
        this.razaGrande = razaGrande;
    }

    //metodos heredados
    @Override
    public void sonidoPerro(){
        super.sonidoPerro();
        System.out.println(razaGrande);
    }

    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        double porcentaje=this.precioMascota*0.35;
        this.precioMascota+=porcentaje;
    }

    //toString
    @Override
    public String toString() {
        return "PerroGrande{" +
                "razaGrande=" + razaGrande +
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

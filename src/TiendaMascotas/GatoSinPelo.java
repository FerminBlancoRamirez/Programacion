package TiendaMascotas;

public class GatoSinPelo extends Gato{
    //atributos
    protected enum razaSinPelo{
        esfinge, elfo, donskoy
    }
    private razaSinPelo razaSinPelo;

    //constructor
    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto,
                       razaSinPelo razaSinPelo){
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razaSinPelo=razaSinPelo;
    }

    //getters y setters
    public razaSinPelo getRazaSinPelo() {
        return razaSinPelo;
    }

    public void setRazaSinPelo(razaSinPelo razaSinPelo) {
        this.razaSinPelo = razaSinPelo;
    }

    //metodos heredados
    @Override
    public void sonidoGato(){
        super.sonidoGato();
        System.out.println(razaSinPelo);
    }

    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        double porcentaje=this.precioMascota*0.40;
        this.precioMascota+=porcentaje;
    }

    //toString
    @Override
    public String toString() {
        return "GatoSinPelo{" +
                "razaSinPelo=" + razaSinPelo +
                ", alturaSalto=" + alturaSalto +
                ", longitudSalto=" + longitudSalto +
                ", precioGato=" + precioGato +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", precioMascota=" + precioMascota +
                '}';
    }
}

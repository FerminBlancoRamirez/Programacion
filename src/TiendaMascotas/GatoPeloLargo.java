package TiendaMascotas;

public class GatoPeloLargo extends Gato{
    //atributos
    protected enum razaPeloLargo{
        angora, himalayo, balinés, somalí
    }
    private razaPeloLargo razaPeloLargo;

    //constructor
    public GatoPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto,
                        razaPeloLargo razaPeloLargo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razaPeloLargo = razaPeloLargo;
    }

    //getters y setters
    public razaPeloLargo getRazaPeloLargo() {
        return razaPeloLargo;
    }

    public void setRazaPeloLargo(razaPeloLargo razaPeloLargo) {
        this.razaPeloLargo = razaPeloLargo;
    }

    //metodos heredados
    @Override
    public void sonidoGato(){
        super.sonidoGato();
        System.out.println(razaPeloLargo);
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
        return "GatoPeloLargo{" +
                "razaPeloLargo=" + razaPeloLargo +
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

package TiendaMascotas;

public class GatoPeloCorto extends Gato{
    //atributos
    protected enum razaPeloCorto{
        azul_ruso, británico, manx, devon_rex
    }
    private razaPeloCorto razaPeloCorto;

    //constructor
    public GatoPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto,
                       razaPeloCorto razaPeloCorto){
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razaPeloCorto=razaPeloCorto;
    }

    //Getters y setters
    public razaPeloCorto getRazaPeloCorto() {
        return razaPeloCorto;
    }

    public void setRazaPeloCorto(razaPeloCorto razaPeloCorto) {
        this.razaPeloCorto = razaPeloCorto;
    }

    //metodos heredados
    @Override
    public void sonidoGato(){
        super.sonidoGato();
        System.out.println(razaPeloCorto);
    }

    @Override
    public void calcularPrecio(){
        super.calcularPrecio();
        double porcentaje=this.precioMascota*0.30;
        this.precioMascota+=porcentaje;
    }

    //toString
    @Override
    public String toString() {
        return "GatoPeloCorto{" +
                "razaPeloCorto=" + razaPeloCorto +
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

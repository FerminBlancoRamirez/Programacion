package medicina;

public class Pediatra extends Medico{
    //Valor enumerado que define tipòlogias de un pediatra
    enum Tipologia{
        NEUROLOGO, PSICOLOGO
    };
    protected Tipologia tipologia;

    public Pediatra(String nombre, Tipologia tipologia){
        super(nombre);
        this.tipologia=tipologia;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

    @Override
    public String toString() {
        return "Pediatra{" +
                "tipologia=" + tipologia +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

package medicina;

public class Ortopedista extends Medico{
    //Valor enumerado para definir diferentes tipos de ortopedistas
    enum Tipologia{
        MAXILOFACIAL, PEDIATRICA
    };
    protected Tipologia tipologia;

    public Ortopedista(String nombre, Tipologia tipologia){
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
        return "Ortopedista{" +
                "tipologia=" + tipologia +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

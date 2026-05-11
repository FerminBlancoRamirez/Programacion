package compo;

public class Recta {
    private Punto inicio;
    private Punto fin;
    private int longitud=0;
    private double pendiente=0D;

    public Recta(Punto inicio, Punto fin){
        this.inicio=inicio;
        this.fin=fin;
        this.longitud=longitud;
        this.pendiente=pendiente;
    }

    public Punto getInicio() {
        return inicio;
    }

    public void setInicio(Punto inicio) {
        this.inicio = inicio;
    }

    public Punto getFin() {
        return fin;
    }

    public void setFin(Punto fin) {
        this.fin = fin;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //Metodo calcular la longitud de la recta
    public int longitudRecta(Recta recta){
        int longitud=((recta.getFin().getX())-recta.getInicio().getX());
        return this.longitud=longitud;
    }

    public double pendiente(Recta recta){
        int InicioX=inicio.getX();
        int FinX=fin.getX();
        int InicioY=inicio.getY();
        int FinY=fin.getY();
        double pendiente=(InicioY-FinY)/(InicioX-FinX);
        return this.pendiente=pendiente;
    }

    @Override
    public String toString() {
        return "Recta{" +
                "inicio=" + inicio +
                ", fin=" + fin +
                ", longitud=" + longitud +
                ", pendiente=" + pendiente +
                '}';
    }
}

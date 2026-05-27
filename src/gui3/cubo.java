package gui3;

public class Cubo extends FiguraGeometrica{
    private int aristas=6;
    private double longitudArista=0;

    public Cubo( double longitudArista){
        this.longitudArista=longitudArista;
        this.setSuperficie(calcularSuperficie());
        this.setVolumen(calcularVolumen());
    }

    public double calcularSuperficie(){
        double superficie= aristas*Math.pow(longitudArista, 2.0);
        return superficie;
    }

    public double calcularVolumen(){
        double volumen= Math.pow(longitudArista, 3);
        return volumen;
    }

    @Override
    public String toString(){
        return super.toString()+"\n longitud de arista: "+longitudArista;
    }

}

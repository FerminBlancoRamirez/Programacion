package gui3;

public class Prisma extends FiguraGeometrica{
    private double largo=0.0;
    private double ancho=0.0;
    private double alto=0.0;

    public Prisma(double ancho, double largo, double alto){
        this.ancho=ancho;
        this.largo=largo;
        this.alto=alto;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        double volumen = ancho*alto;
        return volumen;
    }

    public double calcularSuperficie() {
       double areaLateral=ancho*alto;
       double areaTotal=areaLateral*2*ancho;
       return areaTotal;
    }

    public String toString(){
        return super.toString()+"\n ancho: "+ancho+"\n alto: "+alto+"\n largo: "+largo;
    }
}

package gui3;

public class prisma extends FiguraGeometrica{
    private double areaBase=0;
    private double altura=0;
    private double perimetroBase=0;

    public prisma(double areaBase, double altura, double perimetroBase){
        this.areaBase=areaBase;
        this.altura=altura;
        this.perimetroBase=perimetroBase;
        this.setSuperficie(calcularSuperficie());
        this.setVolumen(calcularVolumen());
    }

    public double calcularSuperficie(){
        double alturaLateral= perimetroBase*altura;
        double superficie=2*areaBase*alturaLateral;
        return superficie;
    }

    public double calcularVolumen(){
        double volumen=areaBase*altura;
        return volumen;
    }

    @Override
    public String toString(){
        return super.toString()+"\n area de la base: "+areaBase+"\n altura: "+altura+"\n perimetro de la base: "+perimetroBase;
    }
}

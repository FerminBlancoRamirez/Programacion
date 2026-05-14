package Carro;

public class Carro {
    protected int volumen=0;
    protected TipoChasis tipoChasis;
    protected TipoCarroceria tipoCarroceria;
    protected Chasis chasis;
    protected String color;
    protected String marca;
    protected int diametro=0;
    protected int altura=0;
    protected int anchura=0;
    protected Motor motor;
    protected Llanta llanta;
    protected Carroceria carroceria;
    protected Llanta[] llantas;

    public Carro(int volumen, TipoChasis
            tipoChasis, TipoCarroceria tipoCarroceria, String color
            , String marca, int diametro, int altura, int anchura) {
        this.volumen = volumen;
        this.tipoChasis = tipoChasis;
        this.tipoCarroceria = tipoCarroceria;
        chasis = new Chasis(tipoChasis);
        this.color = color;
        this.marca = marca;
        this.diametro = diametro;
        this.altura = altura;
        this.anchura = anchura;
        motor=new Motor(volumen);
        llantas = new Llanta[4]; // Crea un array de 4 llantas
        for (int i = 0; i < llantas.length; i++) {
            // Crea cada una de las cuatro llantas de un automóvil
            llantas[i] = new Llanta(marca,diametro,altura,anchura);
        }
        carroceria=new Carroceria(color, tipoCarroceria);
    }

    @Override
    public String toString() {
        return "Carro{\n" +
                "carroceria=" + carroceria +"\n"+
                ", llanta=" + llantas +"\n"+
                ", motor=" + motor +"\n"+
                ", chasis=" + chasis +"\n"+
                '}';
    }
}

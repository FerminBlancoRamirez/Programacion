package Carro;

public class Llanta {
    private String marca;
    private int diametroTin=0;
    private int altura=0;
    private int anchura=0;

    public Llanta(String marca, int diametroTin,
                  int altura, int anchura) {
        this.marca = marca;
        this.diametroTin = diametroTin;
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "Llanta{" +
                "marca='" + marca + '\'' +
                ", diametroTin=" + diametroTin +
                ", altura=" + altura +
                ", anchura=" + anchura +
                '}';
    }
}

package Carro;

public class Motor {
    private int volumen=0;

    public Motor(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "volumen=" + volumen +
                '}';
    }
}

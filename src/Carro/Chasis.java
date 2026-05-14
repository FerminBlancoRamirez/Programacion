package Carro;

public class Chasis {
    private TipoChasis tipoChasis;

    public Chasis(TipoChasis tipoChasis) {
        this.tipoChasis = tipoChasis;
    }

    @Override
    public String toString() {
        return "Chasis{" +
                "tipoChasis=" + tipoChasis +
                '}';
    }
}

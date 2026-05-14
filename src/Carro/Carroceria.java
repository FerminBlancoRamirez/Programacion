package Carro;

public class Carroceria {
    private String color;
    private TipoCarroceria tipoCarroceria;

    public Carroceria(String color,
                      TipoCarroceria tipoCarroceria) {
        this.color = color;
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        return "Carroceria{" +
                "color='" + color + '\'' +
                ", tipoCarroceria=" + tipoCarroceria +
                '}';
    }
}

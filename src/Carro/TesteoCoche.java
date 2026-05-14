package Carro;

public class TesteoCoche {
    static void main(String[] args) {

        Carro carricoche = new Carro(250, TipoChasis.Independiente, TipoCarroceria.tubular, "Azul",
                "Renault", 55, 250, 250);
        System.out.println(carricoche);
    }
}

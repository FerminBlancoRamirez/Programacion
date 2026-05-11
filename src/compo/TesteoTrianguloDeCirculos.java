package compo;

public class TesteoTrianguloDeCirculos {
    static void main(String[] args) {
        Triangulo triangulo=new Triangulo(new Punto(0, 3), new Punto(6, 3),
                new Punto(3, 6));

        triangulo.imprimir();
    }
}

package compo;

public class TesteoCompo {
    static void main(String[] args) {
        Circulo circulo1=new Circulo(9, 6, 9);
        Circulo circulo2=new Circulo(10, 4, 7);

        Punto punto1=circulo1.getCentro();
        Punto punto2=circulo2.getCentro();
        System.out.println("El centro de circulo1 esta en: "+punto1.toString());
        System.out.println("El centro de circulo2 esta en: "+punto2.toString());

        circulo1.imprimir();
        circulo2.imprimir();
    }
}

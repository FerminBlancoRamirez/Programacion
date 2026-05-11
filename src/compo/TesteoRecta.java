package compo;

public class TesteoRecta {
    static void main(String[] args) {
        Recta recta=new Recta(new Punto(3, 4), new Punto(9, 5));

        recta.longitudRecta(recta);
        System.out.println(recta.pendiente(recta));

        System.out.println(recta);
    }
}

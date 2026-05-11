package compo;

public class Triangulo {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    Triangulo(Punto vertice1, Punto vertice2, Punto vertice3){
        this.vertice1 = vertice1;
        this.vertice2 =vertice2;
        this.vertice3 = vertice3;
    }

    //Getters y setters
    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }

    public void imprimir(){
        System.out.println("El vertice 1 esta en las cordenadas: "+ vertice1.toString());
        System.out.println("El vertice 2 esta en las cordenadas: "+ vertice2.toString());
        System.out.println("El vertice 3 esta en las cordenadas: "+ vertice3.toString());
    }
}

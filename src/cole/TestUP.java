package cole;

public class TestUP {
    static void main(String[] args) {
        //1.Upcasting
        Persona p1=new Estudiante("Carlos", "Avenida Beiramar 12",
                "Sistemas", 4);
        Persona p2=new Profesor("DRA. Maria Garcia", "Avenida Madrid 12",
                "Naturales", "Ciencias");

        if (p1 instanceof Estudiante) {
            System.out.println("Carrera "+((Estudiante) p1).getCarrera());
        }

        if (p2 instanceof Profesor){
            System.out.println("Categoria "+((Profesor) p2).getCategoria());
        }

    }
}

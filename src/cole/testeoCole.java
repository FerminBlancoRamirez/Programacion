package cole;
public class testeoCole{
    static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "Avenida de madrid 12", "1ºIngenieria de Software",
                2);
        Profesor profesor = new Profesor("Rodrigo", "Calle coruña 12", "Ingenieria", "Informatica");
        System.out.println(estudiante);
        System.out.println(profesor);
    }
}
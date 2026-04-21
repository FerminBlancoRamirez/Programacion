package cole;

public class Testeo3 {
    static void main(String[] args) {
        //1. UPCASTING (automatico): Guardamos un estudiante en una variable tipo Persona visto ayer
        Persona p=new Estudiante("Alvaro Villaverde", "Sanxenxo 12", "DAM", 3);

        //p.getCarrera(); //Error: Persona no tiene el metodo getCarrera() (es especifico de estudiante)

        //2. DOWNCASTING (Manual o Forzado): Convertimos la Persona 'p' a Estudiante
        if (p instanceof Estudiante){
            Estudiante e= (Estudiante) p;//Este es el downcasting
            //ahora si podemos acceder a los metodos
            System.out.println("Carrera recuperada "+e.getCarrera());
            System.out.println("Semestre "+e.getSemestre());
        }

        //3. Otro ejemplo con Profesor
        Persona p2=new Profesor("Ana", "Av central", "Fisica", "Titular");

        if (p2 instanceof Profesor){
            Profesor profesor= (Profesor) p2;
            System.out.println("Departamento "+ profesor.getDepartamento());
            System.out.println("Categoria "+profesor.getCategoria());
        }

        //4. A veces nos podemos equivocar

        //intento meter a p que es una referencia persona en una referencia profesor
        Profesor malo=(Profesor) p; //me deja
        System.out.println("Departamento "+ malo.getDepartamento()); //pero falla

        //intentamos meter a p2 que es una referencia persona a una referencia a Estudiante
        Estudiante bueno=(Estudiante) p2; //me deja
        System.out.println("Semestre "+bueno.getSemestre()); //Falla

        //!!!!!!!!!!!!! POR ESO SE USA ANTES DE HACER EL DOWNCASTING EL OPERADOR INSTANCEOF

    }
}

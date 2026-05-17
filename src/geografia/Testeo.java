package geografia;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Testeo {
    public static void main(String[] args) {
        ArrayList<Municipio> municipios=new ArrayList<>();
        Departamento Pontevedra=new Departamento("Pontevedra", municipios);
        //Introduccion de Municipios en la coleccion
        Pontevedra.agregarMunicipio(new Municipio("Agolada", 2252, 11.5, 615.0));
        Pontevedra.agregarMunicipio(new Municipio("Arbo", 2576, 14.2, 175.0));
        Pontevedra.agregarMunicipio(new Municipio("Baiona", 12349, 14.8, 15.0));
        Pontevedra.agregarMunicipio(new Municipio("Barro", 3622, 13.5, 45.0));
        Pontevedra.agregarMunicipio(new Municipio("Bueu", 11954, 14.5, 12.0));
        Pontevedra.agregarMunicipio(new Municipio("Caldas de Reis", 9775, 14.0, 32.0));
        Pontevedra.agregarMunicipio(new Municipio("Cambados", 13671, 14.5, 10.0));
        Pontevedra.agregarMunicipio(new Municipio("Campo Lameiro", 1721, 12.5, 340.0));
        Pontevedra.agregarMunicipio(new Municipio("Cangas", 26567, 14.7, 15.0));
        Pontevedra.agregarMunicipio(new Municipio("Catoira", 3290, 14.0, 20.0));
        Pontevedra.agregarMunicipio(new Municipio("Cerdedo-Cotobade", 5697, 12.0, 360.0));
        Pontevedra.agregarMunicipio(new Municipio("Covelo", 2417, 11.8, 390.0));
        Pontevedra.agregarMunicipio(new Municipio("Crecente", 1937, 13.5, 290.0));
        Pontevedra.agregarMunicipio(new Municipio("Cuntis", 4594, 13.2, 150.0));
        Pontevedra.agregarMunicipio(new Municipio("Dozón", 1028, 10.5, 710.0));
        Pontevedra.agregarMunicipio(new Municipio("A Estrada", 20081, 12.5, 295.0));
        Pontevedra.agregarMunicipio(new Municipio("Forcarei", 3302, 11.0, 625.0));
        Pontevedra.agregarMunicipio(new Municipio("Fornelos de Montes", 1598, 12.2, 420.0));
        Pontevedra.agregarMunicipio(new Municipio("Gondomar", 14970, 14.5, 45.0));
        Pontevedra.agregarMunicipio(new Municipio("O Grove", 10809, 14.8, 10.0));
        Pontevedra.agregarMunicipio(new Municipio("A Guarda", 9998, 14.7, 20.0));
        Pontevedra.agregarMunicipio(new Municipio("A Illa de Arousa", 4878, 14.8, 9.0));
        Pontevedra.agregarMunicipio(new Municipio("Lalín", 20218, 11.2, 545.0));
        Pontevedra.agregarMunicipio(new Municipio("A Lama", 2499, 12.0, 475.0));
        Pontevedra.agregarMunicipio(new Municipio("Marín", 24034, 14.5, 15.0));
        Pontevedra.agregarMunicipio(new Municipio("Meis", 4735, 13.8, 110.0));
        Pontevedra.agregarMunicipio(new Municipio("Meaño", 5293, 14.0, 60.0));
        Pontevedra.agregarMunicipio(new Municipio("Moaña", 19474, 14.6, 20.0));
        Pontevedra.agregarMunicipio(new Municipio("Mondariz", 4444, 13.5, 120.0));
        Pontevedra.agregarMunicipio(new Municipio("Mondariz-Balneario", 680, 13.8, 85.0));
        Pontevedra.agregarMunicipio(new Municipio("Moraña", 4147, 13.0, 190.0));
        Pontevedra.agregarMunicipio(new Municipio("Mos", 15240, 14.0, 140.0));
        Pontevedra.agregarMunicipio(new Municipio("As Neves", 3803, 13.8, 160.0));
        Pontevedra.agregarMunicipio(new Municipio("Nigrán", 18005, 14.7, 35.0));
        Pontevedra.agregarMunicipio(new Municipio("Oia", 3010, 14.5, 40.0));
        Pontevedra.agregarMunicipio(new Municipio("Pazos de Borbén", 2965, 12.8, 260.0));
        Pontevedra.agregarMunicipio(new Municipio("Poio", 17276, 14.5, 30.0));
        Pontevedra.agregarMunicipio(new Municipio("Ponte Caldelas", 5533, 13.0, 250.0));
        Pontevedra.agregarMunicipio(new Municipio("Ponteareas", 22940, 14.0, 50.0));
        Pontevedra.agregarMunicipio(new Municipio("Pontecesures", 3053, 14.2, 15.0));
        Pontevedra.agregarMunicipio(new Municipio("Pontevedra", 82828, 14.8, 20.0));
        Pontevedra.agregarMunicipio(new Municipio("O Porriño", 20418, 14.2, 30.0));
        Pontevedra.agregarMunicipio(new Municipio("Portas", 2906, 13.8, 42.0));
        Pontevedra.agregarMunicipio(new Municipio("Redondela", 29218, 14.6, 18.0));
        Pontevedra.agregarMunicipio(new Municipio("Ribadumia", 5105, 14.2, 40.0));
        Pontevedra.agregarMunicipio(new Municipio("Rodeiro", 2317, 10.8, 640.0));
        Pontevedra.agregarMunicipio(new Municipio("O Rosal", 6328, 14.5, 45.0));
        Pontevedra.agregarMunicipio(new Municipio("Salceda de Caselas", 9380, 14.0, 65.0));
        Pontevedra.agregarMunicipio(new Municipio("Salvaterra de Miño", 10079, 14.2, 40.0));
        Pontevedra.agregarMunicipio(new Municipio("Sanxenxo", 17454, 14.9, 12.0));
        Pontevedra.agregarMunicipio(new Municipio("Silleda", 8681, 11.8, 520.0));
        Pontevedra.agregarMunicipio(new Municipio("Soutomaior", 7474, 14.4, 60.0));
        Pontevedra.agregarMunicipio(new Municipio("Tomiño", 13779, 14.4, 55.0));
        Pontevedra.agregarMunicipio(new Municipio("Tui", 17304, 14.5, 44.0));
        Pontevedra.agregarMunicipio(new Municipio("Valga", 5752, 14.0, 35.0));
        Pontevedra.agregarMunicipio(new Municipio("Vigo", 292374, 14.7, 25.0));
        Pontevedra.agregarMunicipio(new Municipio("Vila de Cruces", 5208, 11.5, 440.0));
        Pontevedra.agregarMunicipio(new Municipio("Vilaboa", 5919, 14.2, 35.0));
        Pontevedra.agregarMunicipio(new Municipio("Vilagarcía de Arousa", 37677, 14.6, 12.0));
        Pontevedra.agregarMunicipio(new Municipio("Vilanova de Arousa", 10240, 14.5, 15.0));
        Pontevedra.agregarMunicipio(new Municipio("Portas", 2906, 13.8, 42.0));

        //Metodos
        System.out.println("Los datos del municipio que buscas son: ");
        Pontevedra.buscarMunicipio("Redondela");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Los municipios que tienen mas poblacion que la que pones son: ");
        Pontevedra.buscarMunicipioConPoblaciónMayor(20000);
        System.out.println("-----------------------------------------------------------");
        System.out.println("El censo de la poblacion es: "+Pontevedra.calcularCensoPoblaciónDepartamento());

    }
}

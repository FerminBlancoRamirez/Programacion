package competicion;

public class TestPF {
    static void main(String[] args) {
        PartidoFutbolLigaEspañola partido=new PartidoFutbolLigaEspañola("Real Madrid",
                "Barcelona", 0, 5);
        partido.setEquipoLocal("Real Madrid");
        partido.setEquipoVisitante("Barcelona");
        partido.SetGolesEquipoLocal(0);
        partido.SetGolesEquipoVisitante(5);
        partido.imprimirMarcador();
    }
}

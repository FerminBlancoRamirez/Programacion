package medicina;

import java.util.ArrayList;

public class Testeo1 {
    static void main(String[] args) {
        Pediatra pediatra1=new Pediatra("Carlos", Pediatra.Tipologia.NEUROLOGO);
        Pediatra pediatra2=new Pediatra("Carlos", Pediatra.Tipologia.PSICOLOGO);
        Ortopedista ortopedista1=new Ortopedista("Juan", Ortopedista.Tipologia.MAXILOFACIAL);
        Ortopedista ortopedista2=new Ortopedista("Juan", Ortopedista.Tipologia.PEDIATRICA);

        ArrayList<Medico> medicos=new ArrayList<>();
        medicos.add(pediatra1);
        medicos.add(pediatra2);
        medicos.add(ortopedista1);
        medicos.add(ortopedista2);
        
        for (Medico plantel: medicos){
            if (plantel instanceof Ortopedista){
                Ortopedista ortopedista=(Ortopedista) plantel;
                if (ortopedista.getTipologia()== Ortopedista.Tipologia.MAXILOFACIAL){
                    System.out.println(ortopedista.getNombre()+" es un ortopedista maxilofacial");
                }else {
                    System.out.println(ortopedista.getNombre()+" es un ortopedista pediatrico");
                }
            }else {
                Pediatra pediatra=(Pediatra) plantel;
                if (pediatra.getTipologia()== Pediatra.Tipologia.NEUROLOGO){
                    System.out.println(pediatra.getNombre()+" es un pediatra especializado en neurologia");
                }else {
                    System.out.println(pediatra.getNombre()+" es un pediatra especializado en psicologia");
                }
            }
        }
    }
}

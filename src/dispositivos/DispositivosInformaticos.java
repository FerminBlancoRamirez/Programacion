package dispositivos;

public class DispositivosInformaticos {
    String marca ="Acer";
    DispositivosInformaticos(){
        System.out.println("Marca= "+marca);
    }

    @Override
    public String toString(){
        return "DispositivosInformaticos [marca="+marca+"]";
    }
}

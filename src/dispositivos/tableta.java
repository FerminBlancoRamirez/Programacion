package dispositivos;

public class tableta extends DispositivosInformaticos{
    public tableta(String marca){
        System.out.println("Marca= "+ marca);
    }
    @Override
    public String toString(){
        return "Tableta [marca="+marca+"]";
    }
}

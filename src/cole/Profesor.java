package cole;

public class Profesor extends Persona{
    private String departamento;
    private String categoria;

    public Profesor(String nombre, String direccion, String departamento, String categoria){
        super(nombre, direccion);
        this.departamento=departamento;
        this.categoria=categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                ", categoria='" + categoria + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

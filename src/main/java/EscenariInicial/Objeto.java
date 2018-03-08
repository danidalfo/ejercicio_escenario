package EscenariInicial;

public class Objeto {

    private String nombre;
    private String tipo;

    public Objeto(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Objeto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

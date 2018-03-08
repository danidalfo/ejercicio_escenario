package EscenariInicial;

public class escenario {

    private int ancho;
    private int alto;
    private String nombre;
    private celda [] [] matrizCeldas;
    private String descripcion;

    public escenario(int ancho, int alto, String nombre) {
        this.ancho = ancho;
        this.alto = alto;
        this.nombre = nombre;
    }

    public escenario(int ancho, int alto, String nombre, celda[][] matrizCeldas, String descripcion) {
        this.ancho = ancho;
        this.alto = alto;
        this.nombre = nombre;
        this.matrizCeldas = matrizCeldas;
        this.descripcion = descripcion;
    }
}

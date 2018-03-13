package EscenariInicial;

import java.util.Vector;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    Vector<Objeto> objetos;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        objetos = new Vector<Objeto>();
        this.email = email;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        objetos = new Vector<Objeto>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vector<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(Vector<Objeto> objetos) {
        this.objetos = objetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean addObjeto(Objeto o)
    {
        if(o!=null)
        {
            objetos.add(o);
            return true;
        }
        return false;
    }
}

package EscenariInicial;

import java.util.HashMap;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Mundo {

    HashMap<String,Usuario> usuarios;

    private static Mundo mon;

    private static final Logger logger = LogManager.getLogger(Mundo.class.getName());

    private Mundo() {
        this.usuarios = new HashMap<String, Usuario>();
    }

    public static Mundo getInstance() {
        if (mon == null)
            mon = new Mundo();
        return mon;
    }

    public Usuario getUsuario(String nombre) {

        return usuarios.get(nombre);
    }

    public boolean addUsuario(Usuario usuario) {
        if(usuario==null) {
            logger.error("addUsuario: usuario vacio");
            return false;
        }
        Usuario t = usuarios.put(usuario.getNombre(),usuario);
        if(t!=null) {
            logger.error("addUsuario: usuario ya existente");
            return false;
        }
        logger.info("addUsuario:"+usuario);
        return true;
    }
}

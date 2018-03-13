package EscenariInicial;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/json")
public class Json {

    Mundo mon;

    public Json () { this.mon = Mundo.getInstance(); }

    @GET
    @Path("/get/usuario/{nom}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getUsuario(@PathParam("nom") String  nom) {
        return mon.getUsuario(nom);
    }

    @POST
    @Path("/addUsuario/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUsuario(Usuario usuario)
    {
        if(mon.addUsuario(usuario))
            return Response.status(201).entity("{\"result\":\"Añadir usuario\"}").type(MediaType.APPLICATION_JSON).build();

        return Response.status(409).entity("{\"result\":\"usuario ya existente\"}").type(MediaType.APPLICATION_JSON).build();
    }

}
